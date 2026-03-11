namespace Lucky5.Application.Contracts;

using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;

public interface IGameService
{
    Task<IReadOnlyList<string>> GetGamesAsync(CancellationToken cancellationToken);
    Task<IReadOnlyList<MachineListingDto>> GetMachinesAsync(CancellationToken cancellationToken);
    Task<DefaultRulesDto> GetDefaultRulesAsync(CancellationToken cancellationToken);
    Task<IReadOnlyList<OfferDto>> GetOffersAsync(CancellationToken cancellationToken);
    Task<DealResultDto> DealAsync(Guid userId, DealRequest request, CancellationToken cancellationToken);
    Task<DrawResultDto> DrawAsync(Guid userId, DrawRequest request, CancellationToken cancellationToken);
    Task<RewardStatusDto> DoubleUpAsync(Guid userId, DoubleUpRequest request, CancellationToken cancellationToken);
    Task<DoubleUpResultDto> StartDoubleUpAsync(Guid userId, Guid roundId, CancellationToken cancellationToken);
    Task<DoubleUpResultDto> SwitchDealerAsync(Guid userId, Guid roundId, CancellationToken cancellationToken);
    Task<DoubleUpResultDto> GuessDoubleUpAsync(Guid userId, Guid roundId, string guess, CancellationToken cancellationToken);
    Task<DoubleUpResultDto> CashoutDoubleUpAsync(Guid userId, Guid roundId, CancellationToken cancellationToken);
    Task<DoubleUpResultDto> TakeHalfAsync(Guid userId, Guid roundId, CancellationToken cancellationToken);
    Task<JackpotInfoDto> ChangeJackpotRankAsync(int machineId, int rank, CancellationToken cancellationToken);
    Task<object> GetMachineStateAsync(int machineId, CancellationToken cancellationToken);
}
