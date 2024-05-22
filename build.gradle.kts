plugins {
    //id("root.publication")
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.compose.gradlePlugin).apply(false)
    alias(libs.plugins.jbCompose).apply(false)
    alias(libs.plugins.maven.publish).apply(false)
    kotlin("jvm") version "2.0.0"

}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(8)
}