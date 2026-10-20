// Task 12.4.1: Circle class
import kotlin.math.PI
class Circle(val centre: Point, val radius: Double){

    init {
        require(radius > 0) { "Radius must be greater than 0" }
    }

    fun area(): Double {
        return(PI * radius * radius)
    }

    fun perimeter(): Double {
        return(PI * radius * 2)
    }

    fun contains(p: Point){
        if (p.distanceTo(centre) <= radius){
            println("true")
        }
        else{
            println("false")
        }
    }



}