package birdlane

import birdlane.dsl.PipelineBuilder

fun main() {
    println("Hello from BirdLane!")

    val builder = PipelineBuilder()
    builder.extract("data.csv")
}