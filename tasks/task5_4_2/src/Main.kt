//Task 5.4.2 Main Program

val String.isTooLong: Boolean get() = this.length > 20

fun main(args: Array<String>){

val lines = args[0]
when {
    lines.isTooLong -> println("$lines is too long")
    else -> println("$lines is not too long")
}


}