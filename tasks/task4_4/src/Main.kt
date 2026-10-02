// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    println("Enter the starting temperature in celsius")
    var startTemp = readln().toFloat()

    println("Enter the final temperature in celsius")
    val endTemp = readln().toFloat()

    println("Enter the temperature increment in celsius")
    val increment = readln().toFloat()

    while(startTemp <= endTemp) {
        val farenheit = (((startTemp * 9.0) / 5.0) + 32.0)

        println("%10.1f %10.1f".format(startTemp, farenheit))

        startTemp += increment
    }
}
