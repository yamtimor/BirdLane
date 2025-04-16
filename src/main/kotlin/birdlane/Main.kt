package birdlane

import birdlane.engine.ScriptRunner

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: birdlane <path-to-chart-file>")
        return
    }

    val chartFile = args[0]

    println("Running chart: $chartFile")
    ScriptRunner.runScript(chartFile)
}
