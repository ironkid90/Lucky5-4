# Agent Instructions

## Package Manager
- No canonical package manager yet.
- Python tooling: `python`
- .NET tooling: `dotnet`
- Git on this machine: `& 'C:\Program Files\Git\cmd\git.exe' ...`

## File-Scoped Commands
| Task | Command |
|------|---------|
| Engine tests | `python -m unittest discover -s analysis\clean_room_engine -p "test_*.py" -v` |
| Lucky5 reference bootstrap | `dotnet run --project C:\Users\Gabi\Desktop\New folder\server\tests\Lucky5.Tests\Lucky5.Tests.csproj` |
| Repo status | `& 'C:\Program Files\Git\cmd\git.exe' -C C:\Users\Gabi\Desktop\New folder status -sb` |

## Key Conventions
- `C:\Users\Gabi\Desktop\New folder` is the canonical repo.
- `C:\Users\Gabi\Desktop\Lucky5` is reference-only; salvage structure and contracts, not payout-steering logic.
- Keep authoritative game logic deterministic and separated from presentation noise, cabinet feel, and RTP tuning.
- Treat backend state as authoritative for machine join/leave, balance, credit, and realtime updates.
- Preserve the cabinet layout and retro feel from `docs/GAME_FEEL_REFERENCE.md` and the local gameplay capture set; do not modernize it into a generic casino UI.
- Prefer a web-first playable slice before Flutter or native mobile work.
- Use `analysis\clean-room-kickoff.md`, `analysis\lucky5-foundation-summary.md`, and `docs\` as the active source of truth.
- Do not hand-edit generated reverse-engineering dumps under ignored paths; regenerate instead.
- Keep MITM/TLS notes passive and metadata-only; no bypass or decryption workflows in this repo.

## Commit Attribution
AI commits MUST include:
```
Co-Authored-By: GPT-5 Codex <noreply@openai.com>
```
