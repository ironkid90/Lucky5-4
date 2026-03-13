# Lucky5

A clean-room recreation of a Lebanese amusement video poker machine (1990–2010 era).

ASP.NET Core 9 backend with vanilla JS/CSS frontend. Features authentic Lebanese arcade aesthetics, four progressive jackpots, Two Pair minimum hand, inline double-up Hi-Lo mechanic, and deterministic architecture targeting 87.5% RTP.

## Quick Start

```bash
cd server && dotnet run --project src/Lucky5.Api/Lucky5.Api.csproj --launch-profile http
```

Opens on port 5000. Frontend is served as static files from the same server.

## Documentation

See **[docs/README.md](docs/README.md)** for the comprehensive developer guide covering:

- Architecture and three-layer engine design
- All game rules, paytable, and mechanics
- Credit accounting and deferred settlement model
- Progressive jackpot system
- Double-up Hi-Lo with 5♠ Lucky Card
- RTP and Machine Policy
- Full API reference
- Configuration and deployment

## Repository Structure

```
server/src/
├── Lucky5.Api/           Web host, controllers, static frontend (wwwroot/)
├── Lucky5.Application/   Service contracts and DTOs
├── Lucky5.Domain/        Core engine (Game/CleanRoom/), entities
├── Lucky5.Infrastructure/ Service implementations, in-memory store
├── Lucky5.Realtime/      SignalR hub
└── Lucky5.Simulation/    RTP simulation runner
```

## Reference Material

| Location | Content |
|----------|---------|
| `docs/GAME_FEEL_REFERENCE.md` | Visual design reference from original cabinet |
| `docs/forensics/` | APK reverse-engineering findings |
| `analysis/` | Clean-room engine prototype and research |
| `contracts/` | OpenAPI and SignalR schemas |
