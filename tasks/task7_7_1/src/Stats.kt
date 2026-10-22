// Task 7.7.1: statistics functions

fun mean(data: List<Float>): Float {
    return data.sum() / data.size
}

fun median(data: List<Float>): Float {
    val sorted = data.sorted()
    val size = sorted.size
    return if (size % 2 == 1) {
        sorted[size / 2]
    } else {
        (sorted[size / 2 - 1] + sorted[size / 2]) / 2f
    }
}

fun displayStats(data: List<Float>) {
    if (data.isEmpty()) {
        println("No data provided.")
        return
    }
    
    println("Count: ${data.size}")
    println("Mean: ${mean(data)}")
    println("Median: ${median(data)}")
    println("Minimum: ${data.minOrNull()}")
    println("Maximum: ${data.maxOrNull()}")
}