using Lucky5.Domain.Game.CleanRoom;

const int ROUNDS = 200_000;
const int BET = 5000;
var paytable = PaytableProfile.Lebanese;

Console.WriteLine("=== Lucky5 RTP Monte Carlo Simulation ===");
Console.WriteLine($"Rounds: {ROUNDS:N0} | Bet: {BET:N0} | Paytable: {paytable.Name}");
Console.WriteLine();

SimulateBaseGame();
SimulateWithPayoutScale();
SimulateFullSystemWithScale();
SimulateRtpConvergence();
SimulateExcitementMetrics();

void SimulateBaseGame()
{
    Console.WriteLine("--- 1. BASE GAME (no policy, no scale, standard deck) ---");
    long totalIn = 0;
    long totalOut = 0;
    var handCounts = new Dictionary<string, int>();

    for (int i = 0; i < ROUNDS; i++)
    {
        var seed = DeterministicSeed.FromString($"base-sim-{i}");
        var deck = FiveCardDrawEngine.ShuffleDeck(seed, "hand");
        var hand = deck.Take(5).ToArray();
        var state = FiveCardDrawState.Create(seed, deck, hand);

        var holdMask = ComputeOptimalHolds(hand);
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.SetHoldMask, HoldMask: holdMask));
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.Draw));

        var eval = FiveCardDrawEngine.EvaluateHand(state.Hand);
        var payout = paytable.ResolvePayout(eval, BET);

        totalIn += 2 * BET;
        totalOut += payout;
        handCounts[eval.Category.ToString()] = handCounts.GetValueOrDefault(eval.Category.ToString()) + 1;
    }

    var rtp = (decimal)totalOut / totalIn;
    Console.WriteLine($"  RTP (vs 2×bet cost): {rtp:P4}");
    Console.WriteLine($"  RTP (vs 1×bet):      {(decimal)totalOut / (ROUNDS * (long)BET):P4}");
    PrintHandDist(handCounts, ROUNDS);
}

void SimulateWithPayoutScale()
{
    Console.WriteLine("\n--- 2. WITH PAYOUT SCALE + POLICY (target 90%) ---");
    long totalIn = 0;
    long totalOut = 0;
    var handCounts = new Dictionary<string, int>();
    int hotCount = 0, coldCount = 0, neutralCount = 0;
    decimal scaleSum = 0;

    var policyState = new MachinePolicyState
    {
        CreditsIn = 0,
        CreditsOut = 0,
        TargetRtp = 0.90m,
        RoundCount = 0
    };

    for (int i = 0; i < ROUNDS; i++)
    {
        var seed = DeterministicSeed.FromString($"scale-sim-{i}");

        policyState.RoundsSinceMediumWin++;
        if (policyState.CooldownRoundsRemaining > 0) policyState.CooldownRoundsRemaining--;

        var mode = MachinePolicy.ResolveDistributionMode(policyState, seed);
        switch (mode)
        {
            case PolicyDistributionMode.Hot: hotCount++; break;
            case PolicyDistributionMode.Cold: coldCount++; break;
            default: neutralCount++; break;
        }

        var standardDeck = FiveCardDrawEngine.BuildStandardDeck();
        var alteredDeck = MachinePolicy.AlterDeck(standardDeck, mode, seed, policyState.ConsecutiveLosses);
        var shuffledDeck = FiveCardDrawEngine.ShuffleDeck(seed, "hand", alteredDeck);
        var hand = shuffledDeck.Take(5).ToArray();
        var state = FiveCardDrawState.Create(seed, shuffledDeck, hand);

        var holdMask = ComputeOptimalHolds(hand);
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.SetHoldMask, HoldMask: holdMask));
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.Draw));

        var eval = FiveCardDrawEngine.EvaluateHand(state.Hand);
        var basePayout = paytable.ResolvePayout(eval, BET);

        var scaleResult = MachinePolicy.ResolvePayoutScale(policyState, seed);
        var tier = MachinePolicy.ClassifyHand(eval.Category);
        var payoutScale = scaleResult.ForTier(tier);
        scaleSum += payoutScale;
        var payout = basePayout > 0 ? (int)Math.Round(basePayout * payoutScale, MidpointRounding.AwayFromZero) : 0;

        policyState.CreditsIn += 2 * BET;
        policyState.CreditsOut += payout;
        policyState.BaseCreditsOut += basePayout;
        policyState.RoundCount++;
        if (payout > 0)
        {
            policyState.ConsecutiveLosses = 0;
            if (tier >= PayoutTier.Medium) policyState.RoundsSinceMediumWin = 0;
            policyState.CooldownRoundsRemaining = MachinePolicy.ComputeCooldownLength(eval.Category);
        }
        else
        {
            policyState.ConsecutiveLosses++;
        }
        totalIn += 2 * BET;
        totalOut += payout;
        handCounts[eval.Category.ToString()] = handCounts.GetValueOrDefault(eval.Category.ToString()) + 1;
    }

    Console.WriteLine($"  RTP:         {(decimal)totalOut / totalIn:P4}");
    Console.WriteLine($"  Obs RTP:     {policyState.ObservedRtp:P4}");
    Console.WriteLine($"  Base RTP:    {policyState.BaseRtp:P4}");
    Console.WriteLine($"  Drift:       {policyState.Drift:+0.0000;-0.0000}");
    Console.WriteLine($"  Avg Scale:   {scaleSum / ROUNDS:F4}");
    Console.WriteLine($"  Modes:       Hot={hotCount} Neutral={neutralCount} Cold={coldCount}");
    PrintHandDist(handCounts, ROUNDS);
}

void SimulateFullSystemWithScale()
{
    Console.WriteLine("\n--- 3. FULL SYSTEM (scale + policy + jackpots + double-up) ---");
    long totalIn = 0;
    long totalOut = 0;
    decimal jackpotPool4K = 200_000;
    decimal jackpotPoolFH = 25_000_000;
    decimal jackpotPoolSF = 5_000_000;
    long jackpotsPaid = 0;
    int jackpotWins = 0;
    int doubleUpAttempts = 0, doubleUpWins = 0, doubleUpLosses = 0;

    var policyState = new MachinePolicyState
    {
        CreditsIn = 0,
        CreditsOut = 0,
        TargetRtp = 0.90m,
        RoundCount = 0
    };

    for (int i = 0; i < ROUNDS; i++)
    {
        var seed = DeterministicSeed.FromString($"full-sim-{i}");

        policyState.RoundsSinceMediumWin++;
        if (policyState.CooldownRoundsRemaining > 0) policyState.CooldownRoundsRemaining--;

        var mode = MachinePolicy.ResolveDistributionMode(policyState, seed);
        var standardDeck = FiveCardDrawEngine.BuildStandardDeck();
        var alteredDeck = MachinePolicy.AlterDeck(standardDeck, mode, seed, policyState.ConsecutiveLosses);
        var shuffledDeck = FiveCardDrawEngine.ShuffleDeck(seed, "hand", alteredDeck);
        var hand = shuffledDeck.Take(5).ToArray();
        var state = FiveCardDrawState.Create(seed, shuffledDeck, hand);

        var holdMask = ComputeOptimalHolds(hand);
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.SetHoldMask, HoldMask: holdMask));
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.Draw));

        var eval = FiveCardDrawEngine.EvaluateHand(state.Hand);
        var basePayout = paytable.ResolvePayout(eval, BET);
        var scaleResult3 = MachinePolicy.ResolvePayoutScale(policyState, seed);
        var tier3 = MachinePolicy.ClassifyHand(eval.Category);
        var payoutScale = scaleResult3.ForTier(tier3);
        var payout = basePayout > 0 ? (int)Math.Round(basePayout * payoutScale, MidpointRounding.AwayFromZero) : 0;

        var jackpotContrib = BET * 0.01m;
        jackpotPool4K = Math.Min(jackpotPool4K + jackpotContrib / 3, 999_999);
        jackpotPoolFH += jackpotContrib / 3;
        jackpotPoolSF = Math.Min(jackpotPoolSF + jackpotContrib / 3, 20_000_000);

        long roundPayout = payout;
        if (payout > 0)
        {
            if (eval.Category == HandCategory.FourOfAKind)
            {
                roundPayout += (long)jackpotPool4K;
                jackpotsPaid += (long)jackpotPool4K;
                jackpotPool4K = 200_000;
                jackpotWins++;
            }
            else if (eval.Category == HandCategory.StraightFlush)
            {
                roundPayout += (long)jackpotPoolSF;
                jackpotsPaid += (long)jackpotPoolSF;
                jackpotPoolSF = 5_000_000;
                jackpotWins++;
            }
        }

        policyState.CreditsIn += 2 * BET;
        policyState.CreditsOut += roundPayout;
        policyState.BaseCreditsOut += basePayout;
        policyState.RoundCount++;
        if (payout > 0)
        {
            policyState.ConsecutiveLosses = 0;
            if (tier3 >= PayoutTier.Medium) policyState.RoundsSinceMediumWin = 0;
            policyState.CooldownRoundsRemaining = MachinePolicy.ComputeCooldownLength(eval.Category);
        }
        else
        {
            policyState.ConsecutiveLosses++;
        }
        totalIn += 2 * BET;

        if (roundPayout > 0 && (seed % 3 == 0))
        {
            doubleUpAttempts++;
            var duSession = Lucky5DoubleUpEngine.Start((int)roundPayout, seed);
            var guess = duSession.DealerCard.Rank <= 8 ? BigSmallGuess.Big : BigSmallGuess.Small;
            var resolution = Lucky5DoubleUpEngine.ResolveGuess(duSession, guess);

            if (resolution.Outcome == Lucky5DoubleUpOutcome.Win || resolution.Outcome == Lucky5DoubleUpOutcome.MachineClosed)
            {
                var duDelta = resolution.NextAmount - roundPayout;
                totalOut += resolution.NextAmount;
                policyState.CreditsOut += duDelta;
                doubleUpWins++;
            }
            else if (resolution.Outcome == Lucky5DoubleUpOutcome.SafeFail)
            {
                totalOut += resolution.CashoutCredits;
                doubleUpWins++;
            }
            else
            {
                totalOut += 0;
                policyState.CreditsOut -= roundPayout;
                doubleUpLosses++;
            }
        }
        else
        {
            totalOut += roundPayout;
        }
    }

    Console.WriteLine($"  Total In:        {totalIn:N0}");
    Console.WriteLine($"  Total Out:       {totalOut:N0}");
    Console.WriteLine($"  RTP:             {(decimal)totalOut / totalIn:P4}");
    Console.WriteLine($"  Jackpots paid:   {jackpotsPaid:N0} ({jackpotWins} wins)");
    Console.WriteLine($"  Double-up:       {doubleUpAttempts} attempts, {doubleUpWins} wins, {doubleUpLosses} losses ({(doubleUpAttempts > 0 ? (double)doubleUpWins / doubleUpAttempts : 0):P1} win rate)");
}

void SimulateRtpConvergence()
{
    Console.WriteLine("\n--- 4. RTP CONVERGENCE OVER TIME ---");
    var policyState = new MachinePolicyState
    {
        CreditsIn = 0,
        CreditsOut = 0,
        TargetRtp = 0.90m,
        RoundCount = 0
    };

    var checkpoints = new[] { 100, 500, 1000, 5000, 10000, 50000, 100000, 200000, 500000 };
    int cpIdx = 0;

    for (int i = 0; i < ROUNDS; i++)
    {
        var seed = DeterministicSeed.FromString($"conv-sim-{i}");

        policyState.RoundsSinceMediumWin++;
        if (policyState.CooldownRoundsRemaining > 0) policyState.CooldownRoundsRemaining--;

        var mode = MachinePolicy.ResolveDistributionMode(policyState, seed);
        var standardDeck = FiveCardDrawEngine.BuildStandardDeck();
        var alteredDeck = MachinePolicy.AlterDeck(standardDeck, mode, seed, policyState.ConsecutiveLosses);
        var shuffledDeck = FiveCardDrawEngine.ShuffleDeck(seed, "hand", alteredDeck);
        var hand = shuffledDeck.Take(5).ToArray();
        var state = FiveCardDrawState.Create(seed, shuffledDeck, hand);

        var holdMask = ComputeOptimalHolds(hand);
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.SetHoldMask, HoldMask: holdMask));
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.Draw));

        var eval = FiveCardDrawEngine.EvaluateHand(state.Hand);
        var basePayout = paytable.ResolvePayout(eval, BET);
        var scaleResult4 = MachinePolicy.ResolvePayoutScale(policyState, seed);
        var tier4 = MachinePolicy.ClassifyHand(eval.Category);
        var payoutScale = scaleResult4.ForTier(tier4);
        var payout = basePayout > 0 ? (int)Math.Round(basePayout * payoutScale, MidpointRounding.AwayFromZero) : 0;

        policyState.CreditsIn += 2 * BET;
        policyState.CreditsOut += payout;
        policyState.BaseCreditsOut += basePayout;
        policyState.RoundCount++;
        if (payout > 0)
        {
            policyState.ConsecutiveLosses = 0;
            if (tier4 >= PayoutTier.Medium) policyState.RoundsSinceMediumWin = 0;
            policyState.CooldownRoundsRemaining = MachinePolicy.ComputeCooldownLength(eval.Category);
        }
        else
        {
            policyState.ConsecutiveLosses++;
        }

        if (cpIdx < checkpoints.Length && (i + 1) == checkpoints[cpIdx])
        {
            var scale = MachinePolicy.ResolvePayoutScale(policyState, seed);
            Console.WriteLine($"  Round {checkpoints[cpIdx],7:N0}: RTP={policyState.ObservedRtp:P2} Drift={policyState.Drift:+0.00;-0.00}% Scale={scale.SmallScale:F3}/{scale.MediumScale:F3}/{scale.BigScale:F3} Mode={mode} Streak={policyState.ConsecutiveLosses}");
            cpIdx++;
        }
    }
}

void PrintHandDist(Dictionary<string, int> handCounts, int rounds)
{
    var order = new[] { "RoyalFlush", "StraightFlush", "FourOfAKind", "FullHouse", "Flush", "Straight", "ThreeOfAKind", "TwoPair", "OnePair", "HighCard" };
    Console.WriteLine("  Hand Distribution:");
    foreach (var h in order)
    {
        var count = handCounts.GetValueOrDefault(h);
        if (count > 0)
            Console.WriteLine($"    {h,-16} {count,7} ({(double)count / rounds:P3})");
    }
}

void SimulateExcitementMetrics()
{
    Console.WriteLine("\n--- 5. EXCITEMENT METRICS (player experience analysis) ---");
    var policyState = new MachinePolicyState
    {
        CreditsIn = 0,
        CreditsOut = 0,
        TargetRtp = 0.90m,
        RoundCount = 0
    };

    var lossStreaks = new List<int>();
    int currentLossStreak = 0;
    int maxLossStreak = 0;
    int smallWins = 0, mediumWins = 0, bigWins = 0, totalWins = 0;
    long smallPayout = 0, mediumPayout = 0, bigPayout = 0;
    var gapsBetweenWins = new List<int>();
    int roundsSinceLastWin = 0;

    for (int i = 0; i < ROUNDS; i++)
    {
        var seed = DeterministicSeed.FromString($"excitement-sim-{i}");

        policyState.RoundsSinceMediumWin++;
        if (policyState.CooldownRoundsRemaining > 0) policyState.CooldownRoundsRemaining--;

        var mode = MachinePolicy.ResolveDistributionMode(policyState, seed);
        var standardDeck = FiveCardDrawEngine.BuildStandardDeck();
        var alteredDeck = MachinePolicy.AlterDeck(standardDeck, mode, seed, policyState.ConsecutiveLosses);
        var shuffledDeck = FiveCardDrawEngine.ShuffleDeck(seed, "hand", alteredDeck);
        var hand = shuffledDeck.Take(5).ToArray();
        var state = FiveCardDrawState.Create(seed, shuffledDeck, hand);

        var holdMask = ComputeOptimalHolds(hand);
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.SetHoldMask, HoldMask: holdMask));
        state = FiveCardDrawEngine.Reduce(state, new RoundAction(RoundActionKind.Draw));

        var eval = FiveCardDrawEngine.EvaluateHand(state.Hand);
        var basePayout = paytable.ResolvePayout(eval, BET);
        var scaleResult = MachinePolicy.ResolvePayoutScale(policyState, seed);
        var tier = MachinePolicy.ClassifyHand(eval.Category);
        var payoutScale = scaleResult.ForTier(tier);
        var payout = basePayout > 0 ? (int)Math.Round(basePayout * payoutScale, MidpointRounding.AwayFromZero) : 0;

        policyState.CreditsIn += 2 * BET;
        policyState.CreditsOut += payout;
        policyState.BaseCreditsOut += basePayout;
        policyState.RoundCount++;

        roundsSinceLastWin++;

        if (payout > 0)
        {
            totalWins++;
            gapsBetweenWins.Add(roundsSinceLastWin);
            roundsSinceLastWin = 0;

            if (currentLossStreak > 0)
            {
                lossStreaks.Add(currentLossStreak);
                if (currentLossStreak > maxLossStreak) maxLossStreak = currentLossStreak;
            }
            currentLossStreak = 0;

            switch (tier)
            {
                case PayoutTier.Small: smallWins++; smallPayout += payout; break;
                case PayoutTier.Medium: mediumWins++; mediumPayout += payout; break;
                case PayoutTier.Big: bigWins++; bigPayout += payout; break;
            }

            policyState.ConsecutiveLosses = 0;
            if (tier >= PayoutTier.Medium) policyState.RoundsSinceMediumWin = 0;
            policyState.CooldownRoundsRemaining = MachinePolicy.ComputeCooldownLength(eval.Category);
        }
        else
        {
            currentLossStreak++;
            policyState.ConsecutiveLosses++;
        }
    }

    if (currentLossStreak > 0) lossStreaks.Add(currentLossStreak);

    var avgGap = gapsBetweenWins.Count > 0 ? gapsBetweenWins.Average() : 0;
    var medianGap = gapsBetweenWins.Count > 0 ? gapsBetweenWins.OrderBy(x => x).ElementAt(gapsBetweenWins.Count / 2) : 0;
    var p90Gap = gapsBetweenWins.Count > 0 ? gapsBetweenWins.OrderBy(x => x).ElementAt((int)(gapsBetweenWins.Count * 0.90)) : 0;
    var p99Gap = gapsBetweenWins.Count > 0 ? gapsBetweenWins.OrderBy(x => x).ElementAt((int)(gapsBetweenWins.Count * 0.99)) : 0;
    var avgLossStreak = lossStreaks.Count > 0 ? lossStreaks.Average() : 0;
    var streaksOver10 = lossStreaks.Count(s => s > 10);
    var streaksOver15 = lossStreaks.Count(s => s > 15);

    Console.WriteLine($"  Win Rate:         {(double)totalWins / ROUNDS:P1} ({totalWins:N0} wins in {ROUNDS:N0} rounds)");
    Console.WriteLine($"  Win Tier Split:   Small={smallWins} ({(double)smallWins / totalWins:P1})  Medium={mediumWins} ({(double)mediumWins / totalWins:P1})  Big={bigWins} ({(double)bigWins / totalWins:P1})");
    Console.WriteLine($"  Avg Payout/Tier:  Small={smallPayout / Math.Max(smallWins, 1):N0}  Medium={mediumPayout / Math.Max(mediumWins, 1):N0}  Big={bigPayout / Math.Max(bigWins, 1):N0}");
    Console.WriteLine($"  Rounds Between Wins: avg={avgGap:F1} median={medianGap} p90={p90Gap} p99={p99Gap}");
    Console.WriteLine($"  Loss Streaks:     avg={avgLossStreak:F1} max={maxLossStreak} over10={streaksOver10} over15={streaksOver15}");
    Console.WriteLine($"  Final RTP:        {policyState.ObservedRtp:P2}");
}

bool[] ComputeOptimalHolds(CleanRoomCard[] hand)
{
    var eval = FiveCardDrawEngine.EvaluateHand(hand);
    var holds = new bool[5];

    switch (eval.Category)
    {
        case HandCategory.RoyalFlush:
        case HandCategory.StraightFlush:
        case HandCategory.FourOfAKind:
        case HandCategory.FullHouse:
        case HandCategory.Flush:
        case HandCategory.Straight:
            return [true, true, true, true, true];

        case HandCategory.ThreeOfAKind:
        {
            var tripRank = hand.GroupBy(c => c.Rank).First(g => g.Count() == 3).Key;
            for (int j = 0; j < 5; j++) holds[j] = hand[j].Rank == tripRank;
            return holds;
        }
        case HandCategory.TwoPair:
        {
            var pairRanks = hand.GroupBy(c => c.Rank).Where(g => g.Count() == 2).Select(g => g.Key).ToHashSet();
            for (int j = 0; j < 5; j++) holds[j] = pairRanks.Contains(hand[j].Rank);
            return holds;
        }
        case HandCategory.OnePair:
        {
            var pairRank = hand.GroupBy(c => c.Rank).First(g => g.Count() == 2).Key;
            for (int j = 0; j < 5; j++) holds[j] = hand[j].Rank == pairRank;
            return holds;
        }
        default:
        {
            var highCards = hand.Select((c, idx) => (c, idx))
                .OrderByDescending(x => x.c.Rank)
                .Take(2)
                .Select(x => x.idx)
                .ToHashSet();
            for (int j = 0; j < 5; j++) holds[j] = highCards.Contains(j);
            return holds;
        }
    }
}
