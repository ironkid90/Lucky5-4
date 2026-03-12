# Roadmap

## Phase 0: Repository Foundation

- establish canonical repo docs
- lock repo boundaries and reuse rules
- keep raw artifacts local and ignored

Exit criteria:

- `AGENTS.md`, architecture, roadmap, and game-feel docs are in place
- git repo initialized

## Phase 1: Authoritative Engine Port

- port the clean-room engine into `src/server/engine/`
- define paytable and rule variant config
- add regression fixtures for deal, draw, payout, and double-up

Exit criteria:

- deterministic engine API exists
- engine tests run without `analysis/` imports

## Phase 2: Machine Session Layer

- define machine, wallet, round, and ledger models
- implement join, leave, cash in, cash out, and round transitions
- separate presentation noise from authoritative state

Exit criteria:

- one player can complete a full round lifecycle through backend services

## Phase 3: Contracts And Realtime

- define REST DTOs and SignalR message contracts
- wire machine state, balance change, deal, draw, and double-up events
- remove Lucky5 contract mismatches during port

Exit criteria:

- API and realtime contracts are stable enough for a thin client

## Phase 4: Web Cabinet Prototype

- build the portrait cabinet UI in `src/web/`
- reproduce the visible paytable, credit/stake panel, cards, and control deck
- implement machine selection and playable round loop

Exit criteria:

- browser client can join a machine, play rounds, and complete double-up

## Phase 5: Variant Tuning

- add Lebanese machine profiles
- formalize Joker behavior, payout tables, and double-up rules
- tune animation pacing, sound hooks, and idle/title behavior from recording references

Exit criteria:

- at least one variant feels mechanically and visually close to the recording

## Phase 6: Persistence And Recovery

- replace in-memory stores with durable persistence
- add reconnect/session recovery
- add audit logs and admin-safe test fixtures

Exit criteria:

- machine sessions survive backend restarts and reconnects cleanly

## Phase 7: Flutter Client

- reuse backend contracts
- port the web cabinet flow to mobile
- keep the backend authoritative and the UI thin

Exit criteria:

- mobile client reaches web feature parity for the base game loop

## Phase 7a: Android APK (Capacitor)

- wrap the web cabinet in a Capacitor WebView for quick Android distribution
- configure API URL for remote server connectivity
- lock portrait orientation to match cabinet feel
- generate signed release APK

Exit criteria:

- installable APK that connects to a deployed Lucky5 server and plays identically to the browser version
- see `docs/ANDROID_BUILD.md` for build instructions

## Recommended Immediate Steps

1. Create the engine package under `src/server/engine/` and port `analysis/clean_room_engine/poker_engine.py`.
2. Freeze the first contract set for `JoinMachine`, `Deal`, `Draw`, `TakeScore`, `DoubleUp`, and balance updates.
3. Build a static web cabinet shell that matches the recording layout before wiring gameplay.
4. Add end-to-end tests around one machine session with seeded outcomes.
