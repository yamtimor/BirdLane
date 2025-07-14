package birdlane.utils

import java.io.File

fun readCsv(path: String): List<Map<String, String>> {
    val lines = File(path).readLines()
    val headers = lines.first().split(",")

    return lines.drop(1).map { row ->
        val values = row.split(",")
        headers.zip(values).toMap()
    }
}