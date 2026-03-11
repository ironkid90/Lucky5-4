namespace Lucky5.Realtime;

using System.Security.Claims;
using Lucky5.Application.Contracts;
using Lucky5.Application.Requests;
using Lucky5.Realtime.Services;
using Microsoft.AspNetCore.SignalR;

public sealed class CarrePokerGameHub(IGameService gameService, ConnectionRegistry registry) : Hub
{
    private const string MachineStateUpdatedEvent = "MachineStateUpdated";
    private const string CardsDealtEvent = "CardsDealt";
    private const string CardRevealedEvent = "CardRevealed";
    private const string WalletUpdatedEvent = "WalletUpdated";
    private const string ErrorEvent = "Error";
    private const string CurrentMachineContextKey = "machine-id";

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
        Context.Items.Remove(CurrentMachineContextKey);
        return base.OnDisconnectedAsync(exception);
    }

    public async Task JoinMachine(int machineId)
    {
        if (machineId <= 0)
        {
            await EmitErrorAsync("INVALID_MACHINE", "Machine id must be positive.");
            throw new HubException("Machine id must be positive.");
        }

        if (TryGetCurrentMachineId(out var previousMachineId) && previousMachineId != machineId)
        {
            await Groups.RemoveFromGroupAsync(Context.ConnectionId, GroupName(previousMachineId));
        }

        Context.Items[CurrentMachineContextKey] = machineId;
        await Groups.AddToGroupAsync(Context.ConnectionId, GroupName(machineId));
        await BroadcastMachineStateAsync(machineId, Clients.Caller, Context.ConnectionAborted);
    }

    public async Task LeaveMachine(int machineId)
    {
        if (machineId <= 0)
        {
            return;
        }

        await Groups.RemoveFromGroupAsync(Context.ConnectionId, GroupName(machineId));

        if (TryGetCurrentMachineId(out var currentMachineId) && currentMachineId == machineId)
        {
            Context.Items.Remove(CurrentMachineContextKey);
        }
    }

    public async Task Deal(int machineId, decimal betAmount)
    {
        if (!TryGetUserId(out var userId))
        {
            await EmitErrorAsync("UNAUTHORIZED", "Unauthorized");
            throw new HubException("Unauthorized");
        }

        if (machineId <= 0)
        {
            await EmitErrorAsync("INVALID_MACHINE", "Machine id must be positive.");
            throw new HubException("Machine id must be positive.");
        }

        if (betAmount <= 0)
        {
            await EmitErrorAsync("INVALID_BET", "Bet amount must be positive.");
            throw new HubException("Bet amount must be positive.");
        }

        Context.Items[CurrentMachineContextKey] = machineId;

        var result = await gameService.DealAsync(
            userId,
            new DealRequest(machineId, betAmount),
            Context.ConnectionAborted);

        await Clients.Caller.SendAsync(CardsDealtEvent, result, Context.ConnectionAborted);
        await BroadcastMachineStateAsync(machineId, Clients.Group(GroupName(machineId)), Context.ConnectionAborted);
    }

    public async Task Draw(Guid roundId, int[] holdIndexes)
    {
        if (!TryGetUserId(out var userId))
        {
            await EmitErrorAsync("UNAUTHORIZED", "Unauthorized");
            throw new HubException("Unauthorized");
        }

        var normalizedHoldIndexes = (holdIndexes ?? [])
            .Where(index => index >= 0 && index < 5)
            .Distinct()
            .OrderBy(index => index)
            .ToArray();

        var result = await gameService.DrawAsync(
            userId,
            new DrawRequest(roundId, normalizedHoldIndexes),
            Context.ConnectionAborted);

        await Clients.Caller.SendAsync(CardRevealedEvent, result, Context.ConnectionAborted);
        await Clients.Caller.SendAsync(
            WalletUpdatedEvent,
            new
            {
                result.RoundId,
                result.WalletBalanceAfterRound
            },
            Context.ConnectionAborted);

        if (TryGetCurrentMachineId(out var machineId))
        {
            await BroadcastMachineStateAsync(machineId, Clients.Group(GroupName(machineId)), Context.ConnectionAborted);
        }
    }

    public async Task DoubleUp(Guid roundId, string guess)
    {
        if (!TryGetUserId(out var userId))
        {
            await EmitErrorAsync("UNAUTHORIZED", "Unauthorized");
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
        Context.Items[CurrentMachineContextKey] = machineId;
        registry.Touch(Context.ConnectionId);
        await BroadcastMachineStateAsync(machineId, Clients.Caller, Context.ConnectionAborted);
    }

    private async Task BroadcastMachineStateAsync(int machineId, IClientProxy target, CancellationToken cancellationToken)
    {
        var state = await gameService.GetMachineStateAsync(machineId, cancellationToken);
        await target.SendAsync(MachineStateUpdatedEvent, state, cancellationToken);
    }

    private Task EmitErrorAsync(string code, string message)
        => Clients.Caller.SendAsync(ErrorEvent, new { code, message }, Context.ConnectionAborted);

    private bool TryGetCurrentMachineId(out int machineId)
    {
        machineId = 0;

        if (!Context.Items.TryGetValue(CurrentMachineContextKey, out var value) || value is null)
        {
            return false;
        }

        return value switch
        {
            int intValue => (machineId = intValue) > 0,
            long longValue => (machineId = checked((int)longValue)) > 0,
            string stringValue when int.TryParse(stringValue, out var parsed) => (machineId = parsed) > 0,
            _ => false
        };
    }

    private bool TryGetUserId(out Guid userId)
    {
        userId = Guid.Empty;
        var value = Context.User?.FindFirstValue(ClaimTypes.NameIdentifier);
        return value is not null && Guid.TryParse(value, out userId);
    }

    private static string GroupName(int machineId) => $"machine:{machineId}";
}
