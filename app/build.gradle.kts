plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace  = "com.build.gcunlock"
    compileSdk = 36
    defaultConfig {
        applicationId = "com.build.gcunlock"
        minSdk        = 31
        targetSdk     = 36
        versionCode   = 1
        versionName   = "1.0.0"
    }
    buildTypes {
        release {
            isMinifyEnabled   = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        debug {
            isMinifyEnabled = false
            applicationIdSuffix = ".debug"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
    packaging {
        resources.excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
}

dependencies {
    // LSPosed API (compile-only — fornecido pelo framework em runtime)
    compileOnly("io.github.libxposed:api:100")
    // LSPosed service bridge
    implementation("io.github.libxposed:service:100")
    // Coroutines para StateFlow no ConfigBridge
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
    // AndroidX Core
    implementation("androidx.core:core-ktx:1.13.1")
}
