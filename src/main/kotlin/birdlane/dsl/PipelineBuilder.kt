package birdlane.dsl

import  birdlane.engine.Executor

class PipelineBuilder {

    private val steps = mutableListOf<Step>()

    fun extract(name: String, block: () -> Any) {
        steps.add(Step.Extract(name, block))
    }

    fun transform(name: String, block: (Any) -> Any) {
        steps.add(Step.Transform(name, block))
    }

    fun load(name: String, block: (Any) -> Unit) {
        steps.add(Step.Load(name, block))
    }

    fun execute() {
        Executor(steps).execute()
    }
}

// DSL entry point
fun pipeline(block: PipelineBuilder.() -> Unit): PipelineBuilder {
    return PipelineBuilder().apply (block)
}

