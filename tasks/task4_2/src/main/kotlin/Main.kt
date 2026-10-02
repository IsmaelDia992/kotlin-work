// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU")
    println("a: Margherita")
    println("b: Pepperoni")
    println("c: Hawaiian")
    println("d: Chicken and Mushroom")

    print("Enter your choice of pizza: ")
    val pizzaChoice = readln().lowercase()

    if (pizzaChoice in "a".."d"  && pizzaChoice.length == 1) {
        println("Order Accepted")
    }
    
    else {
        println("Invalid Choice")
    }

}

