// Task 7.3.2: Mutable list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    println(numbers[0]) //1

    //println(numbers[10]) //2, gives an out of bounds error

    println(numbers.slice(2..4)) //3

    println(numbers.first())
    println(numbers.last()) //4

    //numbers.append(7) //5 fails to compile

    numbers.add(1) 
    numbers.remove(9)
    println(numbers)
    numbers.clear()
    println(numbers)






}