package birdlane.utils

import birdlane.dsl.Step

fun debugPrint(steps: List<Step>) {
    println("Pipeline structure:")
    steps.forEach { println(it) }
}
