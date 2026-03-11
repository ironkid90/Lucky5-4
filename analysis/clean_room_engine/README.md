# Clean-Room Engine Reference

This folder is a clean-room starting point for the hardest game-core parts:

- deterministic deck build and shuffle
- 5-card initial deal
- hold/draw reducer
- hand evaluator
- payout resolver
- seeded double-up mini-game
- separate presentation-noise plan

## Why this exists

The APK and traffic metadata are enough to infer the gameplay loop and state model, but not enough to safely or reliably copy the live backend logic.

That means the project should start from:

1. deterministic local rules
2. configurable payout tables
3. configurable double-up tie policy
4. a separate "noise" layer that changes feel without changing outcomes

## Files

- `poker_engine.py`
  - reference implementation
- `test_poker_engine.py`
  - replayability and rules tests

## Double-Up Design Choice

The addictive part of these legacy machine games is often not just RNG. It is the combination of:

- visible dealer/challenger card rhythm
- suspense timing
- tie behavior
- partial predictability that players feel but cannot quite model

For that reason the implementation separates:

- outcome seed:
  - controls actual cards and win/loss
- noise seed:
  - controls suspense delay, pulse frames, decoy swaps, reveal timing

That lets you tune the "machine feel" without contaminating the provable game state.

## What the local captures help with

The `.txt` and `.pcap` files help only at metadata level:

- confirming `www.ai9poker.com`
- confirming HTTPS / Cloudflare edge usage
- confirming the app is session-heavy and realtime-capable
- estimating burstiness around join / play / double-up

They do not give plaintext game payloads or authoritative server RNG.

## Quick test

```powershell
python -m unittest discover -s analysis\clean_room_engine -p "test_*.py"
```

## Good next step

Use this module as the rules core, then build:

1. a machine session state model
2. a replay log format
3. a UI simulator for timing/noise tuning
4. multiple double-up profiles that reflect different Lebanese machine variants
