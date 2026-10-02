// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt   

fun main() { 
    println("Enter exam score one from 0-100: ")
    var examOne = readln().toInt()

    if (examOne in 0..100) {
        println("Valid Score for Exam One")
    }

    else {
        println("Invalid Score for Exam One")
    }

    println("Enter exam score two from 0-100: ")
    var examTwo = readln().toInt()

    if (examTwo in 0..100) {
        println("Valid Score for Exam Two")
    }

    else {
        println("Invalid Score for Exam Two")
    }

    println("Enter exam score three from 0-100: ")
    var examThree = readln().toInt()

    if (examThree in 0..100) {
        println("Valid Score for Exam Three")
    }

    else {
        println("Invalid Score for Exam Three")
    }

    val averageScore = (((examOne + examTwo + examThree) / 3))
    println("Your average score was: $averageScore ")

    val grade = when(averageScore) {
        in 0..39  -> println("Grade: Fail")
        in 40..69 -> println("Grade: Pass")
        in 70..100 -> println("Grade: Distinction")
        else -> println("?")
    }













}




