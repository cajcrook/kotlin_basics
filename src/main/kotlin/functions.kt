fun superify(input: String?): String? {
    if (input == "") {
        return null
    } else {
        return "super${input}"
    }
}


fun revealSecret(passcode: String): String? {
    // Check if the given passcode is "HUNGRY"
    if (passcode == "HUNGRY") {
        return "The cookies are in the desk drawer"
    }
    // If the passcode is not "HUNGRY", return null
    return null
}

fun main() {
    //// superify
    println(superify("woman"))
    println(superify("dog"))
    println(superify(superify(superify(superify("cat")))))

   //// reveal secret
    val secret1 = revealSecret("HUNGRY")
    println(secret1) // Output: "The cookies are in the desk drawer"
    val secret2 = revealSecret("Hi")
    println(secret2) // Output: null
}
