fun main(args: Array<String>) {
    // Vérifie si un argument a été fourni
    if (args.isNotEmpty()) {
        // Prend le premier argument de ligne de commande
        val inputString = args[0]

        // Parcourt chaque caractère de la chaîne et l'affiche sur une nouvelle ligne
        for (char in inputString) {
            println(char)
        }
    } else {
        // Affiche un message d'erreur si aucun argument n'est fourni

        println("bonjour")

    }

}