namespace Lucky5.Domain.Game.CleanRoom;

public enum PolicyDistributionMode
{
    Cold = 0,
    Neutral = 1,
    Hot = 2
}

public enum PayoutTier
{
    Small = 0,
    Medium = 1,
    Big = 2
}

public sealed class MachinePolicyState
{
    public decimal CreditsIn { get; set; }
    public decimal CreditsOut { get; set; }
    public decimal BaseCreditsOut { get; set; }
    public decimal TargetRtp { get; set; } = 0.90m;
    public int RoundCount { get; set; }

    public int ConsecutiveLosses { get; set; }
    public int RoundsSinceMediumWin { get; set; }
    public int CooldownRoundsRemaining { get; set; }

    public decimal NetSinceLastClose { get; set; }
    public int RoundsSinceLucky5Hit { get; set; }

    public decimal ObservedRtp => CreditsIn <= 0m ? TargetRtp : decimal.Round(CreditsOut / CreditsIn, 4);
    public decimal BaseRtp => CreditsIn <= 0m ? 0.38m : decimal.Round(BaseCreditsOut / CreditsIn, 4);
    public decimal Drift => ObservedRtp - TargetRtp;
}

public readonly record struct PayoutScaleResult(
    decimal SmallScale,
    decimal MediumScale,
    decimal BigScale)
{
    public decimal ForTier(PayoutTier tier) => tier switch
    {
        PayoutTier.Small => SmallScale,
        PayoutTier.Medium => MediumScale,
        PayoutTier.Big => BigScale,
        _ => SmallScale
    };
}

public static class MachinePolicy
{
    private static readonly CleanRoomCard FiveOfSpades = new(5, 'S');
    private static readonly int[] HighValueRanks = [14, 13, 12, 11];

    private const decimal DriftThreshold = 0.02m;
    private const decimal NoiseAmplitude = 0.04m;
    private const int WarmupRounds = 20;

    private const decimal MinPayoutScale = 0.5m;
    private const decimal MaxPayoutScale = 4.0m;
    private const decimal DefaultPayoutScale = 2.37m;

    private const int StreakSoftThreshold = 5;
    private const int StreakHardThreshold = 10;
    private const int MediumWinDroughtThreshold = 20;
    private const int CooldownLength = 3;

    private const decimal SoftCapWarning = 150_000_000m;
    private const decimal SoftCapHard = 200_000_000m;
    public const decimal CloseThreshold = 100_000m;

    public static PayoutTier ClassifyHand(HandCategory category) => category switch
    {
        HandCategory.TwoPair => PayoutTier.Small,
        HandCategory.ThreeOfAKind => PayoutTier.Small,
        HandCategory.Straight => PayoutTier.Medium,
        HandCategory.Flush => PayoutTier.Medium,
        HandCategory.FullHouse => PayoutTier.Medium,
        HandCategory.FourOfAKind => PayoutTier.Big,
        HandCategory.StraightFlush => PayoutTier.Big,
        HandCategory.RoyalFlush => PayoutTier.Big,
        _ => PayoutTier.Small
    };

    public static bool IsSoftCapActive(decimal netSinceLastClose) => netSinceLastClose >= SoftCapHard;
    public static bool IsSoftCapWarning(decimal netSinceLastClose) => netSinceLastClose >= SoftCapWarning;

    public static PolicyDistributionMode ResolveDistributionMode(
        MachinePolicyState state,
        ulong entropySeed)
    {
        if (state.NetSinceLastClose >= SoftCapHard)
        {
            return PolicyDistributionMode.Hot;
        }

        if (state.ConsecutiveLosses >= StreakHardThreshold + 5)
        {
            return PolicyDistributionMode.Hot;
        }

        if (state.CooldownRoundsRemaining > 0 && state.ConsecutiveLosses < StreakSoftThreshold)
        {
            return PolicyDistributionMode.Neutral;
        }

        var drift = state.Drift;
        var rng = new SplitMix64Rng(DeterministicSeed.Derive(entropySeed, "policy-mode"));
        var noise = (decimal)((rng.NextUnit() - 0.5) * (double)NoiseAmplitude);
        var adjustedDrift = drift + noise;

        var streakBoost = ComputeStreakBoost(state);
        adjustedDrift -= streakBoost;

        if (state.NetSinceLastClose >= SoftCapWarning)
        {
            var capPressure = (state.NetSinceLastClose - SoftCapWarning) / (SoftCapHard - SoftCapWarning);
            adjustedDrift -= capPressure * 0.08m;
        }

        if (adjustedDrift > DriftThreshold)
        {
            return PolicyDistributionMode.Cold;
        }

        if (adjustedDrift < -DriftThreshold)
        {
            return PolicyDistributionMode.Hot;
        }

        return PolicyDistributionMode.Neutral;
    }

    public static PayoutScaleResult ResolvePayoutScale(MachinePolicyState state, ulong entropySeed)
    {
        if (state.RoundCount < WarmupRounds)
        {
            return new PayoutScaleResult(DefaultPayoutScale, DefaultPayoutScale * 1.2m, DefaultPayoutScale * 1.5m);
        }

        var baseRtp = state.BaseRtp;
        if (baseRtp <= 0m)
        {
            return new PayoutScaleResult(MaxPayoutScale, MaxPayoutScale, MaxPayoutScale);
        }

        var requiredScale = state.TargetRtp / baseRtp;

        var drift = state.Drift;
        decimal correction = 0m;
        if (drift < -0.02m)
        {
            correction = Math.Min(-drift * 0.5m, 0.3m);
        }
        else if (drift > 0.02m)
        {
            correction = Math.Max(-drift * 0.5m, -0.3m);
        }

        var rng = new SplitMix64Rng(DeterministicSeed.Derive(entropySeed, "payout-scale"));
        var jitter = (decimal)((rng.NextUnit() - 0.5) * 0.08);

        var baseScale = requiredScale + correction + jitter;

        var smallScale = baseScale * 0.95m;
        var mediumScale = baseScale * 1.05m;
        var bigScale = baseScale * 1.15m;

        return new PayoutScaleResult(
            Math.Clamp(smallScale, MinPayoutScale, MaxPayoutScale),
            Math.Clamp(mediumScale, MinPayoutScale, MaxPayoutScale),
            Math.Clamp(bigScale, MinPayoutScale, MaxPayoutScale));
    }

    public static decimal ResolvePayoutScaleFlat(MachinePolicyState state, ulong entropySeed)
    {
        var tiered = ResolvePayoutScale(state, entropySeed);
        return tiered.SmallScale;
    }

    public static int ComputeCooldownLength(HandCategory winCategory, ulong entropySeed)
    {
        var rng = new SplitMix64Rng(DeterministicSeed.Derive(entropySeed, "cooldown-jitter"));
        var jitter = rng.NextInt(3) - 1;

        var baseCooldown = winCategory switch
        {
            HandCategory.FourOfAKind or HandCategory.StraightFlush or HandCategory.RoyalFlush => CooldownLength + 1,
            HandCategory.FullHouse or HandCategory.Flush or HandCategory.Straight => CooldownLength,
            _ => Math.Max(CooldownLength - 1, 1)
        };

        return Math.Max(baseCooldown + jitter, 1);
    }

    public static CleanRoomCard[] BuildDoubleUpDeck(
        CleanRoomCard[] standardDeck,
        ulong entropySeed,
        int roundsSinceLucky5Hit,
        decimal netSinceLastClose,
        PolicyDistributionMode roundPolicyMode)
    {
        var rng = new SplitMix64Rng(DeterministicSeed.Derive(entropySeed, "du-deck"));
        var altered = new List<CleanRoomCard>(standardDeck);

        if (roundPolicyMode == PolicyDistributionMode.Cold)
        {
            return AlterDeckCold(standardDeck, rng);
        }

        var extraFives = 0;

        if (netSinceLastClose >= SoftCapHard)
        {
            extraFives = 1 + rng.NextInt(2);
        }
        else if (roundsSinceLucky5Hit > 30)
        {
            extraFives = rng.NextUnit() < 0.50 ? 1 : 0;
        }
        else if (roundsSinceLucky5Hit > 15)
        {
            extraFives = rng.NextUnit() < 0.30 ? 1 : 0;
        }
        else
        {
            if (rng.NextUnit() < 0.15)
            {
                extraFives = 1;
            }
        }

        for (var i = 0; i < extraFives; i++)
        {
            var insertPos = rng.NextInt(Math.Max(altered.Count / 3, 1)) + 1;
            altered.Insert(Math.Min(insertPos, altered.Count), FiveOfSpades);
        }

        return altered.ToArray();
    }

    private static decimal ComputeStreakBoost(MachinePolicyState state)
    {
        decimal boost = 0m;

        if (state.ConsecutiveLosses >= StreakHardThreshold)
        {
            boost += 0.06m;
        }
        else if (state.ConsecutiveLosses >= StreakSoftThreshold)
        {
            var progress = (decimal)(state.ConsecutiveLosses - StreakSoftThreshold) / (StreakHardThreshold - StreakSoftThreshold);
            boost += 0.02m + progress * 0.04m;
        }

        if (state.RoundsSinceMediumWin >= MediumWinDroughtThreshold)
        {
            boost += 0.02m;
        }

        return boost;
    }

    public static CleanRoomCard[] AlterDeck(
        CleanRoomCard[] standardDeck,
        PolicyDistributionMode mode,
        ulong entropySeed,
        int consecutiveLosses = 0)
    {
        if (mode == PolicyDistributionMode.Neutral)
        {
            return standardDeck;
        }

        var rng = new SplitMix64Rng(DeterministicSeed.Derive(entropySeed, "policy-alter"));

        if (mode == PolicyDistributionMode.Cold)
        {
            return AlterDeckCold(standardDeck, rng);
        }

        return AlterDeckHot(standardDeck, rng, consecutiveLosses);
    }

    private static CleanRoomCard[] AlterDeckCold(CleanRoomCard[] deck, SplitMix64Rng rng)
    {
        var altered = new List<CleanRoomCard>(deck.Length);

        foreach (var card in deck)
        {
            if (card.Rank == FiveOfSpades.Rank && card.Suit == FiveOfSpades.Suit
                && rng.NextUnit() < 0.60)
            {
                continue;
            }

            if (Array.IndexOf(HighValueRanks, card.Rank) >= 0 && rng.NextUnit() < 0.18)
            {
                continue;
            }

            altered.Add(card);
        }

        if (altered.Count < 30)
        {
            return deck;
        }

        return altered.ToArray();
    }

    private static CleanRoomCard[] AlterDeckHot(CleanRoomCard[] deck, SplitMix64Rng rng, int consecutiveLosses)
    {
        var altered = new List<CleanRoomCard>(deck);
        var intensity = consecutiveLosses >= StreakHardThreshold + 5 ? 2
            : consecutiveLosses >= StreakHardThreshold ? 1
            : 0;

        if (rng.NextUnit() < 0.35 + intensity * 0.15)
        {
            altered.Add(FiveOfSpades);
        }

        if (intensity > 0)
        {
            var rank = HighValueRanks[rng.NextInt(HighValueRanks.Length)];
            char suit = "SHDC"[rng.NextInt(4)];
            altered.Add(new CleanRoomCard(rank, suit));
        }

        return altered.ToArray();
    }
}
