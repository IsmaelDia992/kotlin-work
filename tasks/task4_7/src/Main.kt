// Task 4.7: finding the longest line in a file
import java.io.File

fun main(args: Array<String>){
    
    println("Enter the name of the file: ")
    val fileName = readln()
    var longestLine = ""
    File(fileName).forEachLine { line -> 
        println(line.length)
        if (line.length > longestLine.length) {
            longestLine = line
        }
        println("The Longest line is: $longestLine")
        println("It has length: ${longestLine.length}")
        

    }

}
