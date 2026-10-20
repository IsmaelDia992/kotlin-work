// Task 12.3.3: demo of Person class with secondary constructor

import kotlinx.datetime.LocalDate

fun main(){


    val date1 = LocalDate(2007, 2, 6)
    val person1 = Person("", date1)



    println("${person1.name}, ${person1.birth}, ${person1.isMarried}")

 

}