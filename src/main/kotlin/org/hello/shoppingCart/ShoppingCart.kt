package org.hello.shoppingCart

class ShoppingCart {
    val items = mutableListOf<Item>()

    // Method to add an item to the shopping cart
    fun addItem(item: Item) {
        items.add(item)
    }

    // Method to get the total price of the items in the shopping cart
    fun getTotalPrice(): Double {
        return items.sumOf { it.price }
    }
}