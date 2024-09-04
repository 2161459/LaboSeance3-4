package org.example

fun main(args: Array<String>) {
    val nb = args[0]
    val nbInt = nb.toInt()
    val motBinaire = nbInt.toString(2)

    println("La chaine de charactères en bianire est: $motBinaire")

}