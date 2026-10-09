// Task 5.3.2: rollDice() function

import kotlin.random.Random

fun rollDie(sides: Int = 6, numberOfDice: Int = 1) {

    
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides $numberOfDice times...")
        
        for(i in 1..numberOfDice){

            var result = Random.nextInt(1, sides + 1)
            println("You rolled $i: $result")
            
        }
    }
    
    else {
        println("Error: cannot have a $sides-sided die")
    }
}