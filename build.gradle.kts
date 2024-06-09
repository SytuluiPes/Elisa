import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    val lifecycle_version = "2.8.0-alpha03"
    implementation("androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version")

    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(compose.material)
    implementation(compose.ui)
    implementation(compose.components.resources)
    implementation(compose.components.uiToolingPreview)
    implementation(libs.androidx.sqlight)
    implementation(libs.androidx.sqlight.driver)
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "AppKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Elisa"
            packageVersion = "1.0.0"
        }
    }
}
