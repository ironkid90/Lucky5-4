namespace Lucky5.Application.Dtos;

public sealed record DealResultDto(Guid RoundId, IReadOnlyList<PokerCardDto> Cards, decimal BetAmount, decimal WalletBalanceAfterBet, JackpotInfoDto? Jackpots = null, int[]? AdvisedHolds = null);
