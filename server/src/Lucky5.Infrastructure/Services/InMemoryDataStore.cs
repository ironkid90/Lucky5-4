namespace Lucky5.Infrastructure.Services;

using Lucky5.Domain.Entities;

public sealed class InMemoryDataStore
{
    public InMemoryDataStore()
    {
        foreach (var machine in Machines)
        {
            MachineLedgers[machine.Id] = new MachineLedgerState
            {
                MachineId = machine.Id,
                TargetRtp = machine.Id switch
                {
                    1 => 0.90m,
                    2 => 0.90m,
                    3 => 0.90m,
                    _ => 0.90m
                }
            };
        }
    }

    public Dictionary<Guid, User> Users { get; } = new();
    public Dictionary<Guid, MemberProfile> Profiles { get; } = new();
    public List<WalletLedgerEntry> Ledger { get; } = [];
    public Dictionary<Guid, GameRound> ActiveRounds { get; } = new();
    public Dictionary<int, MachineLedgerState> MachineLedgers { get; } = new();
    public List<Machine> Machines { get; } =
    [
        new() { Id = 1, Name = "Lucky 5 - Beirut", MinBet = 5000, MaxBet = 10000, IsOpen = true },
        new() { Id = 2, Name = "Lucky 5 - Hamra", MinBet = 5000, MaxBet = 10000, IsOpen = true },
        new() { Id = 3, Name = "Lucky 5 - VIP", MinBet = 5000, MaxBet = 10000, IsOpen = true }
    ];

    public List<Offer> Offers { get; } =
    [
        new() { Id = 1, Title = "Welcome Bonus", Description = "First deposit bonus", BonusAmount = 10 },
        new() { Id = 2, Title = "Weekend Cashback", Description = "5% cashback on losses", BonusAmount = 5 }
    ];

    public List<ContactType> ContactTypes { get; } =
    [
        new() { Id = 1, Name = "Technical" },
        new() { Id = 2, Name = "Billing" },
        new() { Id = 3, Name = "General" }
    ];

    public List<ContactReport> ContactReports { get; } = [];

    public TermsDocument Terms { get; } = new()
    {
        Version = "1.0.0",
        BodyMarkdown = "# Terms\n\nUse this clean-room build for testing and internal validation only.",
        UpdatedUtc = DateTime.UtcNow
    };

    public Dictionary<string, string> AppSettings { get; } = new(StringComparer.OrdinalIgnoreCase)
    {
        ["game.houseRulesetVersion"] = "v1",
        ["signalr.heartbeatSeconds"] = "20",
        ["wallet.currency"] = "USD"
    };

    public Dictionary<string, string> ContactInfo { get; } = new(StringComparer.OrdinalIgnoreCase)
    {
        ["email"] = "support@lucky5.local",
        ["phone"] = "+961-01-000-000"
    };
}
