/*
package tiposDeFuncoes


data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull {it.price}?.price ?: 0F
fun Order.maxPricedItemValueName() = this.items.maxByOrNull {it.price}?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String
    get() = items.map {it.name}.joinToString()

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water",
    29.0F)))

    println("Max priced item name: ${order.maxPricedItemValue()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}

 */



