// Task 5.3.1: main program
fun main(args: Array<String>){


    val sides = args.getOrNull(0)?.toIntOrNull()
    if (sides != null) {
        println(rollDie(sides))
    }
    else if (args.isEmpty()){
        rollDie()
    }
    else{
        println("Error")
    }


}