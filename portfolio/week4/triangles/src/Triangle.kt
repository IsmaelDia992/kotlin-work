// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt




class Triangle(val sideA: Double, val sideB: Double, val sideC: Double){

    init{
        if ((sideA >= sideB + sideC) || (sideB >= sideA + sideC) || (sideC >= sideB + sideA)) {
        throw  IllegalArgumentException("invalid arguments")
        }   
    }



    val perimeter: Double
        get() = sideA + sideB + sideC
    

    val semiPerimeter: Double
        get() = (sideA + sideB + sideC) * 0.5
    

    val area: Double
        get(){
            val s = (sideA + sideB + sideC) * 0.5
            return sqrt((s*(s-sideA)*(s-sideB)*(s-sideC)))
        }

    

    override fun toString(): String = "Triangle($sideA, $sideB, $sideC)"
}