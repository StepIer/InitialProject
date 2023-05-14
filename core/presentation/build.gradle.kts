@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = AppSetup.applicationId + "presentation"
    compileSdk = AppSetup.compileSdk

    defaultConfig {
        minSdk = AppSetup.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Android.appcompat)
    testImplementation(Dependencies.Test.junit)
    androidTestImplementation(Dependencies.AndroidTest.ext)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
}