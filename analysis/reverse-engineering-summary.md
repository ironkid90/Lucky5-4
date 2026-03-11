# Ai9Poker APK Reverse-Engineering Summary

## Workspace State

- APK decoded with `apktool` into `analysis/apktool`
- Java-style decompilation generated with `jadx` into `analysis/jadx`
- Local `apktool.bat` patched to auto-find a Windows JDK when `JAVA_HOME` is missing
- JDK installed locally so `apktool` and `jadx` are runnable without extra setup

## High-Level Assessment

This is a **Flutter release APK**.

That matters because:

- The normal Java/Kotlin layer is almost empty
- Most app logic is compiled ahead-of-time into `libapp.so`
- Decompiled Java output will not show the real game logic
- The best readable view of the app comes from:
  - `AndroidManifest.xml`
  - Flutter assets
  - strings/symbol names embedded in `libapp.so`
  - third-party SDK wiring

## Where The Important Pieces Live

### Android shell

- Manifest: `analysis/apktool/AndroidManifest.xml`
- Main activity: `com.ai9poker.app.MainActivity`
- Decompiled Java: `analysis/jadx/app/src/main/java/com/ai9poker/app/MainActivity.java`

The Android shell mostly boots Flutter and sets screen flags. It does not contain the game rules.

Additional Android-side observations:

- Flutter embedding v2 is enabled in the manifest
- The wrapper activity defaults the Dart entrypoint to `main`
- The initial route can be supplied through Flutter route metadata or intent extras
- The Java layer is heavily obfuscated/minified, so meaningful names survive mostly in Dart strings inside `libapp.so`

### Real app logic

- `analysis/apktool/lib/arm64-v8a/libapp.so`
- `analysis/apktool/lib/armeabi-v7a/libapp.so`
- `analysis/apktool/lib/x86_64/libapp.so`

This is where the meaningful client logic lives.

### UI and gameplay assets

- `analysis/apktool/assets/flutter_assets`

Notable asset clues:

- card deck images under `assets/images/cards/`
- `deal_draw.png`
- `hold_on.png`
- `hold_off.png`
- `take_score.png`
- `take_half.png`
- `cancel_hold.png`
- `lucky5.png`
- `board.png`
- `coin.png`

These indicate a video-poker style flow with hold/draw actions and a double-up or side feature path.

## Android Plugin / SDK Stack

The generated plugin registration shows the Android shell is mostly there to host Flutter and common mobile plugins.

Notable plugins visible in decompiled output:

- Firebase Messaging
- flutter foreground task
- flutter local notifications
- sqflite
- shared preferences
- url launcher
- wakelock
- audioplayers
- connectivity plus

This supports the idea that gameplay behavior itself is not implemented in the Android layer.

## Client Architecture Inferred From Native Strings

The app appears to use **Flutter + GetX** style organization:

- routes
- bindings
- controllers
- screen-specific models

Readable module names found inside `libapp.so`:

- `package:Ai9Poker/main.dart`
- `package:Ai9Poker/routes/app_routes.dart`
- `package:Ai9Poker/core/api/auth_apis.dart`
- `package:Ai9Poker/core/api/home_apis.dart`
- `package:Ai9Poker/core/api/signalr.dart`
- `package:Ai9Poker/core/network/signalrService.dart`
- `package:Ai9Poker/core/network/network_utils.dart`
- `package:Ai9Poker/core/local_storage.dart`
- `package:Ai9Poker/core/utils/pref_utils.dart`

## Screen And Feature Map

The following screens/controllers are directly named in native strings:

- splash
- login
- registration
- otp verification
- forgot password
- home
- machine selection
- poker game screen
- wallet screen
- cashier
- history screen
- my account
- account settings
- personal details
- contact us
- support
- offer
- terms

This gives a workable product map even without original Dart source.

## Data Models Found

Model names visible in `libapp.so`:

- `member`
- `ApiResponse`
- `MachineListing`
- `defaultRules`
- `PokerCard`
- `TransferRequest`
- `TermsResponse`
- `offerDto`
- `ContactInfoResponse`
- `ContactTypeResponse`
- `ContactReportRequest`
- `wallet_model`
- `homepage`
- `AppSettingDto`
- `transcation`
- `TransactionHistory`

These model names are useful anchors when reverse engineering native control flow in Ghidra or IDA.

## Backend Surface Visible From The Client

### Base URLs

- `https://www.ai9poker.com/api`
- `https://www.ai9poker.com/CarrePokerGameHub`
- `https://www.ai9poker.com/upload/`

### REST endpoint groups seen in client strings

Auth/account:

- `/Auth/login`
- `/Auth/signup`
- `/Auth/verify-otp`
- `/Auth/resend-otp`
- `/Auth/GetUserById`
- `/Auth/logout`
- `/Auth/TransferBalance`
- `/Auth/UpdateCredit`
- `/Auth/MoveWinToBalance`
- `/Auth/MemberHistory`

General/settings/support:

- `/General/contact-info`
- `/General/contact-types`
- `/General/contact-report`
- `/General/terms`
- `/General/app-settings`

Game/catalog:

- `/Game/games`
- `/Game/games/machines`
- `/Game/cards`
- `/Game/defaultRules`
- `/Game/offer`

## Realtime Mechanics Visible From The Client

The APK clearly references **SignalR**:

- `SignalRService`
- `SignalRManager`
- `SignalRHttpClient`
- `SignalRConnectionState`
- `HubConnection`
- `HubConnectionBuilder`
- `connectWithAuth`
- `Authorization`
- `access_token`

Game-state-related realtime handlers visible in strings:

- `initializeSignalR`
- `handleDoubleUpFromSignalR`
- `updateDealtCardsFromSignalR`
- `addDoubleUpCardFromSignalR`
- `swapDoubleUpCardFromSignalR`
- `resetDoubleUpCardsFromSignalR`

### What this strongly suggests

The client likely uses:

- REST for login, config, wallet, history, offers, and machine metadata
- SignalR for live gameplay events and state synchronization

That means the actual round flow is probably not purely local. At least part of the card/deal/double-up flow appears server-driven or server-confirmed.

## What You Can Infer About Server Mechanics

From the client alone, you can infer:

- authentication is token-based
- there is OTP verification for signup/login flow
- wallet and winnings are tracked separately
- there is a transfer path between balance and winnings
- machine/rule/card metadata is requested from the API
- live updates are pushed through SignalR

What you **cannot** fully recover from the client alone:

- actual server-side dealing logic
- payout correctness rules enforced on the backend
- anti-cheat validation
- authoritative persistence rules
- real SignalR message schemas beyond what can be inferred from handlers

To understand true server-side behavior, you would need legitimate access to backend code, backend logs, or an authorized test environment.

## Background And Operational Components

The manifest also includes:

- Firebase Messaging background/service receivers
- foreground task / reboot receivers

These look operational rather than game-specific. They are useful if you want to understand push notifications, persistent tasks, or wake/restart behavior, but they are not the main path to the poker logic.

## Easiest Client-Side Mod Targets

These are the simplest things to change because they are exposed as assets or resources:

- images
- card art
- button art
- splash assets
- some labels and resource text
- manifest flags and packaging metadata

These are harder:

- actual gameplay behavior
- poker round sequencing
- wallet logic
- SignalR message handling behavior
- model parsing and rule evaluation

Those harder pieces live primarily in `libapp.so`.

## Practical Next Reverse-Engineering Steps

If the goal is to understand the app cleanly, the next useful sequence is:

1. Use `analysis/reverse-engineering-summary.md` as the map.
2. Open `analysis/apktool/lib/arm64-v8a/libapp.so` in Ghidra or IDA.
3. Use the names in this summary as search anchors:
   - `poker_game_controller`
   - `SignalRService`
   - `MachineListing`
   - `PokerCard`
   - `defaultRules`
   - `TransferBalance`
   - `MoveWinToBalance`
4. Trace from named handlers like:
   - `updateDealtCardsFromSignalR`
   - `handleDoubleUpFromSignalR`
   - `onMoveWinToWalletPressed`
5. Compare those paths against the REST endpoints and hub URL already extracted.

## Key Conclusion

If your objective is to understand the whole game quickly, do **not** spend time in the Java decompilation first. The shortest path is:

- manifest for shell behavior
- assets for UI/game structure
- `libapp.so` for real client logic
- REST/SignalR strings for backend interaction map

That is the part of the APK that actually explains how this app is put together.
