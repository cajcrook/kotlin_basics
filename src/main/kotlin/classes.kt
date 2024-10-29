import org.hello.person.Address
import org.hello.person.Person
import org.hello.shoppingCart.Item
import org.hello.shoppingCart.ShoppingCart


fun main(args: Array<String>) {
/////// Person and Address
    val address = Address("93", "Carlton", "SE15")
    val person = Person("Chris", "Crook", address, emptyList() )
    val fullName = "${person.firstName} ${person.lastName}"
    println(person)
    println(person.firstName)
    println(person.lastName)
    println(fullName)
    println(person.hobbies)
    println(person.getIntroduction())
    print(person.getFullAddress())
/////// Person and Address

/////// Shopping Cart & Item
    val item = Item("Mars", 4.99)
    println("- item name:")
    println(item.name) // 'Mars'
    println("- item price:")
    println(item.price) // 4.99

    val cart = ShoppingCart()
    println("total cart price:")
    println(cart.getTotalPrice()) // 4.99

    println("cart add item:")
    cart.addItem(Item("Mars", 4.99))
    cart.addItem(Item("Skittle", 3.99))
    cart.addItem(Item("Skittle", 3.99))
    println("Items in cart ${cart.items}")
    println("Total cart price: ${cart.getTotalPrice()}") // Output should be the sum of added items



}