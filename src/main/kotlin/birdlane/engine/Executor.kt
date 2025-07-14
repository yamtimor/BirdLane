package birdlane.engine
import birdlane.dsl.Step

class Executor(private val steps: List<Step>) {
    fun execute() {
        var data: Any? = null

        for (step in steps) {
            when (step) {
                is Step.Extract -> {
                    println("→ Extracting: ${step.name}")
                    data = step.block()
                }
                is Step.Transform -> {
                    println("→ Transforming: ${step.name}")
                    data = step.block(data ?: error("No data to transform"))
                }
                is Step.Load -> {
                    println("→ Loading: ${step.name}")
                    step.block(data ?: error("No data to load"))
                }
            }
        }
    }
}
