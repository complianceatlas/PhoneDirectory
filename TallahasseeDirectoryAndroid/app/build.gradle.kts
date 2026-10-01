plugins { id("com.android.application") }

android {
    namespace = "com.tallahassee.directory"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.tallahassee.directory"
        minSdk = 23
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.14.0")
}
