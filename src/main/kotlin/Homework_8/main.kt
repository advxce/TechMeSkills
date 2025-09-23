package Homework_8

fun main() {
    val products = listOf<Product>(
        Clothing("Shirt",1000.0, 32),
        Food("Banana",200.0, 15),
        Electronics("Headphones",15650.0, 30)
    )
    products.forEach {
        println("Final Price of ${it.productName}: ${it.getFinalPrice()}")
    }
}
