package birdlane.dsl

class PipelineBuilder {
    fun extract(source: String) {
        println("Extracting from $source")
    }

    fun transform(block: () -> Unit) {
        println("Transforming...")
        block()
    }

}