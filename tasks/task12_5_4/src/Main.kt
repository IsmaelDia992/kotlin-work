// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate
import kotlinx.datetime.yearsUntil



fun main(){

    val date1 = LocalDate(2006, 7, 18)
    val person1 = Person("Joey", date1 )

    println("${person1.name}, ${person1.age}")

}