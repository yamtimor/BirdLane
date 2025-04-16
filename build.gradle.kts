// Add this block to enable Kotlin DSL accessors
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.10"
    application
}

kotlin {
    jvmToolchain(19)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // Scripting runtime + host
    implementation("org.jetbrains.kotlin:kotlin-scripting-common:1.9.10")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm:1.9.10")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host:1.9.10")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jsr223:1.9.10")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

}



application {
    mainClass.set("birdlane.MainKt")
}
