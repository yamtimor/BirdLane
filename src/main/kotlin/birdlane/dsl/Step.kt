package birdlane.dsl

sealed class Step {
    data class Extract(val source: String) : Step()
    data class Transform(val block: () -> Unit) : Step()
    data class Load(val target: String) : Step()
}