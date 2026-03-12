# Lucky5 — Developer Guide

Lucky5 is a clean-room recreation of a Lebanese amusement video poker machine (1990–2010 era). It features an ASP.NET Core 9 backend (REST API + SignalR hub) with a vanilla JS/CSS frontend, authentic Lebanese arcade aesthetics, four progressive jackpots, a Two Pair minimum qualifying hand, inline double-up Hi-Lo, and a deterministic architecture targeting 87.5% RTP.

This document is the single source of truth for anyone working on the codebase. It covers architecture, game rules, key files, data flows, and operational details.

---

## Table of Contents

1. [Repository Layout](#repository-layout)
2. [Architecture Overview](#architecture-overview)
3. [Backend Layers](#backend-layers)
4. [Frontend](#frontend)
5. [Game Rules & Mechanics](#game-rules--mechanics)
6. [Credit Accounting (Deferred Settlement)](#credit-accounting-deferred-settlement)
7. [Progressive Jackpots](#progressive-jackpots)
8. [Double-Up (Hi-Lo)](#double-up-hi-lo)
9. [RTP & Machine Policy](#rtp--machine-policy)
10. [API Reference](#api-reference)
11. [Authentication](#authentication)
12. [Configuration](#configuration)
13. [Running Locally](#running-locally)
14. [Deployment](#deployment)
15. [Reference Material](#reference-material)

---

## Repository Layout

```
Lucky5/
├── server/                          # .NET solution root
│   ├── Lucky5.sln
│   ├── src/
│   │   ├── Lucky5.Api/              # ASP.NET Core web host
│   │   │   ├── Controllers/         # REST endpoints (Auth, Game, General)
│   │   │   ├── Middleware/          # Exception handling, bearer token extraction
│   │   │   ├── Program.cs          # App bootstrap, DI, middleware pipeline
│   │   │   └── wwwroot/            # Static frontend (HTML/CSS/JS/assets)
│   │   │       ├── index.html
│   │   │       ├── css/game.css
│   │   │       ├── js/game.js
│   │   │       └── assets/         # Images, fonts, sounds
│   │   ├── Lucky5.Application/     # Service contracts + DTOs
│   │   │   ├── Contracts/          # IAuthService, IGameService, etc.
│   │   │   ├── Dtos/               # API response shapes
│   │   │   └── Requests/           # API request shapes
│   │   ├── Lucky5.Domain/          # Core domain logic (no dependencies)
│   │   │   ├── Entities/           # GameRound, MachineLedgerState, User, etc.
│   │   │   └── Game/
│   │   │       ├── CleanRoom/      # THE CORE ENGINE (see below)
│   │   │       ├── PokerHandEvaluator.cs
│   │   │       ├── DeckBuilder.cs
│   │   │       ├── HandTensionAnalyzer.cs
│   │   │       └── RoundNoiseRng.cs
│   │   ├── Lucky5.Infrastructure/  # Service implementations
│   │   │   └── Services/
│   │   │       ├── GameService.cs     # Main game orchestrator
│   │   │       ├── AuthService.cs
│   │   │       ├── InMemoryDataStore.cs
│   │   │       └── SimpleTokenService.cs
│   │   ├── Lucky5.Realtime/        # SignalR hub
│   │   │   ├── CarrePokerGameHub.cs
│   │   │   └── Services/           # ConnectionRegistry, HeartbeatMonitor
│   │   └── Lucky5.Simulation/      # RTP simulation runner
│   ├── sql/                        # Database migration scripts (future)
│   └── tests/                      # xUnit test project
├── client/                         # Flutter skeleton (future mobile parity)
├── contracts/                      # OpenAPI + SignalR schema references
│   ├── openapi/
│   └── signalr/
├── docs/                           # This documentation
│   ├── README.md                   # You are here
│   ├── GAME_FEEL_REFERENCE.md      # Visual design reference from original cabinet
│   ├── ANDROID_BUILD.md            # Capacitor APK build guide
│   └── forensics/                  # Original APK reverse-engineering findings
├── analysis/                       # Clean-room research & prototypes
│   ├── clean_room_engine/          # Python engine prototype
│   └── *.md / *.json               # Research notes, signal extraction data
├── infra/                          # Docker Compose, nginx, env templates
└── resources/                      # Extracted APK reference material
```

---

## Architecture Overview

The system follows a three-layer deterministic engine design:

```
┌─────────────────────────────────────────────────────┐
│  LAYER 3: Presentation Noise                        │
│  Frontend (vanilla JS) + server noise seed          │
│  Randomized timing, animations, visual effects      │
└─────────────────────────┬───────────────────────────┘
                          │ REST + SignalR
┌─────────────────────────┴───────────────────────────┐
│  LAYER 2: Machine Policy (MachinePolicy.cs)         │
│  RTP tracking, distribution modes, payout scaling   │
│  Deck composition alteration, streak management     │
└─────────────────────────┬───────────────────────────┘
                          │
┌─────────────────────────┴───────────────────────────┐
│  LAYER 1: Deterministic Core (CleanRoom/)           │
│  SplitMix64 RNG, 5-card draw, hand evaluation,     │
│  double-up engine, paytable, lineage profiles       │
└─────────────────────────────────────────────────────┘
```

All game outcomes are determined server-side. The frontend is a thin presentation layer that receives results via REST API calls and renders them with appropriate animations.

---

## Backend Layers

### Lucky5.Domain — Core Engine (`Game/CleanRoom/`)

This is the heart of the system. All files here are pure logic with no external dependencies.

| File | Purpose |
|------|---------|
| `CoreModels.cs` | Enums and records: `HandCategory`, `PaytableProfile`, `RoundState`, card representations |
| `DeterministicRng.cs` | SplitMix64 seeded RNG — all randomness flows through this |
| `FiveCardDrawEngine.cs` | Deal 5 cards, evaluate holds, draw replacements, evaluate final hand |
| `Lucky5DoubleUpEngine.cs` | Hi-Lo double-up loop: dealer card, guess, switch, 5♠ trigger, SafeFail, MachineClosed |
| `MachinePolicy.cs` | RTP management: distribution modes (COLD/NEUTRAL/HOT), deck alteration, payout scaling |
| `LineageProfiles.cs` | Cabinet variant profiles (Golden Poker, Bonus Poker lineage) |
| `PresentationNoiseGenerator.cs` | Separate noise seed for timing/visual variance |

### Lucky5.Domain — Entities

| Entity | Purpose |
|--------|---------|
| `GameRound` | Single hand lifecycle: deal → draw → optional double-up → settle. Tracks `WinAmount`, `OriginalWinAmount`, `IsPayoutSettled` |
| `MachineLedgerState` | Per-machine state: wallet balance, RTP tracking (CapitalIn/Out), jackpot values, streak counters, distribution mode |
| `User` | Player identity and authentication |
| `Machine` | Machine configuration |
| `PokerCard` | Card representation (suit + rank) |

### Lucky5.Application — Contracts & DTOs

Service interfaces (`IGameService`, `IAuthService`) and all API data transfer objects. The DTOs define the exact shape of every API response.

Key DTOs:
- `DealResultDto` — Cards dealt, round ID, jackpot state, advised holds
- `DrawResultDto` — Final hand, win amount, hand rank, updated jackpots
- `DoubleUpResultDto` — Guess result, current amount, wallet balance, status

### Lucky5.Infrastructure — Service Implementations

| Service | Purpose |
|---------|---------|
| `GameService.cs` | The main orchestrator — implements `IGameService`. Handles deal, draw, double-up, cashout, jackpot logic. ~1200 lines. |
| `InMemoryDataStore.cs` | Non-persistent storage for users, rounds, machines, ledger state. Replaced by database in production. |
| `AuthService.cs` | Login, signup, OTP verification |
| `SimpleTokenService.cs` | JWT token generation/validation |

### Lucky5.Realtime — SignalR Hub

`CarrePokerGameHub.cs` provides real-time communication for machine join/leave, state sync, and heartbeat. The game currently uses REST API for gameplay actions, with SignalR available for future real-time event fanout.

---

## Frontend

The frontend is a single-page vanilla JS/CSS application served as static files from `wwwroot/`.

### Key Files

| File | Purpose |
|------|---------|
| `index.html` | Page structure, login/signup screens, game layout, button grid |
| `css/game.css` | All styling — retro arcade aesthetic, card designs, animations |
| `js/game.js` | All game logic — API calls, state machine, animations, UI updates |

### Game States

The frontend operates as a state machine with these states:

| State | Description |
|-------|-------------|
| `idle` | Waiting for bet. BET button active. |
| `betting` | Bet placed, waiting for DEAL. BET and DEAL active. |
| `dealt` | Cards dealt, selecting holds. HOLD buttons + DEAL DRAW active. |
| `drawing` | Draw in progress (brief). |
| `result` | Hand evaluated, win/loss shown. If win → can enter double-up. |
| `win` | Win displayed, TAKE SCORE drains credits. |
| `doubleup` | In double-up mode. BIG/SMALL/SWITCH/TAKE SCORE/TAKE HALF active. |
| `shuffling` | Card shuffle animation during double-up. |

### UI Layout (Top to Bottom)

1. **Paytable** — Rainbow-colored hand rankings with live payout values
2. **Card Area** — 5 cards during play, single large card during double-up
3. **Info Bar** — CREDIT | WIN | STAKE displays
4. **Jackpot Bar** — 4 progressive jackpot tickers (4K-A, FH, 4K-B, SF)
5. **Control Deck** — Physical-style beveled buttons on wood-grain background

### Button Color Convention (Lebanese Cabinet)

- **DEAL DRAW**: Red (opposite of Western convention)
- **BET**: Green (opposite of Western convention)
- **HOLD 1–5 / BIG / SMALL**: Amber/gold
- **TAKE SCORE**: Orange
- **TAKE HALF**: Red
- **CANCEL HOLD**: Cream/beige

---

## Game Rules & Mechanics

### Basic Flow

1. **Bet** — Player places bet (5,000–10,000, increment 100)
2. **Deal** — 5 cards dealt; bet deducted from wallet
3. **Hold/Draw** — Player selects holds (auto-hold suggests optimal); draw costs another bet
4. **Evaluate** — Hand ranked, payout calculated per Lebanese paytable
5. **Win/Lose** — If win, player can Take Score or enter Double-Up
6. **Double-Up** — Optional Hi-Lo game to multiply winnings

### Paytable (Lebanese Profile)

| Hand | Multiplier |
|------|-----------|
| Royal Flush | 1000x |
| Straight Flush | 75x |
| Four of a Kind | 15x |
| Full House | 12x |
| Flush | 10x |
| Straight | 8x |
| Three of a Kind | 3x |
| Two Pair | 2x |

Minimum qualifying hand is **Two Pair**. Single pair does not pay.

### Betting

- Min: 5,000 / Max: 10,000 / Step: 100
- **Double deduction**: Deal costs 1x bet, Draw costs another 1x bet (total 2x per round)
- After completing a hand, first BET press resets to 5,000
- Starting credits: 200,000 (demo mode)

### Auto-Hold

After dealing, the engine suggests optimal holds:
- Priority: quads > full house > flush > straight > trips > two pair > 4-to-flush > 4-to-straight > pair
- Player can override by clicking individual cards

---

## Credit Accounting (Deferred Settlement)

This is a critical architectural decision. Draw wins are **not** immediately credited to the player's wallet.

### How It Works

1. `DrawAsync` evaluates the hand and records `WinAmount` on the `GameRound` — but does **not** add it to the wallet balance
2. The WIN indicator displays the pending win separately from CREDITS
3. Settlement (wallet credit) only occurs at:
   - **Take Score** — Full cashout, triggers drain animation
   - **Take Half** — Instant partial cashout (half to wallet, half continues in double-up)
   - **FinalizeDoubleUp** — Double-up ends (win or lose)

### Key Fields on GameRound

| Field | Purpose |
|-------|---------|
| `WinAmount` | Current win value (may change via Take Half) |
| `OriginalWinAmount` | Immutable original draw win (for ledger delta tracking) |
| `IsPayoutSettled` | Idempotency guard — prevents double-crediting on repeated cashout calls |

### Why Deferred Settlement?

- Prevents the **Take Half + Lose clawback bug**: if wins were immediately credited, losing after Take Half would need to claw back from the wallet
- Prevents the **double-cashout exploit**: `IsPayoutSettled` ensures only one settlement per round
- Clean separation between "display win" and "settled credits"

---

## Progressive Jackpots

Four jackpot slots are tracked per machine:

| Slot | Trigger Condition | Max Value | Reset Value (20%) |
|------|------------------|-----------|-------------------|
| Full House (FH) | FH trips rank matches player's chosen rank | 25,000,000 | 5,000,000 |
| Four of a Kind A (4K-A) | 4K hit while slot A is active | 999,999 | 199,999 |
| Four of a Kind B (4K-B) | 4K hit while slot B is active | 999,999 | 199,999 |
| Straight Flush (SF) | Any straight flush | 20,000,000 | 4,000,000 |

### Growth

- **Flat +100** to every jackpot per hand played
- Both deal and draw phases contribute +100 each (so +200 total per completed hand)
- All jackpots start at 20% of their maximum value
- On win, jackpot resets to 20% of max

### 4K Slot Selection

- Machine randomly selects which 4K slot (A or B) is active per round
- Only the active slot can be won; the active slot glows in the UI
- Selection is deterministic (based on game seed)

### FH Jackpot Rank

- Player chooses a qualifying rank (A, K, Q, J, etc.) by pressing HOLD 1 when idle
- Only a Full House where the trips rank matches the chosen rank triggers the jackpot
- Default rank: Ace

### Royal Flush

Royal Flush has no progressive jackpot but can be doubled up to the 50,000,000 credit limit.

---

## Double-Up (Hi-Lo)

After any winning hand, the player can enter an inline Hi-Lo game to multiply their winnings.

### Mechanics

1. A **dealer card** is shown (face up)
2. Player guesses **BIG** (8–K) or **SMALL** (2–6)
3. A **player card** is drawn:
   - Correct guess: win amount doubles
   - Wrong guess: lose everything
   - **Ace**: always wins regardless of guess direction
   - **7**: always loses (push/lose)

### Switch Mechanic

- Player can **switch** the dealer card up to **2 times** per round
- Each switch consumes the next card from the deterministic deck
- Strategic: allows avoiding unfavorable dealer cards

### Five of Spades (5♠) — Lucky Card

When the **5 of Spades** appears as the dealer card (after a switch):
- Win amount is multiplied by **4x**
- **No-Lose mode** activates for that round
- If the player guesses wrong: **SafeFail** — the current amount is banked instead of lost
- Visual: yellow flash, "LUCKY 5" banner

### MachineClosed

If win amount reaches **50,000,000** (MAX_CREDIT_LIMIT):
- Double-up ends automatically
- Credits auto-drain to wallet with animation (no manual action needed)
- Message: "MACHINE CLOSED - MAX CREDITS!"

### Take Score vs Take Half

| Action | Effect |
|--------|--------|
| Take Score | Ends double-up, full amount drains to credits with animation |
| Take Half | Instantly takes half to credits (no animation), continues double-up with remaining half |

Take Half does **not** stop the double-up. If the remaining half is 0, it exits to idle.

---

## RTP & Machine Policy

Target RTP: **87.5%** across all machines.

### How RTP Is Achieved

The natural base RTP from the paytable + double deduction is ~38%. The Machine Policy layer bridges this to 87.5% through two mechanisms:

1. **Deck Composition Alteration** — Before dealing, the policy can add or remove cards:
   - **COLD mode**: Removes high cards and 5♠, making wins less likely
   - **NEUTRAL mode**: Standard deck
   - **HOT mode**: Injects extra 5♠ and high cards, making wins more likely

2. **Payout Scaling** — Win payouts are multiplied by a scale factor (~2.3x base):
   - Small wins (2P, 3K): 0.95x modifier
   - Medium wins (ST, FL, FH): 1.05x modifier
   - Big wins (4K, SF, RF): 1.15x modifier

### Streak Management

The policy tracks player win/loss streaks to create natural-feeling rhythm:
- `ConsecutiveLosses` counter biases toward HOT mode after 5+ losses
- After 15+ consecutive losses: forced HOT mode with maximum deck alteration
- After a win: 2–4 round cooldown before allowing next HOT phase
- Tracks `RoundsSinceMediumWin` for medium-tier pacing

### Key Ledger Fields (MachineLedgerState)

| Field | Purpose |
|-------|---------|
| `CapitalIn` | Total money wagered |
| `CapitalOut` | Total money paid out |
| `BaseCapitalOut` | Unscaled payouts (for accurate scaling) |
| `CurrentRtp` | Running RTP percentage |
| `ConsecutiveLosses` | Loss streak counter |
| `CooldownRoundsRemaining` | Post-win cooldown |
| `CurrentDistributionMode` | COLD / NEUTRAL / HOT |

---

## API Reference

Base URL: `http://localhost:5000/api`

### Authentication

| Method | Endpoint | Purpose |
|--------|----------|---------|
| POST | `/Auth/signup` | Create account (requires `username`, `password`, `phoneNumber`) |
| POST | `/Auth/login` | Login (returns tokens) |
| POST | `/Auth/verify-otp` | Verify OTP code (field: `otpCode`, hardcoded `123456` in dev) |

### Game Actions

| Method | Endpoint | Purpose |
|--------|----------|---------|
| POST | `/Game/cards/deal` | Deal 5 cards. Body: `{ machineId, betAmount }` |
| POST | `/Game/cards/draw` | Draw replacements. Body: `{ roundId, holdIndexes }` |
| POST | `/Game/double-up/start` | Start double-up session |
| POST | `/Game/double-up/guess` | Guess big/small. Body: `{ roundId, guess }` |
| POST | `/Game/double-up/switch` | Switch dealer card. Body: `{ roundId }` |
| POST | `/Game/double-up/cashout` | Cashout during double-up. Body: `{ roundId }` |
| POST | `/Game/double-up/take-half` | Take half, continue double-up. Body: `{ roundId }` |
| POST | `/Game/jackpot/rank` | Change jackpot qualifying rank |
| GET | `/Game/machine/{id}/state` | Get machine RTP/state info |

### General

| Method | Endpoint | Purpose |
|--------|----------|---------|
| GET | `/General/settings` | App settings |
| GET | `/General/contact-types` | Contact form types |
| GET | `/General/terms` | Terms and conditions |
| GET | `/health/live` | Liveness probe |
| GET | `/health/ready` | Readiness probe |

### SignalR Hub

- Route: `/CarrePokerGameHub`
- Transport: WebSockets preferred
- Auth: Bearer token via query `access_token` or Authorization header
- Methods: `JoinMachine`, `LeaveMachine`, `Deal`, `Draw`, `DoubleUp`, `Heartbeat`, `ReconnectSync`

---

## Authentication

- JWT-based authentication with access + refresh tokens
- OTP verification required after signup
- Dev mode: OTP is hardcoded to `123456`
- In-memory user store (no persistence across restarts)

---

## Configuration

| File | Purpose |
|------|---------|
| `server/src/Lucky5.Api/appsettings.json` | JWT settings, CORS, game configuration |
| `server/src/Lucky5.Api/appsettings.Development.json` | Dev-specific log levels |
| `server/src/Lucky5.Api/Properties/launchSettings.json` | Launch profiles, port config |

### Environment Variables

| Variable | Default | Purpose |
|----------|---------|---------|
| `PORT` | 5000 | HTTP listen port |
| `ASPNETCORE_ENVIRONMENT` | Development | Runtime environment |

---

## Running Locally

### On Replit

The application is configured to run via workflow:
```bash
cd server && dotnet run --project src/Lucky5.Api/Lucky5.Api.csproj --launch-profile http
```
Port 5000. The frontend is served as static files from the same server.

### Direct

```bash
dotnet run --project server/src/Lucky5.Api/Lucky5.Api.csproj --launch-profile http
```

### Docker (Optional)

```bash
docker compose -f infra/docker-compose.yml --env-file infra/.env.local.example up -d --build
```

---

## Deployment

- Target: VM deployment (always-running, required for SignalR WebSocket state)
- Run command: `bash -c "cd server && dotnet run --project src/Lucky5.Api/Lucky5.Api.csproj --launch-profile http"`
- Runtime: .NET 9.0

---

## Reference Material

### In This Repository

| Location | Content |
|----------|---------|
| `docs/GAME_FEEL_REFERENCE.md` | Pixel-accurate visual design reference from original Lebanese cabinet |
| `docs/ANDROID_BUILD.md` | Capacitor-based Android APK build instructions |
| `docs/forensics/` | Original APK reverse-engineering findings (endpoints, events, module map) |
| `analysis/` | Clean-room engine prototype (Python), signal extraction, research notes |
| `contracts/` | OpenAPI and SignalR contract schemas from original app |
| `resources/` | Extracted APK reference material (manifest, assets, protos) |
| `Gameplay&Math-logic.txt` | Original gameplay and math logic reference document |

### Key Design Decisions

1. **Clean-room approach**: Game logic was independently reimplemented based on behavioral analysis, not code copying
2. **Deterministic engine**: All randomness flows through SplitMix64 with known seeds — every outcome is replayable
3. **Backend-authoritative**: Frontend is a thin display layer; all game state lives on the server
4. **Deferred settlement**: Wins are not credited until explicitly cashed out (prevents accounting bugs)
5. **Lebanese paytable**: Uses the specific multiplier profile from the original machines (Two Pair minimum, DEAL=red/BET=green convention)
