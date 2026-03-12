namespace Lucky5.Api.Controllers;

using Lucky5.Api.Models;
using Lucky5.Application.Contracts;
using Lucky5.Application.Dtos;
using Lucky5.Application.Requests;
using Microsoft.AspNetCore.Mvc;

[ApiController]
[Route("api/[controller]")]
public sealed class GameController(IGameService gameService) : ControllerBase
{
    [HttpGet("games")]
    public async Task<ActionResult<ApiResponse<IReadOnlyList<string>>>> Games(CancellationToken cancellationToken)
        => Ok(ApiResponse<IReadOnlyList<string>>.Ok(await gameService.GetGamesAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));

    [HttpGet("games/machines")]
    public async Task<ActionResult<ApiResponse<IReadOnlyList<MachineListingDto>>>> Machines(CancellationToken cancellationToken)
        => Ok(ApiResponse<IReadOnlyList<MachineListingDto>>.Ok(await gameService.GetMachinesAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));

    [HttpGet("defaultRules")]
    public async Task<ActionResult<ApiResponse<DefaultRulesDto>>> DefaultRules(CancellationToken cancellationToken)
        => Ok(ApiResponse<DefaultRulesDto>.Ok(await gameService.GetDefaultRulesAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));

    [HttpGet("offer")]
    public async Task<ActionResult<ApiResponse<IReadOnlyList<OfferDto>>>> Offer(CancellationToken cancellationToken)
        => Ok(ApiResponse<IReadOnlyList<OfferDto>>.Ok(await gameService.GetOffersAsync(cancellationToken), traceId: HttpContext.TraceIdentifier));

    [HttpPost("cards/deal")]
    public async Task<ActionResult<ApiResponse<DealResultDto>>> Deal([FromBody] DealRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.DealAsync(userId, request, cancellationToken);
        return Ok(ApiResponse<DealResultDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("cards/draw")]
    public async Task<ActionResult<ApiResponse<DrawResultDto>>> Draw([FromBody] DrawRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.DrawAsync(userId, request, cancellationToken);
        return Ok(ApiResponse<DrawResultDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("double-up")]
    public async Task<ActionResult<ApiResponse<RewardStatusDto>>> DoubleUp([FromBody] DoubleUpRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.DoubleUpAsync(userId, request, cancellationToken);
        return Ok(ApiResponse<RewardStatusDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("double-up/start")]
    public async Task<ActionResult<ApiResponse<DoubleUpResultDto>>> StartDoubleUp([FromBody] StartDoubleUpRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.StartDoubleUpAsync(userId, request.RoundId, cancellationToken);
        return Ok(ApiResponse<DoubleUpResultDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("double-up/switch")]
    public async Task<ActionResult<ApiResponse<DoubleUpResultDto>>> SwitchDealer([FromBody] SwitchDealerRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.SwitchDealerAsync(userId, request.RoundId, cancellationToken);
        return Ok(ApiResponse<DoubleUpResultDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("double-up/guess")]
    public async Task<ActionResult<ApiResponse<DoubleUpResultDto>>> GuessDoubleUp([FromBody] DoubleUpGuessRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.GuessDoubleUpAsync(userId, request.RoundId, request.Guess, cancellationToken);
        return Ok(ApiResponse<DoubleUpResultDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("jackpot/rank")]
    public async Task<ActionResult<ApiResponse<JackpotInfoDto>>> ChangeJackpotRank([FromBody] ChangeJackpotRankRequest request, CancellationToken cancellationToken)
    {
        HttpContext.RequireUserId();
        var result = await gameService.ChangeJackpotRankAsync(request.MachineId, request.Rank, cancellationToken);
        return Ok(ApiResponse<JackpotInfoDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("double-up/cashout")]
    public async Task<ActionResult<ApiResponse<DoubleUpResultDto>>> CashoutDoubleUp([FromBody] CashoutDoubleUpRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.CashoutDoubleUpAsync(userId, request.RoundId, cancellationToken);
        return Ok(ApiResponse<DoubleUpResultDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("double-up/take-half")]
    public async Task<ActionResult<ApiResponse<DoubleUpResultDto>>> TakeHalf([FromBody] CashoutDoubleUpRequest request, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.TakeHalfAsync(userId, request.RoundId, cancellationToken);
        return Ok(ApiResponse<DoubleUpResultDto>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpGet("machine/{id}/state")]
    public async Task<ActionResult<ApiResponse<object>>> MachineState(int id, CancellationToken cancellationToken)
    {
        var result = await gameService.GetMachineStateAsync(id, cancellationToken);
        return Ok(ApiResponse<object>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }

    [HttpPost("machine/{id}/reset")]
    public async Task<ActionResult<ApiResponse<object>>> ResetMachine(int id, CancellationToken cancellationToken)
    {
        var userId = HttpContext.RequireUserId();
        var result = await gameService.ResetMachineAsync(userId, id, cancellationToken);
        return Ok(ApiResponse<object>.Ok(result, traceId: HttpContext.TraceIdentifier));
    }
}
