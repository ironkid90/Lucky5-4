# Golden Poker Lineage Notes

## Why this reference matters

The `goldnpkr` MAME driver is a useful ancestor map for the cabinet family our Lebanese amusement poker machines descend from.

It should inform:

- control vocabulary
- round staging
- operator settings concepts
- payout governance surfaces
- jackpot presentation lineage

It should not be copied as authoritative game logic.

## Strong lineage signals from the reference

### 1. The base round loop is the right ancestor shape

The Bonanza instruction card confirms the classic flow:

- bet 1 to 10 credits
- deal
- hold / cancel
- draw
- if win, choose `TAKE SCORE` or `DOUBLE UP`

That makes the Bonanza family a solid historical source for the overall cabinet interaction grammar.

### 2. The original double-up is simpler than the Lebanese target variant

Bonanza describes a next-card gamble:

- `BIG` means 8 or more
- `SMALL` means 6 or less
- the player is betting the current win amount on the next dealt card

This is important because it tells us the Lebanese cabinet lineage likely inherited:

- a post-win gamble stage
- `TAKE SCORE` as an explicit branch
- `BIG` / `SMALL` button semantics

But it does not mean our target cabinet must use the exact same resolution logic.

The safer design stance is:

- keep Bonanza as the historical shell
- keep Lebanese-specific dealer/switch/no-lose behavior as a later regional evolution

### 3. Auto-storage and hard limits are part of the cabinet feel

The Bonanza note that winnings above 5,000 are stored automatically is especially useful.

That implies our clean-room rebuild should preserve the concept of:

- win amounts that cannot grow indefinitely on-screen
- automatic collection / forced banking thresholds
- machine-level credit handling distinct from player wallet handling

### 4. Operator-facing configuration is historically central

The reference exposes several settings surfaces:

- maximum bet
- meter over threshold
- double-up difficulty
- half gamble on/off
- win sound on/off
- percentage mode
- permanent vs interim meters

This is a strong signal that cabinet behavior is not just a paytable.

We should model operator configuration as first-class data, separate from the pure deal/draw evaluator.

### 5. "Percentage mode" belongs in operator policy, not the pure engine

The MAME notes show long-run percentage targets like 85%, 30%, 40%, and 50%.

That does not belong inside the authoritative clean-room poker reducer.

It belongs in a distinct layer:

- pure engine: deterministic cards, holds, evaluation, payout result
- operator/machine policy: credit ceilings, meters, payout pacing, presentation pacing, machine configuration

### 6. Bonus Poker matters as a jackpot lineage source

The attached reference also places `Bonus Poker` in the same broader hardware family context.

For our project, the practical takeaway is not to clone its ROM behavior directly, but to recognize the historical origin of:

- four-of-a-kind jackpot emphasis
- straight-flush jackpot emphasis
- premium-hand callouts as cabinet identity, not just math

That supports treating jackpots as a configurable overlay on top of the base paytable.

## What to absorb into the clean-room foundation now

### Keep

- a two-stage round model: base poker round, then optional gamble stage
- explicit `TAKE SCORE`
- machine credit ceilings / forced collection thresholds
- operator profile concepts
- jackpot overlays as configuration, not hard-coded magic numbers
- meter/stat concepts for later service/admin tooling

### Do not copy literally

- hidden percentage steering inside the authoritative deal/draw reducer
- hardware memory maps
- protection checks
- ROM-specific timing tricks
- cabinet-specific bugs or exploits

## Foundation changes made from this reference

The clean-room domain now has a lineage/reference layer in:

- `server/src/Lucky5.Domain/Game/CleanRoom/LineageProfiles.cs`

That file captures:

- Bonanza Golden Poker as the source for `TAKE SCORE`, 1-10 credit betting, next-card `BIG/SMALL`, operator percentage modes, meters, and 5,000-credit auto-storage
- Bonus Poker as the source for jackpot emphasis on straight flush and four of a kind

This keeps the historical lineage available to the codebase without forcing the engine to mimic compensated or ROM-bound behavior.

## Recommended next implementation step

Use these references to build a `MachineVariantProfile` bridge from:

- clean-room evaluator and double-up engine

to:

- cabinet/operator settings
- jackpot overlay rules
- UI labels and lamp states

That is the safest way to preserve ancestry while still recreating the Lebanese cabinet as its own specific machine.
