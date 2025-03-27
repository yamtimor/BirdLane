package birdlane

import birdlane.dsl.PipelineBuilder
import birdlane.dsl.pipeline

fun main() {
    pipeline {
        extract("users.csv")

        transform {
            println("Applying uppercase to names")
        }

        load("postgresql://my-database")
    }
}