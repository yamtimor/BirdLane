# BirdLane DSL Reference

BirdLane is a Kotlin-based DSL designed to orchestrate data pipelines in a clean, expressive, and jazz-inspired way.

## DSL Entry Point

```kotlin
pipeline {
    extract("source.csv")
    transform {
        println("Cleaned up data")
    }
    load("target.db")
}
```