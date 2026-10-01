# Build the APK from your phone with GitHub Actions

This project includes a GitHub Actions workflow at `.github/workflows/build-apk.yml`.

## Phone-only setup

1. Create a new GitHub repository. A public repository is the simplest option for using GitHub-hosted Actions.
2. Upload the **contents of this project folder** to the repository (not the ZIP itself).
3. Make sure `.github/workflows/build-apk.yml` is present.
4. Open the repository's **Actions** tab.
5. Select **Build Tallahassee Directory APK**.
6. Tap **Run workflow**.
7. Wait for the build to finish.
8. Open the completed workflow run and download the artifact named **Tallahassee-Directory-APK**.
9. Extract the artifact and install `app-debug.apk` on the Android phone.

The APK contains the 221-record database already embedded in the app. No separate database import is required for the initial install.

GitHub Actions builds on a GitHub-hosted virtual machine, so Android Studio does not need to be installed on the phone.
