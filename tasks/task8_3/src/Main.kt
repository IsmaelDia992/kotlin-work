// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val filename = args[0]

    val fileNameData = fetchData(filename)
    val highest = fileNameData.maxBy {it.second}
    val lowest = fileNameData.minBy {it.second}
    println("Highest Temp: $highest")
    println("Lowest Temp: $lowest")

    //val average = averageTemp(fileNameData)
    //println(average)

    val average = (fileNameData.sumOf {it.second}) / (fileNameData.size) 
    println(average)
}
