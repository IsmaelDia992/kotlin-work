// Task 7.7.1: program to compute stats for a numeric dataset
fun main() {
    val data = readData("data.txt")
    println("Data: $data")

    val meanValue = mean(data)
    println("Mean: $meanValue")
}