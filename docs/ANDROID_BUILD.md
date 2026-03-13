# Android APK Build Guide

## Overview

The Lucky5 Android app is a **Capacitor wrapper** around the existing web frontend.
It packages the HTML/CSS/JS cabinet UI into a native Android WebView so the game
can be installed and launched as a regular Android app.

The game logic remains **backend-authoritative** — the Android app connects to
the Lucky5 API server over the network, exactly like the browser version.

## Prerequisites

| Tool            | Version   | Notes                                          |
|-----------------|-----------|-------------------------------------------------|
| Node.js         | ≥ 18      | for Capacitor CLI and sync scripts              |
| npm             | ≥ 9       | ships with Node                                 |
| Android Studio  | ≥ 2024.x  | for building the APK / running on device        |
| JDK             | 17+       | required by AGP (Android Gradle Plugin)         |

> **Tip**: Install Android Studio from https://developer.android.com/studio.
> Accept SDK licenses via `sdkmanager --licenses` if building from the CLI.

## Quick Start

```bash
# 1 — Install npm dependencies
cd mobile
npm install

# 2 — Configure API server URL
#     Copy the template and edit with your server address
cp env.example.json env.json
#     Edit env.json → set "apiUrl" to your server (e.g. "https://lucky5.example.com")

# 3 — Sync web assets & Capacitor Android project
npm run build
#     This copies wwwroot → mobile/www (patching paths), then syncs to Android.

# 4 — Open in Android Studio
npm run cap:open
#     Build & run from Android Studio, or use the CLI:
#     npx cap run android
```

## Build Commands

| Command              | Description                                          |
|----------------------|------------------------------------------------------|
| `npm run sync-web`   | Copy & patch web assets from wwwroot → mobile/www    |
| `npm run build`      | sync-web + Capacitor sync to Android                 |
| `npm run cap:sync`   | Same as build (alias)                                |
| `npm run cap:open`   | Open Android project in Android Studio               |
| `npm run cap:run`    | Build & deploy to connected device/emulator          |

## API URL Configuration

The web app needs to know where the Lucky5 backend is running. There are two ways
to configure this:

### Option A: `env.json` file (recommended)

Create `mobile/env.json`:
```json
{
  "apiUrl": "https://lucky5.example.com"
}
```

### Option B: CLI flag

```bash
node scripts/sync-web.mjs --api-url "https://lucky5.example.com"
```

> **Important**: `env.json` is git-ignored. Each developer sets their own server URL.

## Project Structure

```
mobile/
├── package.json              # npm project & build scripts
├── capacitor.config.json     # Capacitor configuration
├── env.example.json          # API URL template (committed)
├── env.json                  # Local API URL override (git-ignored)
├── scripts/
│   └── sync-web.mjs          # Copies wwwroot → www with path patches
├── www/                       # Synced web assets (git-ignored, generated)
└── android/                   # Native Android project (Capacitor-managed)
    ├── app/
    │   ├── src/main/
    │   │   ├── AndroidManifest.xml
    │   │   ├── java/com/lucky5/videopoker/
    │   │   │   └── MainActivity.java
    │   │   ├── assets/public/      # Web assets (synced, git-ignored)
    │   │   └── res/                # Android resources (icons, themes)
    │   └── build.gradle
    ├── build.gradle
    ├── gradle/
    └── variables.gradle
```

## Building a Release APK

Once the debug workflow is working:

```bash
# 1 — Sync assets
cd mobile
npm run build

# 2 — Build release APK via Gradle
cd android
./gradlew assembleRelease

# Output: android/app/build/outputs/apk/release/app-release-unsigned.apk
```

### Signing the APK

For distribution, the APK must be signed:

```bash
# Generate a keystore (one-time)
keytool -genkey -v -keystore lucky5-release.keystore \
  -alias lucky5 -keyalg RSA -keysize 2048 -validity 10000

# Sign the APK
jarsigner -verbose -sigalg SHA256withRSA -digestalg SHA-256 \
  -keystore lucky5-release.keystore \
  android/app/build/outputs/apk/release/app-release-unsigned.apk lucky5

# Align (optimize)
zipalign -v 4 \
  android/app/build/outputs/apk/release/app-release-unsigned.apk \
  lucky5-release.apk
```

> **Keep your keystore safe** — it's required for all future updates. The
> `.keystore` file is git-ignored.

## Customizing the App

### App Icon

Replace the launcher icon files in:
```
android/app/src/main/res/mipmap-*/ic_launcher.png
android/app/src/main/res/mipmap-*/ic_launcher_round.png
```

Use [Android Asset Studio](https://romannurik.github.io/AndroidAssetStudio/)
to generate all density variants from a single image.

### Splash Screen

Capacitor supports splash screens via the `@capacitor/splash-screen` plugin:
```bash
npm install @capacitor/splash-screen
npx cap sync android
```

### Status Bar

Control the status bar appearance with `@capacitor/status-bar`:
```bash
npm install @capacitor/status-bar
npx cap sync android
```

## Troubleshooting

**"Cannot connect to API"**
- Ensure `env.json` has the correct `apiUrl`
- The server must allow CORS from the Capacitor origin (`https://localhost`)
- For local dev, use `adb reverse tcp:5000 tcp:5000` to forward ports

**"Assets not loading"**
- Re-run `npm run build` to refresh the synced web assets
- Check the patched paths in `www/index.html` and `www/js/game.js`

**"Gradle build fails"**
- Ensure JDK 17+ is installed and `JAVA_HOME` is set
- Run `./gradlew --info assembleDebug` for detailed error output
