// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here

    val stringOne = readln()

    val vowelCount = stringOne.howMany {it.lowercase() in "aeiou"}

    println(vowelCount)
    

}
