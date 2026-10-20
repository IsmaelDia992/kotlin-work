// Task 12.4.1: main program

import kotlin.math.PI
fun main(){

    val p1 = Point(4.5, 7.0)
    val circle1 = Circle(p1, 5.0)
    val p2 = Point(5.5, 8.0)

    println("${circle1.radius}")

    println(circle1.area())
    println(circle1.perimeter())
    println(circle1.contains(p2))


    

}

