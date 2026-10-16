// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    

    if (args.isEmpty()){
        println("Error: No filename provided")
        exitProcess(-1)
    }
    val filename = args[0] 


    try{
         
        val list = readData(filename)
        println(variance(list))
    }
    //catch (error: Exception) {
    //    println("Something is wrong with the file: ${error.message}")
    //    exitProcess(-1)
    //}
    catch (error: Exception) {
    println("Error type: ${error.javaClass.simpleName}, Message: ${error.message}")
    exitProcess(-1)
}

}

