plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.about.libraries.android)
}

dependencies {
    implementation(libs.androidx.ktx)
    implementation(libs.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(libs.preferences.datastore)
    implementation(libs.appcompat)
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.preview)
    implementation(libs.compose.material.icons.extended)
    implementation(libs.compose.material3)
    implementation(libs.coil.compose)
    implementation(libs.coil.appiconloader)
    implementation(libs.androidx.documentfile)
    implementation(libs.libsu.core)
    implementation(libs.koin.android)
    implementation(libs.koin.compose)
    implementation(libs.about.libraries.core)
    implementation(libs.about.libraries.m3)
}

android {
    namespace = "me.jaival.files"
    compileSdk = 37

    defaultConfig {
        applicationId = "me.jaival.files"
        minSdk = 26
        versionCode = 2
        versionName = "1.0.1"
        vectorDrawables.useSupportLibrary = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }
}
