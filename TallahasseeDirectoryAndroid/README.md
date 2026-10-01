# Tallahassee Directory — Android Studio Project

Offline-first Tallahassee business directory packaged as an Android WebView app.

## Build
1. Open this folder in Android Studio.
2. Let Gradle sync/download the Android Gradle Plugin and dependencies.
3. Build > Build Bundle(s) / APK(s) > Build APK(s).
4. The debug APK will be under `app/build/outputs/apk/debug/`.

The project uses Android Gradle Plugin 9.3.0 and compile/target SDK 37. It loads the bundled HTML database through Android's WebViewAssetLoader, so the directory itself does not require internet access.
