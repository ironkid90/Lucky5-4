namespace Lucky5.Tests;

using Lucky5.Application.Contracts;
using Lucky5.Application.Requests;
using Lucky5.Domain.Entities;
using Lucky5.Infrastructure.Services;

public sealed class MockEntropyGenerator(ulong fixedSeed) : IEntropyGenerator
{
    public ulong CreateSeed(Guid userId, int machineId, decimal betAmount, MachineLedgerState ledger)
    {
        return fixedSeed;
    }
}

public static class ReplayTests
{
    public static async Task RunAsync(List<string> failures)
    {
        // 1. Setup Environment A (Reference)
        var store1 = new InMemoryDataStore();
        var entropy1 = new MockEntropyGenerator(0xCAFEBABE12345678UL);
        var svc1 = new GameService(store1, entropy1);

        var userId = Guid.Parse("00000000-0000-0000-0000-000000000001");
        store1.Profiles[userId] = new MemberProfile { UserId = userId, WalletBalance = 100_000m, Username = "replay" };
        var machineId = store1.Machines.First().Id;

        // 2. Setup Environment B (Clone)
        var store2 = new InMemoryDataStore();
        var entropy2 = new MockEntropyGenerator(0xCAFEBABE12345678UL);
        var svc2 = new GameService(store2, entropy2);

        store2.Profiles[userId] = new MemberProfile { UserId = userId, WalletBalance = 100_000m, Username = "replay" };

        // 3. Execute Parallel Action: Deal
        var deal1 = await svc1.DealAsync(userId, new DealRequest(machineId, store1.Machines.First(m => m.Id == machineId).MinBet), CancellationToken.None);
        var deal2 = await svc2.DealAsync(userId, new DealRequest(machineId, store2.Machines.First(m => m.Id == machineId).MinBet), CancellationToken.None);

        var hand1 = string.Join(",", deal1.Cards.Select(c => c.Code));
        var hand2 = string.Join(",", deal2.Cards.Select(c => c.Code));

        if (hand1 != hand2)
        {
            failures.Add($"Replay failure (Deal): Expected {hand1}, got {hand2}");
        }
        else
        {
            Console.WriteLine($"Replay (Deal) OK: {hand1}");
        }

        // 4. Execute Parallel Action: Draw (Hold nothing)
        var draw1 = await svc1.DrawAsync(userId, new DrawRequest(deal1.RoundId, []), CancellationToken.None);
        var draw2 = await svc2.DrawAsync(userId, new DrawRequest(deal2.RoundId, []), CancellationToken.None);

        var final1 = string.Join(",", draw1.Cards.Select(c => c.Code));
        var final2 = string.Join(",", draw2.Cards.Select(c => c.Code));

        if (final1 != final2)
        {
            failures.Add($"Replay failure (Draw): Expected {final1}, got {final2}");
        }
        else
        {
            Console.WriteLine($"Replay (Draw) OK: {final1}");
        }
    }
}
