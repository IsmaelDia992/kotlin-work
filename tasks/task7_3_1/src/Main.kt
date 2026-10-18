// Task 7.3.1: list element access
fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    println(numbers[0]) //1

    //println(numbers[10]) //2, gives an out of bounds error

    println(numbers.slice(2..4)) //3

    println(numbers.first())
    println(numbers.last()) //4

    //numbers.append(7) //5 fails to compile

    numbers.add(1)







}