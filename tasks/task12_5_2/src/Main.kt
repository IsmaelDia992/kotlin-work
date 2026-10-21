// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate
fun main(){


    val date1 = LocalDate(2007, 2, 6)
    val person1 = Person("JohN", date1 )



    println("${person1.name}, ${person1.birth}, ${person1.isMarried}")


}