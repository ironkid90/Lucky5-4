namespace Lucky5.Domain.Entities;

public sealed class WalletLedgerEntry
{
    public Guid Id { get; init; } = Guid.NewGuid();
    public Guid UserId { get; init; }
    public decimal Amount { get; init; }
    public decimal BalanceAfter { get; init; }
    public string Type { get; init; } = string.Empty;
    public string Reference { get; init; } = string.Empty;
    public DateTime CreatedUtc { get; init; } = DateTime.UtcNow;
}
