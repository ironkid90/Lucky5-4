namespace Lucky5.Realtime;

using System.Security.Claims;
using Lucky5.Application.Contracts;
using Lucky5.Application.Requests;
using Lucky5.Realtime.Services;
using Microsoft.AspNetCore.SignalR;

public sealed class CarrePokerGameHub(IGameService gameService, ConnectionRegistry registry) : Hub
{
    public override Task OnConnectedAsync()
    {
        if (TryGetUserId(out var userId))
        {
            registry.Add(Context.ConnectionId, userId);
        }

        return base.OnConnectedAsync();
    }

    public override Task OnDisconnectedAsync(Exception? exception)
    {
        registry.Remove(Context.ConnectionId);
        return base.OnDisconnectedAsync(exception);
    }

    public async Task JoinMachine(int machineId)
    {
        await Groups.AddToGroupAsync(Context.ConnectionId, GroupName(machineId));
        var state = await gameService.GetMachineStateAsync(machineId, Context.ConnectionAborted);
        await Clients.Caller.SendAsync("MachineStateUpdated", state, Context.ConnectionAborted);
    }

    public Task LeaveMachine(int machineId)
    {
        return Groups.RemoveFromGroupAsync(Context.ConnectionId, GroupName(machineId));
    }

    public async Task Deal(int machineId, decimal betAmount)
    {
        if (!TryGetUserId(out var userId))
        {
            throw new HubException("Unauthorized");
        }

        var result = await gameService.DealAsync(userId, new DealRequest(machineId, betAmount), Context.ConnectionAborted);
        await Clients.Caller.SendAsync("CardsDealt", result, Context.ConnectionAborted);
        await Clients.Group(GroupName(machineId)).SendAsync("MachineStateUpdated", await gameService.GetMachineStateAsync(machineId, Context.ConnectionAborted), Context.ConnectionAborted);
    }

    public async Task Draw(Guid roundId, int[] holdIndexes)
    {
        if (!TryGetUserId(out var userId))
        {
            throw new HubException("Unauthorized");
        }

        var result = await gameService.DrawAsync(userId, new DrawRequest(roundId, holdIndexes), Context.ConnectionAborted);
        await Clients.Caller.SendAsync("CardRevealed", result, Context.ConnectionAborted);
        await Clients.Caller.SendAsync("WalletUpdated", new { result.RoundId, result.WalletBalanceAfterRound }, Context.ConnectionAborted);
    }

    public async Task DoubleUp(Guid roundId, string guess)
    {
        if (!TryGetUserId(out var userId))
        {
            throw new HubException("Unauthorized");
        }

        var result = await gameService.DoubleUpAsync(userId, new DoubleUpRequest(roundId, guess), Context.ConnectionAborted);
        await Clients.Caller.SendAsync("RewardStatus", result, Context.ConnectionAborted);
        await Clients.Caller.SendAsync("DoubleUpCard", new { roundId, guess }, Context.ConnectionAborted);
    }

    public Task Heartbeat()
    {
        registry.Touch(Context.ConnectionId);
        return Task.CompletedTask;
    }

    public async Task ReconnectSync(int machineId)
    {
        registry.Touch(Context.ConnectionId);
        var state = await gameService.GetMachineStateAsync(machineId, Context.ConnectionAborted);
        await Clients.Caller.SendAsync("MachineStateUpdated", state, Context.ConnectionAborted);
    }

    private bool TryGetUserId(out Guid userId)
    {
        userId = Guid.Empty;
        var value = Context.User?.FindFirstValue(ClaimTypes.NameIdentifier);
        return value is not null && Guid.TryParse(value, out userId);
    }

    private static string GroupName(int machineId) => $"machine:{machineId}";
}
