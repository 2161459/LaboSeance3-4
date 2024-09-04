package org.example

fun main(args: Array<String>) {
    val nb = args[0]
    val nbInt = nb.toInt()
    val motBinaire = nbInt.toString(2)

    println("La chaine de charactères en bianire est: $motBinaire")

}
fun main() {
    // Conversion d'un Int en Float
    val entier: Int = 42
    val flottant: Float = entier.toFloat()
    println("Int $entier converti en Float : $flottant")

    // Conversion d'un Double en Int (les chiffres après la virgule sont tronqués)
    val double: Double = 42.99
    val entierDeDouble: Int = double.toInt()
    println("Double $double converti en Int : $entierDeDouble")

    // Conversion d'une String en Int (gestion des erreurs pour des valeurs non numériques)
    val chaine: String = "123"
    try {
        val entierDeChaine: Int = chaine.toInt()
        println("String \"$chaine\" converti en Int : $entierDeChaine")
    } catch (e: NumberFormatException) {
        println("La chaîne \"$chaine\" n'est pas un entier valide.")
    }

    // Conversion d'un Int en String
    val entierPourString: Int = 456
    val chaineDeInt: String = entierPourString.toString()
    println("Int $entierPourString converti en String : \"$chaineDeInt\"")

    // Conversion d'un Float en Double
    val flottantPourDouble: Float = 3.14f
    val doubleDeFloat: Double = flottantPourDouble.toDouble()
    println("Float $flottantPourDouble converti en Double : $doubleDeFloat")

    // Conversion d'un Double en Float
    val doublePourFloat: Double = 1.23
    val flottantDeDouble: Float = doublePourFloat.toFloat()
    println("Double $doublePourFloat converti en Float : $flottantDeDouble")

    // Conversion d'une String contenant des caractères non numériques en Int
    val chaineNonNumerique: String = "abc"
    try {
        val entierDeChaineNonNumerique: Int = chaineNonNumerique.toInt()
        println("String \"$chaineNonNumerique\" converti en Int : $entierDeChaineNonNumerique")
    } catch (e: NumberFormatException) {
        println("La chaîne \"$chaineNonNumerique\" n'est pas un entier valide.")
    }
}