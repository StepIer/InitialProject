object Dependencies {

    object Compose {
        const val compilerVersion = "1.3.1"
        private const val version = "1.2.0"

        const val activity = "androidx.activity:activity-compose:1.3.1"
        const val ui = "androidx.compose.ui:ui:$version"
        const val preview = "androidx.compose.ui:ui-tooling-preview:$version"
        const val material = "androidx.compose.material:material:$version"
        const val testUi = "androidx.compose.ui:ui-test-junit4:$version"
        const val debugUi = "androidx.compose.ui:ui-tooling:$version"
        const val debugManifest = "androidx.compose.ui:ui-test-manifest:$version"
        const val navigation = "androidx.navigation:navigation-compose:2.5.3"
    }

    object OrbitMVI {
        private const val version = "4.6.1"

        const val core = "org.orbit-mvi:orbit-core:$version"
        const val viewModel = "org.orbit-mvi:orbit-viewmodel:$version"
        const val compose = "org.orbit-mvi:orbit-compose:$version"
    }

    object Hilt {
        private const val version = "2.44.2"

        const val android = "com.google.dagger:hilt-android:2.44.2"
        const val androidCompiler = "com.google.dagger:hilt-android-compiler:2.44.2"
        const val test = "com.google.dagger:hilt-android-testing:2.44.2"
        const val compiler = "androidx.hilt:hilt-compiler:1.0.0"
        const val composeNavigation = "androidx.hilt:hilt-navigation-compose:1.0.0"
    }

    object Android {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
    }

    object AndroidTest {
        const val ext = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
    }
}