namespace Lucky5.Domain.Game.CleanRoom;

public enum DoubleUpStyle
{
    NextCardBigSmall = 0,
    DealerChallenge = 1
}

public sealed record OperatorSettingProfile(
    int? MaxBetCredits = null,
    int? AutoCollectThreshold = null,
    IReadOnlyList<int>? PercentageModeTargets = null,
    bool? AllowsHalfGamble = null,
    bool? SupportsMeters = null);

public sealed record JackpotFeatureProfile(
    HandCategory Category,
    string DisplayName,
    bool RequiresMaxBet = false,
    int? FixedCreditAward = null);

public sealed record CabinetReferenceProfile(
    string Id,
    string DisplayName,
    DoubleUpStyle? DoubleUpStyle = null,
    int? BigThresholdInclusive = null,
    int? SmallThresholdInclusive = null,
    OperatorSettingProfile? OperatorSettings = null,
    IReadOnlyList<JackpotFeatureProfile>? JackpotFeatures = null,
    string Notes = "")
{
    public bool SupportsBonanzaBigSmall =>
        DoubleUpStyle == Lucky5.Domain.Game.CleanRoom.DoubleUpStyle.NextCardBigSmall &&
        BigThresholdInclusive.HasValue &&
        SmallThresholdInclusive.HasValue;

    public JackpotFeatureProfile? GetJackpotFeature(HandCategory category)
        => JackpotFeatures?.FirstOrDefault(feature => feature.Category == category);
}

public static class CabinetReferences
{
    public static CabinetReferenceProfile BonanzaGoldenPoker { get; } = new(
        Id: "bonanza-goldnpkr-1981",
        DisplayName: "Bonanza Golden Poker Double Up (1981)",
        DoubleUpStyle: Lucky5.Domain.Game.CleanRoom.DoubleUpStyle.NextCardBigSmall,
        BigThresholdInclusive: 8,
        SmallThresholdInclusive: 6,
        OperatorSettings: new OperatorSettingProfile(
            MaxBetCredits: 10,
            AutoCollectThreshold: 5000,
            PercentageModeTargets: [85, 30, 40, 50],
            AllowsHalfGamble: true,
            SupportsMeters: true),
        JackpotFeatures: [],
        Notes: "Source-derived from the MAME goldnpkr driver: TAKE SCORE vs DOUBLE UP, BIG/SMALL next-card gamble, operator percentage modes, timed learn/meter screens, and automatic storage over 5,000 credits.");

    public static CabinetReferenceProfile BonusPoker { get; } = new(
        Id: "galanthis-bonuspkr-1984",
        DisplayName: "Bonus Poker (Galanthis, 1984)",
        JackpotFeatures:
        [
            new JackpotFeatureProfile(HandCategory.FourOfAKind, "Four of a Kind Jackpot"),
            new JackpotFeatureProfile(HandCategory.StraightFlush, "Straight Flush Jackpot")
        ],
        Notes: "Use as a lineage reference for jackpot-style emphasis on premium hands. Exact fixed awards should remain unresolved until they are sourced from cabinet evidence, not inferred.");
}
