import java.util.*

fun main(args: Array<String>) {

    // 1. the program is going to choose a word at random from a list
    val listOfWords = arrayOf<String>("Serendipity", "Aura", "Splendid", "Plethora", "Enigmatic", "Lullaby")
    val randomIndex = Random().nextInt(listOfWords.size)
    val chosenWord = listOfWords[randomIndex]

    // 2. Print all the letters in the word but one hidden eg A___
    var maskedWord = ""

    fun runLogic(index: Int, letter: Char): Unit {
        val letterToAdd = if (index == 0) letter else "_"
        maskedWord += letterToAdd

        chosenWord.forEachIndexed(::runLogic)
        println("This is the maskedWord: $maskedWord")

        // 3. It's going to ask for a letter and check whether it's in the word or not
        val input = readLine()?.trim()

        if (input != null && input.length == 1) {
            val guessedLetter = input[0]

            if (guessedLetter.lowercaseChar() in chosenWord.lowercase()) {
                println("The letter '$letter' is in the word.")
            } else {
                println("The letter '$letter' is not in the word.")
            }
        } else {
            println("Please enter a single letter.")
        }
    }
}
