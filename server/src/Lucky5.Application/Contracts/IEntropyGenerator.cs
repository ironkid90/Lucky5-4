namespace Lucky5.Application.Contracts;

using Lucky5.Domain.Entities;

public interface IEntropyGenerator
{
    ulong CreateSeed(Guid userId, int machineId, decimal betAmount, MachineLedgerState ledger);
}
