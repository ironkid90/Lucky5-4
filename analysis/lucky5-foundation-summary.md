# Lucky5 Foundation Summary

## Goal

Use the earlier `Lucky5` rebuild repo as a salvage source, compare it against the APK-derived clean-room findings already produced in this workspace, and define the best starting architecture and execution plan for a playable recreation.

## Repositories and artifacts reviewed

- Current clean-room analysis workspace:
  - `analysis/reverse-engineering-summary.md`
  - `analysis/clean-room-kickoff.md`
  - `analysis/clean_room_engine/poker_engine.py`
  - `analysis/traffic-metadata-summary.md`
- Earlier rebuild repo:
  - `C:/Users/Gabi/Desktop/Lucky5`

## Executive assessment

The `Lucky5` repo is materially useful, but not as a finished game. It is best treated as a partial scaffold plus reference implementation.

What it already gives us:

- a layered .NET backend skeleton
- REST and SignalR contracts
- machine, wallet, round, and ledger domain models
- a browser-facing web UI prototype
- a very small Flutter client skeleton
- real card/deck/evaluator code
- a first pass at replay/bootstrap verification

What it does not yet give us:

- a stable, replayable authoritative game core
- a trustworthy double-up implementation
- an end-to-end playable mobile client
- real persistence and production session handling
- alignment between all contracts, DTOs, and UI flows

Most important conclusion:

The repo is strongest as infrastructure and product scaffolding, but weakest in the heart of the game. The current `GameService` mixes deck logic with RTP steering, pity timers, hot/cold phases, and outcome-first double-up behavior. That is exactly the part we should not adopt as-is.

## What the Lucky5 repo is good for

### 1. Product and system structure

The solution layout is good:

- `server/src/Lucky5.Api`
- `server/src/Lucky5.Application`
- `server/src/Lucky5.Domain`
- `server/src/Lucky5.Infrastructure`
- `server/src/Lucky5.Realtime`

This is a reasonable base for:

- a pure engine in `Domain`
- orchestration in `Application`
- persistence/session/runtime services in `Infrastructure`
- HTTP in `Api`
- live sync in `Realtime`

### 2. Contracts and endpoint shape

The repo already defines the basic surface we need:

- machines
- deal
- draw
- double-up
- auth
- wallet/history
- machine state

The SignalR hub contract is also directionally correct for a machine game:

- join machine
- leave machine
- deal
- draw
- double-up
- reconnect sync

This is useful because it matches the APK-derived architecture at a high level.

### 3. Reusable domain primitives

These are worth keeping or adapting:

- `server/src/Lucky5.Domain/Game/DeckBuilder.cs`
- `server/src/Lucky5.Domain/Game/PokerHandEvaluator.cs`
- `server/src/Lucky5.Domain/Game/RoundNoiseRng.cs`
- `server/src/Lucky5.Domain/Entities/GameRound.cs`
- `server/src/Lucky5.Domain/Entities/MachineLedgerState.cs`

The evaluator and deck builder are especially useful as starting material, though both need review around Joker behavior and rule variants.

### 4. UI/assets/prototyping value

The repo contains:

- a browser game prototype in `server/src/Lucky5.Api/wwwroot`
- a minimal Flutter app in `client/lib`
- usable art and control assets in `wwwroot/assets`

This is valuable because we can stand up a playable web prototype much faster than rebuilding presentation from zero.

## What is wrong with the current core game logic

### 1. The round engine is not authoritative or cleanly deterministic

`GameService` currently decides round behavior using machine RTP drift and player loss state:

- `ResolveDistributionMode` forces `SuperBonus` when `SessionNetLoss > 500`
- it uses `ObservedRtp - TargetRtp`
- it transitions between `Cold`, `Hot`, and `Neutral`

This means the round outcome is not just deck-plus-holds. It is policy-driven by session and ledger state.

### 2. Draw resolution searches for preferred outcomes

`SelectFinalCards` runs repeated candidate generation and then chooses based on current mode:

- in `Cold`, it prefers lower multipliers and higher tease tension
- in `Hot`, it prefers higher multipliers within a payout budget
- in `SuperBonus`, it can force a fresh five-of-a-kind if the player breaks the hand

That is not a pure poker reducer. It is a payout steering engine.

### 3. Double-up is outcome-first

The current double-up path computes win/loss first, then generates a card to match the outcome.

This is the clearest line in the whole repo:

- `Quantum Double Up: Determine card AFTER outcome is decided`

That makes the current implementation unacceptable as the authoritative basis for the final game if the goal is a coherent rules engine.

### 4. Replayability is broken

Replay tests assume fixed entropy, but draw and double-up re-mix `DateTime.UtcNow.Ticks` into the seed path.

That means:

- live behavior cannot be reproduced exactly
- deterministic regression tests are compromised
- variant tuning becomes harder than it needs to be

## Concrete defects found

### 1. The repo's own bootstrap verification crashes

`dotnet test` is misleading here because `Lucky5.Tests` is a console app, not a real test project. The real verification path is:

```powershell
dotnet run --project C:\Users\Gabi\Desktop\Lucky5\server\tests\Lucky5.Tests\Lucky5.Tests.csproj
```

That currently fails with a `KeyNotFoundException` because `HandTensionAnalyzer` does not handle `Joker`, while the deck includes a Joker.

### 2. Double-up contracts are inconsistent

The DTO/model/contract naming for double-up status is not aligned:

- server DTO uses `UpdatedWinAmount`
- OpenAPI expects `payoutAmount`
- Flutter model expects `payoutAmount`

That will break client parsing.

### 3. SignalR double-up event is incomplete

The realtime hub emits `DoubleUpCard` without the actual revealed card payload, even though the server computed one.

### 4. Flutter client is skeletal

The Flutter app currently has only:

- login
- machine selection
- simple deal/draw screen

It is not using the repo's SignalR client and is not close to production playability yet.

### 5. Persistence is planned but not active

Docker, SQL, and Redis exist as planned infrastructure, but runtime services are still fully in-memory.

## Salvage matrix

### Keep as foundation

- solution layout
- API/controller structure
- SignalR hub shell
- in-memory store for prototyping
- machine/round/wallet entities
- OpenAPI and hub contract drafts
- browser assets and web prototype shell

### Keep, but refactor

- deck builder
- evaluator
- RNG helper
- replay/bootstrap harness
- Flutter navigation and API wrappers

### Do not adopt as authoritative logic

- `ResolveDistributionMode`
- hot/cold/pity payout steering inside core round resolution
- candidate-search draw outcome selection
- forced super-bonus replacement logic
- current outcome-first double-up implementation

## Best target architecture from here

### 1. Build around a pure engine first

The authoritative engine should be a standalone deterministic core with no wall-clock time and no wallet logic inside it.

Core inputs:

- ruleset id / variant id
- round seed
- initial deal seed or deck state
- bet
- hold indexes
- double-up decision inputs

Core outputs:

- initial 5-card hand
- final 5-card hand
- hand rank
- payout multiplier
- double-up reveal card
- double-up result

This core should live separately from:

- auth
- wallet
- RTP or machine telemetry
- session persistence
- UI noise/presentation effects

### 2. Separate game truth from machine policy

If the final product wants authentic Lebanese machine behavior, keep that as a second layer:

- `authoritative_engine`
- `machine_behavior_policy`

The first answers "what actually happened."
The second answers "what pacing, tease, sound, and presentation should the player feel."

That separation is the only way to support:

- deterministic testing
- multiple variants
- later experimentation with arcade compensation behavior
- a fair clean-room model of the rule system itself

### 3. Treat double-up as its own domain

Double-up is not a small post-win gimmick. It needs a dedicated domain module with:

- reveal model
- card rank partition rules
- per-variant big/small semantics
- continuation loop state
- take-half / take-score behavior
- seeded replay
- transcript logging

### 4. Ship web-first, then mobile

Given what already exists, the fastest path to something playable is:

1. pure engine library
2. .NET backend using that engine
3. browser prototype hooked to new engine
4. only then Flutter/mobile

That uses the Lucky5 repo's strongest assets instead of fighting its weakest ones first.

## Recommended project plan

### Phase 0: Freeze and classify references

Output:

- archive current Lucky5 repo as reference only
- identify files to import, adapt, or ignore
- lock current APK findings into a rules brief

Tasks:

- mark `Lucky5` as scaffold/reference
- keep `server/src/*` as canonical if we borrow backend structure
- ignore `server/Lucky5.Server`
- extract paytable/rules assumptions from current repo into a single brief

### Phase 1: Authoritative engine

Output:

- deterministic core engine
- golden tests
- replay transcripts

Tasks:

- formalize card model, deck model, and Joker semantics
- formalize deal and hold/draw reducer
- formalize evaluator and payout tables
- implement double-up as a pure sub-engine
- add golden tests for known hands and seeded rounds
- add variant hooks for Lebanese machine families

Starting point:

- adapt ideas from `analysis/clean_room_engine/poker_engine.py`
- borrow useful evaluator/deck concepts from `Lucky5.Domain/Game`

### Phase 2: Backend integration

Output:

- stable .NET game API over pure engine

Tasks:

- replace `GameService` round truth logic with engine calls
- keep wallet/session/auth orchestration outside the engine
- remove wall-clock seed mixing from authoritative flow
- fix DTO and OpenAPI alignment
- make replay verification a real test project

### Phase 3: Web playable slice

Output:

- browser-playable machine with:
  - login or demo session
  - machine select
  - bet
  - deal
  - holds
  - draw
  - payout
  - double-up loop

Tasks:

- hook `wwwroot/js/game.js` to corrected endpoints
- fix double-up UI flow
- expose round transcript for debugging
- use current art/audio as placeholder cabinet feel

### Phase 4: Variant and machine behavior layer

Output:

- configurable machine profiles

Tasks:

- define variant schema:
  - deck composition
  - Joker/wild rules
  - evaluator priority
  - payout table
  - double-up rules
  - take-half availability
  - tease/presentation settings
- encode 2-4 Lebanese variants
- compare feel against observed user knowledge and APK naming

### Phase 5: Mobile client

Output:

- real Flutter client

Tasks:

- generate full Flutter project
- add token/session persistence
- hook either REST-only or REST+SignalR
- port web gameplay flow
- add wallet/history/cashier/support screens

## Recommended immediate next steps

If the goal is "great grounds to start on," the correct next work order is:

1. create a clean .NET engine module or port the existing Python clean-room engine to .NET
2. replace Lucky5's authoritative round logic with pure deterministic engine calls
3. get the browser prototype playable first
4. only then expand into full Flutter/mobile

## Practical decision

Use the Lucky5 repo for:

- architecture
- contracts
- entities
- web shell
- assets
- API plumbing

Do not use it as-is for:

- core round truth
- payout truth
- double-up truth
- deterministic replay

That combination gives the strongest base with the least wasted effort.

## Verification performed

Commands run:

```powershell
dotnet --info
dotnet test C:\Users\Gabi\Desktop\Lucky5\server\Lucky5.sln
dotnet run --project C:\Users\Gabi\Desktop\Lucky5\server\tests\Lucky5.Tests\Lucky5.Tests.csproj
```

Results:

- .NET 9 SDK is installed
- `dotnet test` did not execute meaningful test cases because the test project is a console app
- the actual bootstrap runner fails due to Joker handling in `HandTensionAnalyzer`

