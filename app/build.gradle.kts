plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.googleService)

}

android {
    namespace = "com.example.panels_solar_sport"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.panels_solar_sport"
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
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.activity)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.database)
    implementation(libs.recyclerview)
    implementation(libs.firebase.crashlytics.buildtools)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.firebaseAuth)
    implementation(libs.firebaseStore)
    implementation(libs.firebaseStorage)
    implementation(libs.firebase.bom)
    implementation(libs.mpandroidchart)
    implementation(libs.cardview)
    implementation(libs.google.firebase.database)


}