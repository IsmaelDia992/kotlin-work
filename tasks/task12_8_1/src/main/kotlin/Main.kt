// Task 12.8.1: demo program for Day enum class

fun main(){

    println("Choose a day: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday")
    val chosenDay = readln()
    try{
        Day.valueOf(chosenDay)
    }
    catch (error: Exception){
        println("Error: Invalid entry")
    }
    




}
