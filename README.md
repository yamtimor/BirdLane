# BirdLane

> *A jazz-inspired Kotlin DSL for composing expressive data pipelines.*

BirdLane is not just another ETL tool. It’s a musical instrument for developers — a Kotlin-based DSL where each pipeline is a **chart**, each step a **phrase**, and the execution engine your **band**.

No YAML. No rigid DAGs. Just flow.

Always show details

Copy
from pathlib import Path

readme_section = """
## Why BirdLane

BirdLane is built on a simple idea:  
**What if data pipelines worked more like jazz charts than flowcharts?**

In jazz, a chart provides the structure — but the phrasing, timing, and interpretation are up to the players.  
BirdLane applies the same mental model to data orchestration:

- Pipelines are written in code, not configuration
- Execution flows linearly, like a performance
- Each step is a phrase; the entire pipeline is a tune

This approach isn't about style over substance. It's about building systems that are:

- **Readable** — the DSL reads like a lead sheet
- **Composable** — each step builds on the last
- **Lightweight** — no heavyweight orchestration engine
- **Expressive** — logic lives in real code, not deeply nested YAML

The name **BirdLane** is a tribute to Charlie "Bird" Parker, whose mastery of structure and improvisation reshaped modern music.  
BirdLane aims for that same balance: clear flow, creative freedom, and deeply intentional execution.