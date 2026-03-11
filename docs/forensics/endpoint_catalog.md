# Endpoint Catalog (Forensics Freeze)

Source artifacts:

- `resources/AndroidManifest.xml`
- `resources/res/values/strings.xml`
- `sources/io/flutter/plugins/GeneratedPluginRegistrant.java`
- `resources/lib/armeabi-v7a/libapp.so` (AOT string extraction)

## Host and transport evidence

- Observed production host string: `https://www.ai9poker.com/CarrePokerGameHub`
- Observed hub path string: `CarrePokerGameHub`
- Observed SignalR class names: `HubConnection`, `HubConnectionState`, `SignalRManager`

## Auth endpoint evidence

Observed in `libapp.so`:

- `/Auth/login`
- `/Auth/signupr` (normalized to `/Auth/signup`)
- `/Auth/verify-otp`
- `/Auth/resend-otp`
- `/Auth/GetUserById`
- `/Auth/MemberHistory`
- `/Auth/TransferBalance`
- `/Auth/MoveWinToBalance`
- `/Auth/UpdateCredit`
- `/Auth/logoutr` (normalized to `/Auth/logout`)

Normalized clean-room API routes:

- `POST /api/Auth/login`
- `POST /api/Auth/signup`
- `POST /api/Auth/verify-otp`
- `POST /api/Auth/resend-otp`
- `GET /api/Auth/GetUserById`
- `GET /api/Auth/MemberHistory`
- `POST /api/Auth/TransferBalance`
- `POST /api/Auth/MoveWinToBalance`
- `POST /api/Auth/UpdateCredit`
- `POST /api/Auth/logout`

## Game endpoint evidence

Observed in `libapp.so`:

- `/Game/games`
- `/Game/games/machinesr` (normalized to `/Game/games/machines`)
- `/Game/defaultRules`
- `/Game/offer`
- `/Game/cards` (plus code-level deal/draw methods)

Normalized clean-room API routes:

- `GET /api/Game/games`
- `GET /api/Game/games/machines`
- `GET /api/Game/defaultRules`
- `GET /api/Game/offer`
- `POST /api/Game/cards/deal`
- `POST /api/Game/cards/draw`
- `POST /api/Game/double-up`

## General endpoint evidence

Observed in `libapp.so`:

- `/General/app-settings`
- `/General/contact-info`
- `/General/contact-types`
- `/General/contact-report`
- `/General/terms`

Normalized clean-room API routes:

- `GET /api/General/app-settings`
- `GET /api/General/contact-info`
- `GET /api/General/contact-types`
- `POST /api/General/contact-report`
- `GET /api/General/terms`

## Forensic normalization rules

1. Trailing symbol noise (`r`) stripped from route suffixes.
2. Route casing preserved from observed strings for compatibility.
3. All routes mapped under clean-room base prefix `/api`.
4. No runtime calls to original production host; local/staging only.
