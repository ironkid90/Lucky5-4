namespace Lucky5.Application.Dtos;

public sealed record DrawResultDto(Guid RoundId, IReadOnlyList<PokerCardDto> Cards, string HandRank, decimal WinAmount, decimal WalletBalanceAfterRound, decimal JackpotWon = 0, JackpotInfoDto? Jackpots = null);
