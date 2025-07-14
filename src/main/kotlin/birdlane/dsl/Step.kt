package birdlane.dsl

sealed class Step {
    data class Extract(val name: String, val block: () -> Any) : Step()
    data class Transform(val name: String, val block: (Any) -> Any) : Step()
    data class Load(val name: String, val block: (Any) -> Unit) : Step()
}
