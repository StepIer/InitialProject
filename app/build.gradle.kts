@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = AppSetup.applicationId
    compileSdk = AppSetup.compileSdk

    defaultConfig {
        applicationId = AppSetup.applicationId
        minSdk = AppSetup.minSdk
        targetSdk = AppSetup.targetSdk
        versionCode = AppSetup.versionCode
        versionName = AppSetup.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.compilerVersion
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Android.lifecycle)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.preview)

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")

    implementation(Dependencies.Hilt.android)
    implementation(Dependencies.Hilt.composeNavigation)

    kapt(Dependencies.Hilt.compiler)
    kapt(Dependencies.Hilt.androidCompiler)

    debugImplementation(Dependencies.Compose.debugUi)
    debugImplementation(Dependencies.Compose.debugManifest)

    testImplementation(Dependencies.Test.junit)

    androidTestImplementation(Dependencies.AndroidTest.ext)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
    androidTestImplementation(Dependencies.Compose.testUi)
}