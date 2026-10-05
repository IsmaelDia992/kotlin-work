// Task 5.2.1: main program
fun main(args: Array<String>){

    val radius = args[0].toDouble()

    val area = circleArea(radius)
    val roundedArea = String.format("%.4f", area)

    val perimeter = circlePerimeter(radius)
    val roundedPerimeter = String.format("%.4f", perimeter)

    println(roundedPerimeter)
    println(roundedArea)



}