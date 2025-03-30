package birdlane.engine
import birdlane.dsl.Step

class Executor(private val steps: List<Step>) {
    fun execute() {
        for (step in steps) {
            when (step) {
                is Step.Extract -> {
                    println("Extracting from ${step.source}")
                }
                is Step.Transform -> {
                    println("Applying transformation...")
                    step.block()
                }
                is Step.Load -> {
                    println("Loading into ${step.target}")
                }
            }
        }
    }
}