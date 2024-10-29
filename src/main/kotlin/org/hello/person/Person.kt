package org.hello.person


class Person(
    val firstName: String,
    val lastName: String,
    val address: Address,
    val hobbies: List<String> = listOf()
) {
    fun getIntroduction(): String {
        return "Hi I am $firstName"
    }

    fun getFullAddress(): String {
        return "${address.houseNumber} ${address.streetName} ${address.postCode}"
    }

}


