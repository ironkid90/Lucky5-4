namespace Lucky5.Domain.Entities;

using Lucky5.Domain.Game.CleanRoom;

public sealed class GameRound
{
    public Guid RoundId { get; init; } = Guid.NewGuid();
    public Guid UserId { get; init; }
    public int MachineId { get; init; }
    public decimal BetAmount { get; set; }
    public List<PokerCard> InitialCards { get; set; } = new();
    public List<PokerCard> FinalCards { get; set; } = new();
    public string HandRank { get; set; } = "NoWin";
    public decimal WinAmount { get; set; }
    public bool IsCompleted { get; set; }
    public bool EnteredDoubleUp { get; set; }
    public PokerCard? DoubleUpCard { get; set; }
    public DistributionMode DistributionMode { get; set; } = DistributionMode.Neutral;
    public ulong RoundEntropySeed { get; set; }
    public int DrawAttempts { get; set; }
    public DateTime CreatedUtc { get; init; } = DateTime.UtcNow;

    public FiveCardDrawState? CleanRoomState { get; set; }
    public Lucky5DoubleUpSession? DoubleUpSession { get; set; }
    public PolicyDistributionMode PolicyMode { get; set; } = PolicyDistributionMode.Neutral;
    public int ActiveFourOfAKindSlotAtDeal { get; set; }
}
