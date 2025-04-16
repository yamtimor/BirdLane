package birdlane.engine

import java.io.File
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost
import kotlinx.coroutines.runBlocking

object ScriptRunner {
    fun runScript(filePath: String) {
        val file = File(filePath)
        val scriptSource = file.toScriptSource()

        val compilationConfig = ScriptCompilationConfiguration {
            jvm {
                dependenciesFromCurrentContext(wholeClasspath = true)
            }
        }

        val evalConfig = ScriptEvaluationConfiguration {}

        val host = BasicJvmScriptingHost()

        val result = runBlocking {
            host.eval(scriptSource, compilationConfig, evalConfig)
        }

        result.reports.forEach { report ->
            println("[${report.severity}]: ${report.message}")
        }
    }
}
