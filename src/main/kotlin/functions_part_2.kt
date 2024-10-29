// Example
fun calculate(a: Int, b: Int, calculateFunction: (Int, Int) -> Int): Int {
    return calculateFunction(a, b)
}
fun add(a: Int, b: Int): Int {
    return a + b
}
fun multiply(a: Int, b: Int): Int {
    return a * b
}

//////// EXERCISES
//////// 1
// Implement a function convertToCaps which takes a string and returns the string converted to capital letters.
fun convertToCaps(string: String) : String {
    return string.uppercase()
}

//////// EXERCISES
//////// 2
// Implement a function exclaim which takes a string and returns the given string with an exclamation mark at the end.
fun exclaim(string: String) : String {
    return "$string!"
}

//////// EXERCISES
//////// 3
// Implement a function greetWith which we can call this way:
// greetWith("Marco", convertToCaps) // "MARCO"
//greetWith("Marco", exclaim) // "Marco!"
fun greetWith(name: String, greetFunction: (String) -> String): String {
    return greetFunction(name)
}


fun main() {
    ///// Example
// We're not calling the function
// but referencing it, so we need to use
// `::` in front of their name.
    println("- Calling calculateFunction within calculate: ")
    println("- Add 2 and 3:")
    println(calculate(2, 3, ::add)) // 2 + 3 = 5
    println("- Multiply 2 and 4:")
    println(calculate(2, 4, ::multiply)) // 2 * 4 = 8


//////// EXERCISES
//////// 1
    println("- Exercise 1: ")
    println(convertToCaps("string to uppercase"))

//////// EXERCISES
//////// 2
    println("- Exercise 2: ")
    println(exclaim("exclamation mark added"))

//////// EXERCISES
//////// 3
    println("- Exercise 3: ")
    println("- Convert marco to caps: ")
    println(greetWith("marco", ::convertToCaps))
    println("- Add an exclamation point: ")
    println(greetWith("marco", ::exclaim))

//////// EXERCISES
//////// Using Lambda
    // Using a lambda for convertToCaps
    println("- Uppercase using lambda: ")
    val result1 = greetWith("marco") { input -> input.uppercase() }
    println(result1)
    println("- Add ! using lambda: ")
    // Using a lambda for exclaim
    val result2 = greetWith("marco") { input -> "$input!" }
    println(result2)
    // Both functions combined in 1 lambda
    println("- Both functions combined in 1 lambda")
    val result3 = greetWith(name = "marco") { input ->  "$input!".uppercase() }
    println(result3)

}