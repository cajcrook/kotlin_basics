// We use the type `Any`, so the argument
// could be any type.
fun whatIsThis(something: Any): String {

    // We can use a 'when' statement
    // to return a different value depending
    // on the type and value.
    val result =
        when(something) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Number -> "A number"
            is String -> "A string"
            else -> "Something else"
        }

    return result
}


fun getNumberSign(num: Any): String? {
    return when (num) {
        is Number -> {
            when {
                num.toDouble() > 0 -> "positive"
                num.toDouble() < 0 -> "negative"
                else -> "zero"
            }
        }
        else -> null // Return null if the input is not a number
    }
}



fun main(args: Array<String>) {
    println(whatIsThis(2))          // "A number"
    println(whatIsThis(1))          // "One"
    println(whatIsThis("Hello"))    // "Greeting"
    println(whatIsThis(listOf(1)))  // "Something else"

    println("getNumberSign: 3:")
    println(getNumberSign(3)) // "positive"
    println("getNumberSign: 0:")
    println(getNumberSign(0)) // "zero"
    println("getNumberSign: -5:")
    println(getNumberSign(-5)) // "negative"
    println("getNumberSign: Hello:")
    println(getNumberSign("not a number")) // null
}