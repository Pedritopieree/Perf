plugins {
    id("com.android.application")
}

android {
    namespace = "com.grok.pd2453gc"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.grok.pd2453gc"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.20"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    // APENAS A API 102, SEM SERVICE, SEM JITPACK!
    compileOnly("io.github.libxposed:api:102.0.0")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
