// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(t: Triangle): Boolean{


    if ((t.first >= t.second + t.third) || (t.second >= t.first + t.third) || (t.third >= t.second + t.first)) {
        return false }
    else { 
        return true
    }
}

fun triangleArea(t: Triangle): Double {



    val a = t.first
    val b = t.second
    val c = t.third
    val s =(a + b +c) * 0.5
    return sqrt((s*(s-a)*(s-b)*(s-c)))

  
}


    