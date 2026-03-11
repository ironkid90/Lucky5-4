# Module Map (Forensics Freeze)

## APK identity and platform

- Package: `com.ai9poker.app`
- App label: `Ai9Poker`
- Version from manifest: `1.0.4` (`versionCode=4`)
- App runtime: Flutter (AOT, no Dart sources included in repository)

## Firebase and messaging evidence

From `resources/res/values/strings.xml`:

- `project_id=ai9poker`
- `google_app_id=1:1022637132607:android:cb1e9193925dcbb5c9618a`
- `gcm_defaultSenderId=1022637132607`
- `google_storage_bucket=ai9poker.firebasestorage.app`

From `AndroidManifest.xml`:

- Firebase messaging background service receiver/provider entries are present.

## Flutter plugin stack (GeneratedPluginRegistrant)

Observed plugin registrations:

- `audioplayers_android`
- `connectivity_plus`
- `device_info_plus`
- `firebase_core`
- `firebase_messaging`
- `flutter_foreground_task`
- `flutter_local_notifications`
- `fluttertoast`
- `nb_utils`
- `package_info_plus`
- `path_provider_android`
- `permission_handler_android`
- `shared_preferences_android`
- `sqflite_android`
- `url_launcher_android`
- `wakelock_plus`

## Inferred Dart package/module structure

From `libapp.so` path symbols:

- Core:
  - `core/api/auth_apis.dart`
  - `core/api/home_apis.dart`
  - `core/api/signalr.dart`
  - `core/network/network_utils.dart`
  - `core/network/signalrService.dart`
  - `core/network/TimeOutManger.dart`
  - `core/utils/*`
- Models:
  - `Models/ApiResponse.dart`
  - `Models/member.dart`
  - `Models/MachineListing.dart`
  - `Models/defaultRules.dart`
  - `Models/PokerCard.dart`
  - `Models/TransferRequest.dart` (symbol noise observed as `.dartr`)
  - `Models/TermsResponse.dart`
- Presentation modules (selected):
  - `login_screen`
  - `registration_screen`
  - `otp_verification_screen`
  - `home_screen`
  - `machine_selection_screen`
  - `poker_game_screen`
  - `wallet_screen`
  - `history_screen`
  - `cashier`
  - `contact_us_screen`
  - `terms_screen`
  - `my_account_screen`
  - `account_settings_screen`
  - `support_screen`

## Rebuild mapping (clean-room)

- `server/` reproduces contracts and game loop behavior with ASP.NET + SignalR.
- `client/` mirrors inferred module boundaries in Flutter folder structure:
  - `core/api`
  - `core/network`
  - `models`
  - `presentation/*`
  - `routes`
