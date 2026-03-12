# APK Resource + Game Logic Findings (2026-03-12)

This report consolidates what was extracted from the unpacked APK artifacts already present in this repository.

## 1) Decompile/disassembly status

### Inputs used

- `resources/` (decoded APK payload: manifest, dex, libs, assets, resources)
- `sources/` (decompiled Java/Kotlin shell)
- `analysis/libapp-signals.json` (existing categorized AOT string signals)

### What the binary layout indicates

- Package: `com.ai9poker.app`
- Runtime: Flutter AOT (real app logic in `libapp.so`)
- Android Java layer is a thin shell:
  - `sources/com/ai9poker/app/MainActivity.java`
  - `sources/io/flutter/plugins/GeneratedPluginRegistrant.java`

### Native binaries found

- `resources/lib/arm64-v8a/libapp.so`
- `resources/lib/armeabi-v7a/libapp.so`
- `resources/lib/x86_64/libapp.so`

## 2) Useful extracted resources

## UI/game assets (Flutter)

Base path: `resources/assets/flutter_assets/assets/`

- Full card deck present (52 front faces + card back)
  - `assets/images/cards/*.png`
  - Verified: no missing standard 52-card codes
- Core gameplay controls present:
  - `bet(.png/_on.png)`
  - `deal_draw(.png/_on.png)`
  - `hold_on.png`, `hold_off.png`
  - `cancel_hold(.png/_on.png)`
  - `take_score(.png/_on.png)`
  - `take_half(.png/_on.png)`
  - `big(.png/_on.png)`, `small(.png/_on.png)`
- Theme/game-feel assets present:
  - `assets/images/lucky5.png`
  - `assets/images/board.png`
  - `assets/images/coin.png`
  - `assets/images/menu.png`
  - `assets/images/spinner.gif`
  - `assets/images/treasurecoins.gif`
  - `assets/images/treasureempty.gif`
  - `assets/images/press.mp3`

### Fonts and presentation

- `assets/fonts/ARCADE.ttf`
- `assets/fonts/Impact.ttf`
- Inter family (`InterRegular/Medium/SemiBold/Bold/ExtraBold`)
- MaterialIcons and LineAwesome via package assets

## 3) API/realtime evidence extracted from `libapp.so`

Direct signal dump file:

- `analysis/libapp-direct-signals-arm64.txt`

High-value strings recovered:

- Hosts/hub:
  - `https://www.ai9poker.com/api`
  - `https://www.ai9poker.com/CarrePokerGameHub`
  - `https://www.ai9poker.com/upload/`
- Auth endpoints:
  - `/Auth/login`, `/Auth/signup`, `/Auth/verify-otp`, `/Auth/resend-otp`
  - `/Auth/GetUserById`, `/Auth/MemberHistory`
  - `/Auth/TransferBalance`, `/Auth/MoveWinToBalance`, `/Auth/UpdateCredit`, `/Auth/logout`
- Game/general endpoints:
  - `/Game/games`, `/Game/games/machines`, `/Game/cards`, `/Game/defaultRules`, `/Game/offer`
  - `/General/app-settings`, `/General/contact-info`, `/General/contact-types`, `/General/contact-report`, `/General/terms`
- Realtime events/actions:
  - `JoinMachine`, `JoinedMachine`, `LeaveMachine`, `MachineStatusChanged`, `BetPlaced`
  - `machine_game_state`, `member_balance_change`

## 4) Reconstructed gameplay loop (high confidence)

Based on combined strings, assets, and controller/action names:

1. Authenticate user (OTP-capable flow).
2. Load machine list + default rules + cards + offers.
3. Join machine (`JoinMachine`) and subscribe to realtime updates.
4. Cash in / set stake (`minBetAmount`, `maxBetAmount`, `currentStake`).
5. Deal (`onDealDrawPressed`) initial 5 cards.
6. Toggle holds (`toggleHold`, cancel hold option).
7. Draw (replace non-held cards), evaluate hand.
8. Settle win/loss + wallet updates (`member_balance_change`, transfer/move-win APIs).
9. Optional double-up via `onBigPressed` / `onSmallPressed`.
10. Take score / move win to wallet / leave machine.

## 5) Hand/rule logic evidence (client-side)

Recovered rule/evaluation symbols include:

- `PokerRule`, `PokerRule.fromJson`, `getDefaultPokerRules`, `startRuleEvaluation`, `processRule`
- Hold strategy helpers:
  - `_holdOnePair`, `_holdTwoPair`, `_holdThreeOfKind`, `_holdFourOfKind`
  - `_holdStraight`, `_holdFlush`, `_holdFullHouse`
  - `_holdThreeCardFlush`, `_holdFourCardFlush`, `_holdFourCardStraight`
- Named hand categories in strings:
  - `Royal Flush`, `Straight Flush`, `4 of a Kind`, `Full House`, `3 of a Kind`, `2 Pair`

Implication: at least part of hand evaluation/hold advisory logic exists client-side, even if authoritative settlement may be server-confirmed.

## 6) Economy/wallet logic evidence

Recovered economy strings indicate explicit balance pipeline:

- Stake/bet bounds: `minBetAmount`, `maxBetAmount`, `currentStake`
- Wallet movement: `TransferBalance`, `MoveWinToBalance`, `CashIn`, `CashOut`
- Runtime fields: `lostAmount`, `bonusAmount`, `rewardAmount`, `winBonusAmount`, `newBalance`

## 7) New extraction artifacts created

- `analysis/libapp-signals-arm64.json`
- `analysis/libapp-signals-armeabi-v7a.json`
- `analysis/libapp-signals-x86_64.json`
- `analysis/libapp-direct-signals-arm64.txt`

Notes:

- ARM64 and x86_64 signal sets are effectively identical for relevant logic tokens.
- `armeabi-v7a` has some noisy trailing-`r` variants of same strings.

## 8) Known unknowns

Still not directly recoverable from this static pass alone:

- Exact authoritative server RNG/outcome algorithm
- Full SignalR payload schemas for every event
- Any backend-only payout steering or anti-cheat checks

## 9) Practical next reverse steps

1. Open `resources/lib/arm64-v8a/libapp.so` in Ghidra/IDA.
2. Pivot from recovered anchors:
   - `poker_game_controller`
   - `getDefaultPokerRules`
   - `onDealDrawPressed`, `toggleHold`, `onBigPressed`, `onSmallPressed`
   - `handleDoubleUpFromSignalR`, `updateDealtCardsFromSignalR`
3. Build message-shape map from nearby string references and callsites.
4. Keep clean-room boundary: use behavior/contracts, avoid direct code reuse.
