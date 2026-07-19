# Project Context: Simple File Manager

## Overview
Simple File Manager is a standalone, lightweight Android file manager. It is adapted from the built-in file picker of the open-source Morphe Manager but operates as an independent, fully-featured application.

## Core Features
1. **File & Folder Navigation:** Users can browse internal storage. The app tracks the current directory path and dynamically handles backward navigation step-by-step.
2. **Persistent Pathing:** The app remembers the last directory the user had open via a Koin-injected `PreferencesManager` (backed by `SharedPreferences`) and automatically boots to that path on the next launch.
3. **Native Back Handling:** The system back button navigates up the folder tree. When the user reaches the root storage directory, a double-tap-to-exit Toast mechanism prevents accidental closures.
4. **Native UI Elements:** The app features custom native Compose dialogs for "Credits" and "Open Source Licenses," accessed via a three-dot dropdown menu in the top app bar.

## CI/CD
The project uses GitHub Actions to compile and sign the release APK using the native Android `apksigner`. The Gradle namespace is `me.jaival.files`. Do not ask to run gradle assemble commands on device.

