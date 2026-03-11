namespace Lucky5.Infrastructure.Services;

using Lucky5.Application.Contracts;
using Lucky5.Domain.Entities;
using Lucky5.Domain.Game;

public sealed class DefaultEntropyGenerator : IEntropyGenerator
{
    public ulong CreateSeed(Guid userId, int machineId, decimal betAmount, MachineLedgerState ledger)
    {
        return RoundNoiseRng.CreateEntropySeed(userId, machineId, betAmount, ledger);
    }
}
