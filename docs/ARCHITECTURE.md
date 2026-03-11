# Architecture

## Sources Of Truth

1. `analysis/clean-room-kickoff.md`
2. `analysis/lucky5-foundation-summary.md`
3. `analysis/reverse-engineering-summary.md`
4. `docs/GAME_FEEL_REFERENCE.md`

## Reuse Policy

- APK findings define behavior, flows, and backend shape.
- The gameplay recording defines cabinet feel, layout, and touch ergonomics.
- `C:\Users\Gabi\Desktop\Lucky5` contributes structure, endpoint shells, assets, and naming.
- `C:\Users\Gabi\Desktop\Lucky5` does not define authoritative dealing, draw resolution, or double-up truth.

## Target System

### 1. Authoritative Engine

- deterministic seed flow
- 5-card deal
- hold and draw reducer
- hand evaluation
- payout resolution
- double-up resolution
- replayable regression fixtures

### 2. Session / Machine Backend

- machine join and leave
- machine credit state
- wallet transfer and cashier actions
- round lifecycle and audit trail
- realtime event fanout

### 3. Web Cabinet Client

- portrait-first cabinet layout
- persistent visible paytable
- machine buttons that match the recorded control deck
- realtime sync with authoritative server state
- low-friction machine selection and session recovery

### 4. Later Mobile Client

- Flutter only after the web version is mechanically correct
- shared contracts and rule assets with the backend

## Planned Repo Targets

- `src/server/engine/` deterministic rules engine
- `src/server/application/` orchestration and machine session logic
- `src/server/realtime/` hub and event contracts
- `src/web/` cabinet UI and API client
- `src/shared/` DTOs, paytables, and variant config
- `tests/engine/` deterministic rule tests
- `tests/e2e/` machine flow tests

## Non-Negotiables

- rules-first, not payout-steered
- replayable entropy
- backend-authoritative balances and machine state
- cabinet look preserved
- raw reverse-engineering artifacts remain regenerable, not hand-maintained
