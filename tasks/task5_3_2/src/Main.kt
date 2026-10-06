// Task 5.3.2: main program
fun main(args: Array<String>){


    //val sides = args.getOrNull(0)?.toIntOrNull()
    //val numberOfDice = args.getOrNull(1)?.toIntOrNull()

    val diceSpec = args.getOrNull(0)


    //if (sides != null && numberOfDice != null) {
    //    println(rollDie(sides, numberOfDice))
    //}
    //else if(sides != null && numberOfDice == null){
    //    println(rollDie(sides))
    //}
    //else if(sides == null && numberOfDice != null){
    //    println(rollDie(numberOfDice))
    //}
    if (diceSpec != null){

        val parts = diceSpec.split("d")
        val numberOfDice = parts.getOrNull(0)?.toIntOrNull()
        val sides = parts.getOrNull(1)?.toIntOrNull()
        
        if (numberOfDice != null && sides != null){
            rollDie(sides = sides, numberOfDice = numberOfDice)

        } else{
            println("Error, must use fomrat xdy")
        }

    }

    else if (args.isEmpty()){
        rollDie()
    }
    else{
        println("Error")
    }


}