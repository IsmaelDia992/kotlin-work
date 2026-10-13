// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import java.io.File

typealias Record = Pair<String,Double>

fun fetchData(filename: String) = buildList {
    // Finish the implementation of this function
    File(filename).forEachLine { line ->
        
        val parts = line.split(",")

        if (parts.size >=2) {
            val name = parts[0].trim()
            val value = parts [1].trim().toDoubleOrNull() ?: 0.0
            add(Record(name, value))
        }
        //println(line)
    }
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
