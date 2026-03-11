# CarrePokerGameHub Contract (v1)

Hub route: `/CarrePokerGameHub`

## Connection and auth

- Transport: SignalR (WebSockets preferred).
- Auth: bearer token via query `access_token` or Authorization header.
- Reconnect backoff: `1s, 2s, 5s, 10s`.
- Heartbeat interval target: `20s`.

## Client -> server methods

- `JoinMachine(machineId: number)`
  - Adds caller to machine room and returns current machine state via `MachineStateUpdated`.
- `LeaveMachine(machineId: number)`
  - Removes caller from machine room.
- `Deal(machineId: number, betAmount: number)`
  - Starts a new round and emits `CardsDealt`.
- `Draw(roundId: string, holdIndexes: number[])`
  - Resolves draw and emits `CardRevealed` and `WalletUpdated`.
- `DoubleUp(roundId: string, guess: "big" | "small")`
  - Resolves double-up step and emits `RewardStatus` and `DoubleUpCard`.
- `Heartbeat()`
  - Marks connection alive.
- `ReconnectSync(machineId: number)`
  - Replays current state using `MachineStateUpdated`.

## Server -> client events

- `MachineStateUpdated`
  - `{ machineId: number, activeRounds: number, timestampUtc: string }`
- `CardsDealt`
  - `DealResult` payload (see OpenAPI schema)
- `CardRevealed`
  - `DrawResult` payload (see OpenAPI schema)
- `DoubleUpCard`
  - `{ roundId: string, guess: "big" | "small" }`
- `RewardStatus`
  - `RewardStatus` payload (see OpenAPI schema)
- `WalletUpdated`
  - `{ roundId: string, walletBalanceAfterRound: number }`
- `Error`
  - `{ code: string, message: string }`

## Ordering and idempotency guidance

- A single connection receives events in command completion order.
- Client should de-duplicate by `(roundId, eventName)` after reconnect.
- Server-side command idempotency keys are planned for persistence phase.
