package birdlane.dsl

import  birdlane.engine.Executor

class PipelineBuilder {

    private val steps = mutableListOf<Step>()

    fun extract(source: String) {
        println("Extracting from $source")
        steps.add(Step.Extract(source))

    }

    fun transform(block: () -> Unit) {
        steps.add(Step.Transform(block))
    }

    fun load(target: String) {
        println("Loading into $target")
        steps.add(Step.Load(target))
    }

    fun execute() {
        Executor(steps).execute()
    }
}

// DSL entry point
fun pipeline(block: PipelineBuilder.() -> Unit): PipelineBuilder {
    return PipelineBuilder().apply (block)
}

