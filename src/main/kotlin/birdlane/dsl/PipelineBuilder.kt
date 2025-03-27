package birdlane.dsl

class PipelineBuilder {
    fun extract(source: String) {
        println("Extracting from $source")
    }

    fun transform(block: () -> Unit) {
        println("Transforming...")
        block()
    }

    fun load(target: String) {
        println("Loadign into $target")
    }
}

// DSL entry point
fun pipeline(block: PipelineBuilder.() -> Unit) {
    val builder = PipelineBuilder()
    builder.block()
}
