plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.dependencyinjectionlearning"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.dependencyinjectionlearning"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    /*implementation("com.google.dagger:dagger:2.47")
    kapt("com.google.dagger:dagger-compiler:2.46.1")*/ // kotlin annotation processing tool

    val daggerVersion = "2.51.1"
    implementation ("com.google.dagger:dagger:$daggerVersion")
    /*annotationProcessor("com.google.dagger:dagger-compiler:$daggerVersion")*/
    kapt ("com.google.dagger:dagger-compiler:$daggerVersion")
}