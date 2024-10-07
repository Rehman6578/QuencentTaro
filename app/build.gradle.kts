import com.android.build.api.dsl.ViewBinding
import org.jetbrains.kotlin.fir.declarations.builder.buildScript

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)


    // add kapt plugin
    id("kotlin-kapt")
}

android {
    namespace = "com.example.quencenttaro"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.quencenttaro"
        minSdk = 28
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

    buildFeatures {
        viewBinding = true
    }
}



dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.support.annotations)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // add retrofit dependencies
//    implementation(libs.retrofit)
//    implementation(libs.retrofitGson)
//    implementation(libs.okhttp)
//    implementation(libs.coroutines)
//    implementation(libs.lifecycle)
//
//
//    // add viewmodel and livedata dependencies
//    implementation(libs.viewmodel)
//    implementation(libs.livedata)
//
//    // navhost fragment
//    implementation(libs.navhostFragment)
//
//    // navigation fragment
//    implementation(libs.navigationFragment)
//    implementation(libs.navhostFragment)

    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")


// add all these dependencies not using androidx
    implementation("com.github.bumptech.glide:glide:4.12.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.5")

    // add viewmodelscope corutines dependency
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.5")

    // add glide dependency
    implementation("com.github.bumptech.glide:glide:4.12.0")

    // add viewmodel and livedata dependencies
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.5")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.5")

    // add navigation fragment and navhost fragment dependencies
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.3.5")

    // add coroutines dependency
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")

    // add okhttp dependency
    implementation("com.squareup.okhttp3:okhttp:4.9.3")


    // add viewmodelscope corutines dependency
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.5")

    // add retrofit dependency









}