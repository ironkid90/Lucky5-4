# Gameplay + Realtime Event Catalog (Forensics Freeze)

## SignalR evidence from binary symbols

Observed signalr/runtime strings in `resources/lib/armeabi-v7a/libapp.so`:

- `CarrePokerGameHub`
- `HubConnection`
- `HubConnectionState`
- `SignalRManager`
- `initializeSignalR`
- `_initSignalR`
- `onreconnected`
- `getMachinebyId`
- `cleanupDoubleUp`
- `handleDoubleUpFromSignalR`
- `updateDealtCardsFromSignalR`
- `swapDoubleUpCardFromSignalR`
- `addDoubleUpCardFromSignalR`

Observed operational logs/text snippets:

- `Failed to initialize SignalR:`
- `Cannot start a HubConnection that is not in the 'Disconnected' state.`
- `[SignalR] Re-subscribe...`
- `[SignalR] App going to background...`

## Normalized client -> server hub contract

Hub route: `/CarrePokerGameHub`

- `JoinMachine(machineId)`
- `LeaveMachine(machineId)`
- `Deal(machineId, betAmount)`
- `Draw(roundId, holdIndexes)`
- `DoubleUp(roundId, guess)`
- `Heartbeat()`
- `ReconnectSync(machineId)`

## Normalized server -> client event contract

- `MachineStateUpdated`
- `CardsDealt`
- `CardRevealed`
- `DoubleUpCard`
- `RewardStatus`
- `WalletUpdated`
- `Error`

## Gameplay state machine (clean-room baseline)

1. `JoinMachine` loads current room state.
2. `Deal` debits wallet and emits dealt cards.
3. `Draw` resolves hand rank/payout and emits wallet update.
4. Optional `DoubleUp` resolves risk round and emits reward status.
5. `Heartbeat` keeps session alive.
6. `ReconnectSync` restores client state after transient disconnect.

## Reliability defaults

- Client reconnect delays: `1s, 2s, 5s, 10s`
- Heartbeat interval target: `20s`
- Server stale threshold: `(2 x heartbeat) + 5s`
- De-dupe key recommendation: `roundId + eventName`
