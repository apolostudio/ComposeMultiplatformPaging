import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.compose.gradlePlugin)
    alias(libs.plugins.jbCompose)
    alias(libs.plugins.maven.publish)

}

mavenPublishing {
    // Define coordinates for the published artifact
    coordinates(
        groupId = "io.github.apolostudio",
        artifactId = "composemultiplatformpaging",
        version = "0.0.0"
    )

    // Configure POM metadata for the published artifact
    pom {
        name.set("Compose Multiplatform Paging")
        description.set("Access LazyPaging Items from your common Compose Multiplatform code (EXPERIMENTAL)")
        inceptionYear.set("2024")
        url.set("https://github.com/apolostudio/ComposeMultiplatformPaging")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        // Specify developers information
        developers {
            developer {
                id.set("apolostudio")
                name.set("Apolo Studio")
                email.set("apolostudioapps@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/apolostudio/ComposeMultiplatformPaging")
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    // Enable GPG signing for all publications
    signAllPublications()
}

group = "io.github.apolostudio.composemultiplatformpaging"
version = "0.0.0"

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
        publishLibraryVariants("release")//, "debug"
    }
    jvm()
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "composemultiplatformpaging"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            api(libs.paging.common)

            implementation(libs.kotlin.stdlib.common)
            implementation(libs.kotlinCoroutinesCore)
            api(compose.runtime)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "io.github.apolostudio"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

