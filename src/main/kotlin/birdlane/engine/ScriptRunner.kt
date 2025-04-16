package birdlane.engine

import java.io.File
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

object ScriptRunner {
    fun runScript(filePath: String) {
        val file = File(filePath)
        val scriptSource = file.toScriptSource()

        val configuration = ScriptCompilationConfiguration {
            jvm {
                dependenciesFromCurrentContext(wholeClasspath = true)
            }
        }

        val evaluationConfiguration = ScriptEvaluationConfiguration {}

        val result = BasicJvmScriptingHost().eval(
            scriptSource,
            configuration,
            evaluationConfiguration
        )

        result.reports.forEach { report ->
            println("[${report.severity}]: ${report.message}")
        }
    }
}
