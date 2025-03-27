package birdlane

import birdlane.dsl.PipelineBuilder

fun main() {
    val builder = PipelineBuilder()

    builder.extract("data.csv")

    builder.transform {
        println("This is a placeholder to transformation")
    }
}