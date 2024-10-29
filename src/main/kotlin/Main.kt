package org.example

fun main(args: Array<String>) {

    println("Program arguments: ${args.joinToString()}")
    println("Hello World")

    val personName = "Chris"
    println(personName)
    val otherName = "Irina"
    println(otherName)
    val a = 20
    println(a)
    val isOverdue = true
    println(isOverdue)
    val name = "Christopher"
    println(name.length)
    println(name.uppercase())
    println(name.lowercase())

    val numbers: List<Number> = listOf(1, 3, 5)
    println(numbers)
    val names: List<String> = listOf("Kat", "Marc", "Sophie")
    println(names)
// We can also use it alongside the "nullable" types
// Here, a list of strings, potentially containing
// null elements.
    val otherNames: List<String?> = listOf("Kat", "Marc", null)
    println(otherNames)
}