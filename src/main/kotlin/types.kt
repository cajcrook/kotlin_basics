package org.example

fun main(args: Array<String>) {

// 🌶Define a String message and assign the reversed version of it to a new value.
    val message: String = "Hello World"
    println(message)
    println(message.reversed())

// 🌶️ The following code doesn't work - why? Modify it so it runs.
    var aNumber = 2
    aNumber = 4
    println(aNumber)

// 🌶️ The following code doesn't work - why? Modify it so it runs.
    val numbers: List<Number?> = listOf(3, 4, null)
    println(numbers)

// 🌶️ The following code doesn't work - why? Modify it so it runs.
    val otherNames: List<String?> = listOf("Kat", "Marc", null)
    // loop on each name in the list
    for (name in otherNames) {
        // Print the length
        println(name?.length)
    }

// 🌶️🌶️ The following code doesn't work - why? How would you fix it?
    val number = "3" as? Number
    println(number)

//🌶️🌶️ This might require a bit of research from you. How to fix the following code so we can create a list of both strings and numbers?
    val listOfThings: List<Any> = listOf(3, "Hello", 4)
    println(listOfThings)

}