namespace Lucky5.Application.Dtos;

public sealed record WalletLedgerEntryDto(Guid Id, decimal Amount, decimal BalanceAfter, string Type, string Reference, DateTime CreatedUtc);
