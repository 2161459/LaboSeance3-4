fun triangle(hauteur: Int): String{
    var result: String = ""
    var nbEtoiles = 1
    for (ligne in 1..5){
        result += nEtoiles(nbEtoiles)
        result += "\n"
        nbEtoiles++
    }
    return result
}

fun nEtoiles(n: Int) : String{
    var result = ""
    for (i in 1..n){
        result += "\n"
    }
    return result
}