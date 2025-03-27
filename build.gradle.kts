// Add this block to enable Kotlin DSL accessors
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("birdlane.MainKt")
}
