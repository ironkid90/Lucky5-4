# Lucky5 Clean-Room Rebuild

This repository is the working clean-room recreation of a Lebanese amusement video poker machine lineage. The codebase combines APK-derived behavioral research, cabinet-feel reference material, and a deterministic backend engine foundation without adopting payout-steering logic from the legacy app.

## What is already in place

- Clean-room engine primitives in `server/src/Lucky5.Domain/Game/CleanRoom/`:
  - deterministic seed flow
  - five-card deal and draw reducer
  - hand evaluation and payout modeling
  - first-pass Lucky5-style double-up behavior
  - lineage profiles for Golden Poker / Bonus Poker influence
- Backend scaffold in `server/`:
  - REST API (`/api/*`)
  - SignalR hub (`/CarrePokerGameHub`)
  - in-memory runtime services for local development
  - domain, application, infrastructure, and realtime layers
- Contracts in `contracts/` for REST and SignalR surface area
- Cabinet feel, roadmap, and architecture guidance in `docs/`
- Curated clean-room analysis, scripts, and engine prototype material in `analysis/`

## Artifact Policy

The Git-tracked repo is for curated source, docs, extracted reference assets, and reproducible analysis.

Local-only artifacts stay ignored:

- raw APK / PCAP / recording captures
- temporary screenshots, summaries, and workspace state
- downloaded reverse-engineering tools
- generated reverse-engineering dumps that can be regenerated

This keeps the repository pushable while preserving a richer private working set locally.

## Repository Layout

- `server/` ASP.NET API, domain model, realtime services, and tests
- `contracts/` API and hub contracts
- `docs/` architecture, roadmap, and cabinet-feel references
- `analysis/` clean-room findings, metadata summaries, and engine prototype work
- `client/` Flutter skeleton for later parity work
- `infra/` local and staging-style runtime configuration
- `resources/` and `sources/` extracted reference material already curated for the project

## Quick Start

Run the clean-room Python engine checks:

```powershell
python -m unittest discover -s analysis\clean_room_engine -p "test_*.py" -v
```

Run the .NET bootstrap verification:

```powershell
dotnet run --project C:\Users\Gabi\Desktop\New folder\server\tests\Lucky5.Tests\Lucky5.Tests.csproj
```

Run the API locally:

```powershell
dotnet run --project server/src/Lucky5.Api/Lucky5.Api.csproj
```

Optional docker stack:

```powershell
docker compose -f infra/docker-compose.yml --env-file infra/.env.local.example up -d --build
```

Default API URL: `http://localhost:5051`  
Default hub URL: `http://localhost:5051/CarrePokerGameHub`

## Active Sources Of Truth

- `analysis/clean-room-kickoff.md`
- `analysis/lucky5-foundation-summary.md`
- `analysis/golden-poker-lineage-notes.md`
- `docs/ARCHITECTURE.md`
- `docs/ROADMAP.md`
- `docs/GAME_FEEL_REFERENCE.md`

## Immediate Next Work

- finish the machine session and ledger layer around the deterministic engine
- stabilize REST and SignalR contracts around the clean-room reducer
- stand up the web-first playable cabinet slice before mobile parity work
# Lucky5-4
