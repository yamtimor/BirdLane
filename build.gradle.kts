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
    implementation("org.jetbrains.kotlin:kotlin-scripting-jsr223")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm-host")
}

application {
    mainClass.set("birdlane.MainKt")
}
