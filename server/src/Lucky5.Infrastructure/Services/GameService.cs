namespace Lucky5.Infrastructure.Services;

using Lucky5.Application.Contracts;
using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;
using Lucky5.Domain.Entities;
using Lucky5.Domain.Game.CleanRoom;

public sealed class GameService(InMemoryDataStore store, IEntropyGenerator entropyGenerator) : IGameService
{
    private static readonly object LedgerLock = new();

    private static readonly Dictionary<string, decimal> Rules = new(StringComparer.OrdinalIgnoreCase)
    {
        ["RoyalFlush"] = 1000,
        ["StraightFlush"] = 75,
        ["FourOfAKind"] = 15,
        ["FullHouse"] = 12,
        ["Flush"] = 10,
        ["Straight"] = 8,
        ["ThreeOfAKind"] = 3,
        ["TwoPair"] = 2
    };

    public Task<IReadOnlyList<string>> GetGamesAsync(CancellationToken cancellationToken)
        => Task.FromResult<IReadOnlyList<string>>(["Lucky5", "VideoPoker"]);

    public Task<IReadOnlyList<MachineListingDto>> GetMachinesAsync(CancellationToken cancellationToken)
        => Task.FromResult<IReadOnlyList<MachineListingDto>>(store.Machines.Select(x => new MachineListingDto(x.Id, x.Name, x.IsOpen, x.MinBet, x.MaxBet)).ToArray());

    public Task<DefaultRulesDto> GetDefaultRulesAsync(CancellationToken cancellationToken)
        => Task.FromResult(new DefaultRulesDto(new Dictionary<string, decimal>(Rules)));

    public Task<IReadOnlyList<OfferDto>> GetOffersAsync(CancellationToken cancellationToken)
        => Task.FromResult<IReadOnlyList<OfferDto>>(store.Offers.Select(x => new OfferDto(x.Id, x.Title, x.Description, x.BonusAmount)).ToArray());

    public Task<DealResultDto> DealAsync(Guid userId, DealRequest request, CancellationToken cancellationToken)
    {
        var profile = RequireProfile(userId);
        var machine = RequireMachine(request.MachineId);
        if (request.BetAmount <= 0 || request.BetAmount < machine.MinBet || request.BetAmount > machine.MaxBet)
        {
            throw new InvalidOperationException("Bet amount is outside machine limits");
        }

        if (profile.WalletBalance < request.BetAmount)
        {
            throw new InvalidOperationException("Insufficient balance");
        }

        ulong seed;
        PolicyDistributionMode policyMode;
        MachinePolicyState policyState;
        lock (LedgerLock)
        {
            var ledger = RequireMachineLedger(machine.Id);
            seed = entropyGenerator.CreateSeed(userId, machine.Id, request.BetAmount, ledger);
            policyState = new MachinePolicyState
            {
                CreditsIn = ledger.CapitalIn,
                CreditsOut = ledger.CapitalOut,
                BaseCreditsOut = ledger.BaseCapitalOut,
                TargetRtp = ledger.TargetRtp,
                RoundCount = ledger.RoundCount,
                ConsecutiveLosses = ledger.ConsecutiveLosses,
                RoundsSinceMediumWin = ledger.RoundsSinceMediumWin,
                CooldownRoundsRemaining = ledger.CooldownRoundsRemaining
            };
            policyMode = MachinePolicy.ResolveDistributionMode(policyState, seed);
            ledger.CapitalIn += request.BetAmount;
            ledger.RoundCount++;
            ledger.RoundsSinceMediumWin++;
            if (ledger.CooldownRoundsRemaining > 0) ledger.CooldownRoundsRemaining--;
            ledger.LastRoundUtc = DateTime.UtcNow;
            ledger.LastDistributionMode = policyMode switch
            {
                PolicyDistributionMode.Cold => DistributionMode.Cold,
                PolicyDistributionMode.Hot => DistributionMode.Hot,
                _ => DistributionMode.Neutral
            };

            var jackpotContribution = request.BetAmount * 0.01m;
            var bucket1 = decimal.Floor(jackpotContribution / 3m * 100m) / 100m;
            var bucket2 = bucket1;
            var bucket3 = jackpotContribution - bucket1 - bucket2;

            ledger.ActiveFourOfAKindSlot = (ledger.RoundCount % 2 == 0)
                ? (int)(seed % 2)
                : 1 - (int)(seed % 2);
            if (ledger.ActiveFourOfAKindSlot == 0)
                ledger.JackpotFourOfAKindA = Math.Min(ledger.JackpotFourOfAKindA + bucket1, 999_999);
            else
                ledger.JackpotFourOfAKindB = Math.Min(ledger.JackpotFourOfAKindB + bucket1, 999_999);

            ledger.JackpotFullHouse += bucket2;
            ledger.JackpotStraightFlush = Math.Min(ledger.JackpotStraightFlush + bucket3, 20_000_000);
        }

        var standardDeck = FiveCardDrawEngine.BuildStandardDeck();
        var alteredDeck = MachinePolicy.AlterDeck(standardDeck, policyMode, seed, policyState.ConsecutiveLosses);
        var shuffledDeck = FiveCardDrawEngine.ShuffleDeck(seed, "hand", alteredDeck);
        var hand = shuffledDeck.Take(5).ToArray();
        var drawState = FiveCardDrawState.Create(seed, shuffledDeck, hand);

        profile.WalletBalance -= request.BetAmount;

        var cards = hand.Select(c => c.ToLegacyPokerCard()).ToList();
        int active4kSlot;
        lock (LedgerLock)
        {
            active4kSlot = RequireMachineLedger(request.MachineId).ActiveFourOfAKindSlot;
        }

        var round = new GameRound
        {
            UserId = userId,
            MachineId = request.MachineId,
            BetAmount = request.BetAmount,
            InitialCards = cards,
            FinalCards = cards,
            PolicyMode = policyMode,
            RoundEntropySeed = seed,
            CleanRoomState = drawState,
            ActiveFourOfAKindSlotAtDeal = active4kSlot
        };

        store.ActiveRounds[round.RoundId] = round;
        store.Ledger.Add(new WalletLedgerEntry
        {
            UserId = userId,
            Amount = -request.BetAmount,
            BalanceAfter = profile.WalletBalance,
            Type = "Bet",
            Reference = round.RoundId.ToString("N")
        });

        JackpotInfoDto jackpots;
        lock (LedgerLock)
        {
            var ledgerSnap = RequireMachineLedger(machine.Id);
            jackpots = SnapshotJackpots(ledgerSnap);
        }

        var advisedHolds = FiveCardDrawEngine.ComputeAdvisedHolds(hand);

        return Task.FromResult(new DealResultDto(round.RoundId, cards.Select(ToDto).ToArray(), request.BetAmount, profile.WalletBalance, jackpots, advisedHolds));
    }

    public Task<DrawResultDto> DrawAsync(Guid userId, DrawRequest request, CancellationToken cancellationToken)
    {
        if (!store.ActiveRounds.TryGetValue(request.RoundId, out var round) || round.UserId != userId)
        {
            throw new KeyNotFoundException("Round not found");
        }

        if (round.IsCompleted)
        {
            throw new InvalidOperationException("Round already completed");
        }

        if (round.CleanRoomState is null)
        {
            throw new InvalidOperationException("Clean-room state not initialized");
        }

        if (round.CleanRoomState.Phase != RoundPhase.Dealt)
        {
            throw new InvalidOperationException("Draw already completed for this round");
        }

        var profile = RequireProfile(userId);

        if (profile.WalletBalance < round.BetAmount)
        {
            throw new InvalidOperationException("Not enough credits for draw");
        }

        profile.WalletBalance -= round.BetAmount;
        lock (LedgerLock)
        {
            var ledger = RequireMachineLedger(round.MachineId);
            ledger.CapitalIn += round.BetAmount;

            var jackpotContribution = round.BetAmount * 0.01m;
            var bucket1 = decimal.Floor(jackpotContribution / 3m * 100m) / 100m;
            var bucket2 = bucket1;
            var bucket3 = jackpotContribution - bucket1 - bucket2;

            if (ledger.ActiveFourOfAKindSlot == 0)
                ledger.JackpotFourOfAKindA = Math.Min(ledger.JackpotFourOfAKindA + bucket1, 999_999);
            else
                ledger.JackpotFourOfAKindB = Math.Min(ledger.JackpotFourOfAKindB + bucket1, 999_999);

            ledger.JackpotFullHouse += bucket2;
            ledger.JackpotStraightFlush = Math.Min(ledger.JackpotStraightFlush + bucket3, 20_000_000);
        }

        store.Ledger.Add(new WalletLedgerEntry
        {
            UserId = userId,
            Amount = -round.BetAmount,
            BalanceAfter = profile.WalletBalance,
            Type = "DrawBet",
            Reference = round.RoundId.ToString("N")
        });

        var holdMask = new bool[5];
        foreach (var idx in request.HoldIndexes)
        {
            if (idx >= 0 && idx < 5)
            {
                holdMask[idx] = true;
            }
        }

        var state = FiveCardDrawEngine.Reduce(
            round.CleanRoomState,
            new RoundAction(RoundActionKind.SetHoldMask, HoldMask: holdMask));

        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.Draw));

        var evaluation = FiveCardDrawEngine.EvaluateHand(state.Hand);
        var basePayout = FiveCardDrawEngine.ResolvePayout(evaluation, (int)round.BetAmount);

        decimal payoutScale;
        lock (LedgerLock)
        {
            var ledgerForScale = RequireMachineLedger(round.MachineId);
            var scaleState = new MachinePolicyState
            {
                CreditsIn = ledgerForScale.CapitalIn,
                CreditsOut = ledgerForScale.CapitalOut,
                BaseCreditsOut = ledgerForScale.BaseCapitalOut,
                TargetRtp = ledgerForScale.TargetRtp,
                RoundCount = ledgerForScale.RoundCount,
                ConsecutiveLosses = ledgerForScale.ConsecutiveLosses,
                RoundsSinceMediumWin = ledgerForScale.RoundsSinceMediumWin,
                CooldownRoundsRemaining = ledgerForScale.CooldownRoundsRemaining
            };
            var scaleResult = MachinePolicy.ResolvePayoutScale(scaleState, round.RoundEntropySeed);
            var tier = MachinePolicy.ClassifyHand(evaluation.Category);
            payoutScale = scaleResult.ForTier(tier);
            ledgerForScale.LastPayoutScale = payoutScale;
        }

        var payout = basePayout > 0 ? (int)Math.Round(basePayout * payoutScale, MidpointRounding.AwayFromZero) : 0;

        var handRankName = MapHandCategory(evaluation);
        var finalCards = state.Hand.Select(c => c.ToLegacyPokerCard()).ToList();

        round.FinalCards = finalCards;
        round.HandRank = handRankName;
        round.WinAmount = payout;
        round.IsCompleted = true;
        round.CleanRoomState = state;
        round.DrawAttempts++;

        decimal jackpotWon = 0;

        if (payout > 0)
        {
            lock (LedgerLock)
            {
                var ledger = RequireMachineLedger(round.MachineId);
                ledger.CapitalOut += payout;
                ledger.BaseCapitalOut += basePayout;
                ledger.ConsecutiveLosses = 0;

                var tier = MachinePolicy.ClassifyHand(evaluation.Category);
                if (tier >= PayoutTier.Medium)
                {
                    ledger.RoundsSinceMediumWin = 0;
                }
                ledger.CooldownRoundsRemaining = MachinePolicy.ComputeCooldownLength(evaluation.Category, round.RoundEntropySeed);

                if (evaluation.Category == HandCategory.FullHouse && evaluation.Tiebreak[0] == ledger.JackpotFullHouseRank)
                {
                    jackpotWon = ledger.JackpotFullHouse;
                    ledger.JackpotFullHouse = 25_000_000;
                }
                else if (evaluation.Category == HandCategory.FourOfAKind)
                {
                    if (round.ActiveFourOfAKindSlotAtDeal == 0)
                    {
                        jackpotWon = ledger.JackpotFourOfAKindA;
                        ledger.JackpotFourOfAKindA = 200_000;
                    }
                    else
                    {
                        jackpotWon = ledger.JackpotFourOfAKindB;
                        ledger.JackpotFourOfAKindB = 200_000;
                    }
                }
                else if (evaluation.Category == HandCategory.StraightFlush)
                {
                    jackpotWon = ledger.JackpotStraightFlush;
                    ledger.JackpotStraightFlush = 5_000_000;
                }

                if (jackpotWon > 0)
                {
                    ledger.CapitalOut += jackpotWon;
                }
            }
        }
        else
        {
            lock (LedgerLock)
            {
                var ledger = RequireMachineLedger(round.MachineId);
                ledger.ConsecutiveLosses++;
            }
        }

        var totalWin = payout + jackpotWon;
        round.WinAmount = totalWin;
        profile.WalletBalance += totalWin;

        if (totalWin > 0)
        {
            store.Ledger.Add(new WalletLedgerEntry
            {
                UserId = userId,
                Amount = totalWin,
                BalanceAfter = profile.WalletBalance,
                Type = jackpotWon > 0 ? "JackpotWin" : "Win",
                Reference = round.RoundId.ToString("N")
            });
        }

        JackpotInfoDto jackpots;
        lock (LedgerLock)
        {
            var ledgerSnap = RequireMachineLedger(round.MachineId);
            jackpots = SnapshotJackpots(ledgerSnap);
        }

        return Task.FromResult(new DrawResultDto(round.RoundId, finalCards.Select(ToDto).ToArray(), handRankName, totalWin, profile.WalletBalance, jackpotWon, jackpots));
    }

    public Task<RewardStatusDto> DoubleUpAsync(Guid userId, DoubleUpRequest request, CancellationToken cancellationToken)
    {
        var result = GuessDoubleUpAsync(userId, request.RoundId, request.Guess, cancellationToken).Result;
        var status = result.Status switch
        {
            "Win" => "Won",
            "SafeFail" => "Won",
            "MachineClosed" => "Won",
            _ => "Lost"
        };
        var card = result.ChallengerCard;
        return Task.FromResult(new RewardStatusDto(request.RoundId, status, result.CurrentAmount, result.WalletBalance, card));
    }

    public Task<DoubleUpResultDto> StartDoubleUpAsync(Guid userId, Guid roundId, CancellationToken cancellationToken)
    {
        if (!store.ActiveRounds.TryGetValue(roundId, out var round) || round.UserId != userId)
        {
            throw new KeyNotFoundException("Round not found");
        }

        if (!round.IsCompleted || round.WinAmount <= 0)
        {
            throw new InvalidOperationException("No win to double up");
        }

        var profile = RequireProfile(userId);
        var machineCreditBaseline = (int)Math.Min(profile.WalletBalance, int.MaxValue);

        var alteredDeck = FiveCardDrawEngine.BuildStandardDeck();
        if (round.PolicyMode == PolicyDistributionMode.Cold)
        {
            alteredDeck = MachinePolicy.AlterDeck(alteredDeck, PolicyDistributionMode.Cold, round.RoundEntropySeed);
        }

        var session = Lucky5DoubleUpEngine.CreateSessionFromDeck(
            round.RoundEntropySeed,
            FiveCardDrawEngine.ShuffleDeck(round.RoundEntropySeed, "double-up", alteredDeck),
            (int)round.WinAmount,
            machineCreditBaseline);

        round.DoubleUpSession = session;
        round.EnteredDoubleUp = true;

        var noise = GenerateNoise(round.RoundEntropySeed, 0);

        return Task.FromResult(new DoubleUpResultDto(
            roundId,
            "Started",
            session.CurrentAmount,
            profile.WalletBalance,
            DealerCard: ToCleanRoomDto(session.DealerCard),
            SwitchesRemaining: session.Options.MaxSwitchesPerRound - session.SwitchCountInRound,
            IsNoLoseActive: session.IsNoLoseActive,
            Noise: noise));
    }

    public Task<DoubleUpResultDto> SwitchDealerAsync(Guid userId, Guid roundId, CancellationToken cancellationToken)
    {
        if (!store.ActiveRounds.TryGetValue(roundId, out var round) || round.UserId != userId)
        {
            throw new KeyNotFoundException("Round not found");
        }

        if (round.DoubleUpSession is null)
        {
            throw new InvalidOperationException("Double-up session not started");
        }

        var session = Lucky5DoubleUpEngine.SwitchDealer(round.DoubleUpSession);
        round.DoubleUpSession = session;

        var isLucky = session.DealerCard.Rank == 5 && session.DealerCard.Suit == 'S';
        var luckyMult = 0;
        if (isLucky)
        {
            luckyMult = session.LuckyHitCount == 1
                ? session.Options.FirstLuckyMultiplier
                : session.Options.RepeatLuckyMultiplier;
        }

        var profile = RequireProfile(userId);
        var noise = GenerateNoise(round.RoundEntropySeed, session.CurrentRoundIndex);

        if (session.IsTerminal && session.TerminalOutcome == Lucky5DoubleUpOutcome.MachineClosed)
        {
            FinalizeDoubleUp(round, profile, session.CashoutCredits);
            return Task.FromResult(new DoubleUpResultDto(
                roundId,
                "MachineClosed",
                session.CashoutCredits,
                profile.WalletBalance,
                DealerCard: ToCleanRoomDto(session.DealerCard),
                SwitchesRemaining: 0,
                IsNoLoseActive: session.IsNoLoseActive,
                LuckyMultiplier: luckyMult,
                Noise: noise));
        }

        return Task.FromResult(new DoubleUpResultDto(
            roundId,
            isLucky ? "Lucky5" : "Switched",
            session.CurrentAmount,
            profile.WalletBalance,
            DealerCard: ToCleanRoomDto(session.DealerCard),
            SwitchesRemaining: session.Options.MaxSwitchesPerRound - session.SwitchCountInRound,
            IsNoLoseActive: session.IsNoLoseActive,
            LuckyMultiplier: luckyMult,
            Noise: noise));
    }

    public Task<DoubleUpResultDto> GuessDoubleUpAsync(Guid userId, Guid roundId, string guess, CancellationToken cancellationToken)
    {
        if (!store.ActiveRounds.TryGetValue(roundId, out var round) || round.UserId != userId)
        {
            throw new KeyNotFoundException("Round not found");
        }

        if (round.DoubleUpSession is null)
        {
            var startResult = StartDoubleUpAsync(userId, roundId, cancellationToken).Result;
            if (!store.ActiveRounds.TryGetValue(roundId, out round) || round.DoubleUpSession is null)
            {
                throw new InvalidOperationException("Failed to start double-up session");
            }
        }

        var parsedGuess = guess.Equals("big", StringComparison.OrdinalIgnoreCase)
            ? BigSmallGuess.Big
            : BigSmallGuess.Small;

        var resolution = Lucky5DoubleUpEngine.ResolveGuess(round.DoubleUpSession, parsedGuess);
        round.DoubleUpSession = resolution.Session;

        var profile = RequireProfile(userId);
        var noise = GenerateNoise(round.RoundEntropySeed, resolution.Session.CurrentRoundIndex);

        switch (resolution.Outcome)
        {
            case Lucky5DoubleUpOutcome.Win:
                return Task.FromResult(new DoubleUpResultDto(
                    roundId,
                    "Win",
                    resolution.NextAmount,
                    profile.WalletBalance,
                    DealerCard: ToCleanRoomDto(resolution.Session.DealerCard),
                    ChallengerCard: ToCleanRoomDto(resolution.ChallengerCard),
                    SwitchesRemaining: resolution.Session.Options.MaxSwitchesPerRound,
                    IsNoLoseActive: false,
                    Noise: noise));

            case Lucky5DoubleUpOutcome.SafeFail:
                FinalizeDoubleUp(round, profile, resolution.CashoutCredits);
                return Task.FromResult(new DoubleUpResultDto(
                    roundId,
                    "SafeFail",
                    resolution.CashoutCredits,
                    profile.WalletBalance,
                    DealerCard: ToCleanRoomDto(resolution.DealerCard),
                    ChallengerCard: ToCleanRoomDto(resolution.ChallengerCard),
                    SwitchesRemaining: 0,
                    IsNoLoseActive: false,
                    Noise: noise));

            case Lucky5DoubleUpOutcome.MachineClosed:
                FinalizeDoubleUp(round, profile, resolution.CashoutCredits);
                return Task.FromResult(new DoubleUpResultDto(
                    roundId,
                    "MachineClosed",
                    resolution.CashoutCredits,
                    profile.WalletBalance,
                    SwitchesRemaining: 0,
                    Noise: noise));

            default:
                FinalizeDoubleUp(round, profile, 0);
                round.WinAmount = 0;

                return Task.FromResult(new DoubleUpResultDto(
                    roundId,
                    "Lose",
                    0,
                    profile.WalletBalance,
                    DealerCard: ToCleanRoomDto(resolution.DealerCard),
                    ChallengerCard: ToCleanRoomDto(resolution.ChallengerCard),
                    SwitchesRemaining: 0,
                    Noise: noise));
        }
    }

    public Task<DoubleUpResultDto> CashoutDoubleUpAsync(Guid userId, Guid roundId, CancellationToken cancellationToken)
    {
        if (!store.ActiveRounds.TryGetValue(roundId, out var round) || round.UserId != userId)
        {
            throw new KeyNotFoundException("Round not found");
        }

        var profile = RequireProfile(userId);
        var cashoutAmount = round.DoubleUpSession != null ? round.DoubleUpSession.CurrentAmount : (int)round.WinAmount;

        if (round.DoubleUpSession != null && !round.DoubleUpSession.IsTerminal)
        {
            FinalizeDoubleUp(round, profile, cashoutAmount);
        }

        return Task.FromResult(new DoubleUpResultDto(
            roundId,
            "Cashout",
            cashoutAmount,
            profile.WalletBalance));
    }

    public Task<DoubleUpResultDto> TakeHalfAsync(Guid userId, Guid roundId, CancellationToken cancellationToken)
    {
        if (!store.ActiveRounds.TryGetValue(roundId, out var round) || round.UserId != userId)
        {
            throw new KeyNotFoundException("Round not found");
        }

        var profile = RequireProfile(userId);
        var currentAmount = round.DoubleUpSession != null ? round.DoubleUpSession.CurrentAmount : (int)round.WinAmount;

        if (currentAmount <= 1)
        {
            throw new InvalidOperationException("Amount too small to split");
        }

        var half = currentAmount / 2;
        var remaining = currentAmount - half;

        profile.WalletBalance += half;
        round.WinAmount = remaining;

        if (round.DoubleUpSession != null)
        {
            round.DoubleUpSession = round.DoubleUpSession with { CurrentAmount = remaining };
        }

        lock (LedgerLock)
        {
            var ledger = RequireMachineLedger(round.MachineId);
            ledger.CapitalOut += half;
        }

        store.Ledger.Add(new WalletLedgerEntry
        {
            UserId = userId,
            Amount = half,
            BalanceAfter = profile.WalletBalance,
            Type = "TakeHalf",
            Reference = round.RoundId.ToString("N")
        });

        return Task.FromResult(new DoubleUpResultDto(
            roundId,
            "TakeHalf",
            remaining,
            profile.WalletBalance));
    }

    public Task<JackpotInfoDto> ChangeJackpotRankAsync(int machineId, int rank, CancellationToken cancellationToken)
    {
        if (rank < 2 || rank > 14) throw new ArgumentException("Rank must be between 2 and 14");

        lock (LedgerLock)
        {
            var ledger = RequireMachineLedger(machineId);
            ledger.JackpotFullHouseRank = rank;
            return Task.FromResult(SnapshotJackpots(ledger));
        }
    }

    public Task<object> GetMachineStateAsync(int machineId, CancellationToken cancellationToken)
    {
        var activeRounds = store.ActiveRounds.Values.Count(x => x.MachineId == machineId && !x.IsCompleted);
        var ledger = RequireMachineLedger(machineId);
        return Task.FromResult<object>(new
        {
            machineId,
            activeRounds,
            observedRtp = ledger.ObservedRtp,
            targetRtp = ledger.TargetRtp,
            baseRtp = ledger.CapitalIn > 0 ? Math.Round(ledger.BaseCapitalOut / ledger.CapitalIn, 4) : 0,
            phase = ledger.LastDistributionMode.ToString(),
            lastPayoutScale = ledger.LastPayoutScale,
            consecutiveLosses = ledger.ConsecutiveLosses,
            roundsSinceMediumWin = ledger.RoundsSinceMediumWin,
            cooldownRemaining = ledger.CooldownRoundsRemaining,
            jackpots = new {
                fullHouse = ledger.JackpotFullHouse,
                fullHouseRank = ledger.JackpotFullHouseRank,
                fourOfAKindA = ledger.JackpotFourOfAKindA,
                fourOfAKindB = ledger.JackpotFourOfAKindB,
                activeFourOfAKindSlot = ledger.ActiveFourOfAKindSlot,
                straightFlush = ledger.JackpotStraightFlush
            },
            timestampUtc = DateTime.UtcNow
        });
    }

    public Task<object> ResetMachineAsync(Guid userId, int machineId, CancellationToken cancellationToken)
    {
        var profile = RequireProfile(userId);

        var roundsToRemove = store.ActiveRounds
            .Where(kvp => kvp.Value.UserId == userId)
            .Select(kvp => kvp.Key)
            .ToList();
        foreach (var rid in roundsToRemove)
        {
            store.ActiveRounds.Remove(rid);
        }

        profile.WalletBalance = 200_000;

        lock (LedgerLock)
        {
            var ledger = RequireMachineLedger(machineId);
            ledger.CapitalIn = 0;
            ledger.CapitalOut = 0;
            ledger.BaseCapitalOut = 0;
            ledger.RoundCount = 0;
            ledger.ConsecutiveLosses = 0;
            ledger.RoundsSinceMediumWin = 0;
            ledger.CooldownRoundsRemaining = 0;
            ledger.NetSinceLastClose = 0;
            ledger.LastCloseRoundNumber = 0;
            ledger.RoundsSinceLucky5Hit = 0;
            ledger.LastPayoutScale = 2.37m;
            ledger.LastDistributionMode = DistributionMode.Neutral;
            ledger.JackpotFullHouse = 25_000_000;
            ledger.JackpotFullHouseRank = 14;
            ledger.JackpotFourOfAKindA = 200_000;
            ledger.JackpotFourOfAKindB = 200_000;
            ledger.JackpotStraightFlush = 5_000_000;
        }

        return Task.FromResult<object>(new
        {
            success = true,
            walletBalance = profile.WalletBalance,
            message = "Machine and credits reset"
        });
    }

    private void FinalizeDoubleUp(GameRound round, MemberProfile profile, int cashoutCredits)
    {
        var previousWin = round.WinAmount;
        var walletDelta = cashoutCredits - previousWin;
        profile.WalletBalance += walletDelta;
        if (profile.WalletBalance < 0) profile.WalletBalance = 0;
        round.WinAmount = cashoutCredits;

        var ledgerDelta = cashoutCredits - previousWin;
        if (ledgerDelta != 0)
        {
            lock (LedgerLock)
            {
                var ledger = RequireMachineLedger(round.MachineId);
                ledger.CapitalOut += ledgerDelta;
            }
        }

        store.Ledger.Add(new WalletLedgerEntry
        {
            UserId = round.UserId,
            Amount = walletDelta,
            BalanceAfter = profile.WalletBalance,
            Type = cashoutCredits > 0 ? "DoubleUpCashout" : "DoubleUpLoss",
            Reference = round.RoundId.ToString("N")
        });
    }

    private static PresentationNoiseDto GenerateNoise(ulong seed, int roundIndex)
    {
        var noiseSeed = DeterministicSeed.Derive(seed, "noise", roundIndex);
        var rng = new SplitMix64Rng(noiseSeed);

        return new PresentationNoiseDto(
            SuspenseMs: 400 + rng.NextInt(800),
            RevealMs: 200 + rng.NextInt(400),
            FlipFrames: 8 + rng.NextInt(8),
            PulseFrames: 4 + rng.NextInt(6));
    }

    private static JackpotInfoDto SnapshotJackpots(MachineLedgerState l) =>
        new(l.JackpotFullHouse, l.JackpotFullHouseRank,
            l.JackpotFourOfAKindA, l.JackpotFourOfAKindB,
            l.ActiveFourOfAKindSlot, l.JackpotStraightFlush);

    private static PokerCardDto ToDto(PokerCard c) => new(c.Rank, c.Suit, c.Code);

    private static PokerCardDto ToCleanRoomDto(CleanRoomCard c)
    {
        var rank = CleanRoomCard.GetLegacyRank(c.Rank);
        var suit = c.Suit.ToString();
        return new PokerCardDto(rank, suit, $"{rank}{suit}");
    }

    private static string MapHandCategory(HandEvaluation eval)
    {
        return eval.Category switch
        {
            HandCategory.RoyalFlush => "RoyalFlush",
            HandCategory.StraightFlush => "StraightFlush",
            HandCategory.FourOfAKind => "FourOfAKind",
            HandCategory.FullHouse => "FullHouse",
            HandCategory.Flush => "Flush",
            HandCategory.Straight => "Straight",
            HandCategory.ThreeOfAKind => "ThreeOfAKind",
            HandCategory.TwoPair => "TwoPair",
            _ => "Nothing"
        };
    }

    private Machine RequireMachine(int machineId)
    {
        var machine = store.Machines.FirstOrDefault(m => m.Id == machineId && m.IsOpen);
        if (machine is null)
        {
            throw new KeyNotFoundException("Machine not found");
        }

        return machine;
    }

    private MachineLedgerState RequireMachineLedger(int machineId)
    {
        if (!store.MachineLedgers.TryGetValue(machineId, out var ledger))
        {
            throw new KeyNotFoundException("Machine ledger not found");
        }

        return ledger;
    }

    private MemberProfile RequireProfile(Guid userId)
    {
        if (!store.Profiles.TryGetValue(userId, out var profile))
        {
            throw new KeyNotFoundException("Profile not found");
        }

        return profile;
    }
}
