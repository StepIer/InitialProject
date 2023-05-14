@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = AppSetup.applicationId + "samplefeature"
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

    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.compilerVersion
    }

    buildFeatures {
        compose = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(Module.Core.presentation))
    implementation(project(Module.Core.database))
    implementation(project(Module.Core.network))

    implementation(Dependencies.Android.coreKtx)
    implementation(Dependencies.Android.lifecycle)

    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.activity)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.preview)
    implementation(Dependencies.Compose.navigation)

    implementation(Dependencies.Hilt.android)
    implementation(Dependencies.Hilt.composeNavigation)

    kapt(Dependencies.Hilt.compiler)
    kapt(Dependencies.Hilt.androidCompiler)

    implementation(Dependencies.OrbitMVI.compose)
    implementation(Dependencies.OrbitMVI.viewModel)
    implementation(Dependencies.OrbitMVI.core)

    debugImplementation(Dependencies.Compose.debugUi)
    debugImplementation(Dependencies.Compose.debugManifest)

    testImplementation(Dependencies.Test.junit)

    androidTestImplementation(Dependencies.AndroidTest.ext)
    androidTestImplementation(Dependencies.AndroidTest.espresso)
    androidTestImplementation(Dependencies.Compose.testUi)
}