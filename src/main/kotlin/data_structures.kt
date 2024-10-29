
fun printHelloMessages(names: List<String>) {
    names.map{"Hello $it"}
        .forEach {println(it)}
}


fun getAllNumberSigns(numbers: List<Int>): List<String> {
    return numbers.map { number ->
        when {
            number > 0 -> "positive"
            number < 0 -> "negative"
            else -> "zero"
        }
    }
}


        fun main(args: Array<String>) {

            //// lists

// Declaring an immutable list
// (we cannot modify it, e.g adding new elements)
// val names = listOf("Andy", "Barbara", "Cat")

// Declaring a mutable list
// (elements can be added or removed)
            val names = arrayListOf("Andy", "Barbara", "Cat")
            names.add("Danny")
            names.add("Erica")

            // Sometimes we need to specify the type
            // of the list elements. Here using the arrayListOf<TYPE> syntax.
            val uppercaseNames = arrayListOf<String>()

            // Looping through `names`:
            names.forEach {
                // Below, `it` is a special variable
                // referring to the current name
                // in the loop.
                uppercaseNames.add(it.uppercase())
                println(uppercaseNames)
            }


// Declaring a map
            val info = mapOf(
                "name" to "John Doe",
                "email" to "contact@mywebsite.com",
                "postcode" to "EC1 AAA",
                "phones" to listOf("0700000000", "071000000")
            )
            // Accessing values
            val name = info["name"]
            val email = info["email"]
            val phones = info["phones"]
            // Iterating over a map
            info.forEach { key, value ->
                println("${key} = ${value}")
            }


//////// forEach
            val words = listOf("music", "cheese", "house")
// .map takes a "lambda" function
// which is called for each element of the list.
            words.forEach {
                println(it)
            }


//////// Map
            val mapWords = listOf("music", "cheese", "house")

// .map takes a "lambda" function
// which is called for each element of the list
// and needs to return the element for the new list.
            val uppercasedWords = mapWords.map {
                // Note the "return" keyword
                // is not used in lambdas
                it.uppercase()
            }
            println(uppercasedWords)

//////// Filter
            val numbers = listOf(10, -5, 4, -1, 7)
// .filter takes a "lambda" function
// which is called for each element of the list
// and needs to return a boolean.
            val positiveNumbers = numbers.filter {
                it > 0
            }
            println(positiveNumbers)

            printHelloMessages(listOf("Jake", "Olga", "Pat"))

            val allNumbers = listOf(2, -3, 5, 0)
            val signs = getAllNumberSigns(allNumbers)
            println(signs)
        }





