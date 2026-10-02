// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    println("Enter your limit: ")
    val limit = readln().toInt()
    var sum = 0
    for (n in 1..limit step 2) {
       
        sum += n
        
    }
    println(sum)
}
