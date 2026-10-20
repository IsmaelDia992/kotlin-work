// Task 12.3.2: demo of Person class with secondary constructor

import kotlinx.datetime.LocalDate

fun main(){


    val date1 = LocalDate(2007, 2, 6)
    val person1 = Person("John", date1 )

    val date2 = ("2009-03-15")
    val person2 = Person("Jane", date2)

    println("${person1.name}, ${person1.birth}, ${person1.isMarried}")

    println("${person2.name}, ${person2.birth}")

}