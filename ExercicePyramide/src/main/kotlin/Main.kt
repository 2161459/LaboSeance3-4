package org.exemple

fun main (args: Array<String>){
    for(arg : String in args) {
        val height = arg.toInt()
        if (height > 0){
            printPyramide(height)
        }
    }
}
fun printPyramide(height: Int){
    for (i in 1..height){
        print(" ".repeat(height - i))
        print("*".repeat(2*i-1))
        println()
    }
}