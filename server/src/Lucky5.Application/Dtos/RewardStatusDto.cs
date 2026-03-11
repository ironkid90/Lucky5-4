namespace Lucky5.Application.Dtos;

public sealed record RewardStatusDto(Guid RoundId, string Status, decimal UpdatedWinAmount, decimal WalletBalance, PokerCardDto? Card = null);
