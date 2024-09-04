package org.example
import kotlin.random.Random

fun main(){
    val n = 10
    val tableau = creeTableauAleatoire(n)
    println("Tableau généré: ${tableau.joinToString(",")}")

    AfficherStatistique(tableau)
}

fun creeTableauAleatoire(n:Int): Array<Int> {
    return Array(n) {Random.Default.nextInt(0,101)}
}

fun AfficherStatistique(tableau: Array<Int>){
    if(tableau.isEmpty()){
        println("Le tableau est vide.")
        return
    }
    val somme = tableau.sum()
    val moyenne = tableau.average()
    val min = tableau.minOrNull()
    val max = tableau.maxOrNull()

    println("Somme: $somme")
    println("Moyenne: $moyenne")
    println("Min: $min")
    println("Max: $max")


}
