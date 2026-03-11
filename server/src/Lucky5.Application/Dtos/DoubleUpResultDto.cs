namespace Lucky5.Application.Dtos;

public sealed record DoubleUpResultDto(
    Guid RoundId,
    string Status,
    decimal CurrentAmount,
    decimal WalletBalance,
    PokerCardDto? DealerCard = null,
    PokerCardDto? ChallengerCard = null,
    int SwitchesRemaining = 0,
    bool IsNoLoseActive = false,
    int LuckyMultiplier = 0,
    PresentationNoiseDto? Noise = null);

public sealed record PresentationNoiseDto(
    int SuspenseMs,
    int RevealMs,
    int FlipFrames,
    int PulseFrames);
