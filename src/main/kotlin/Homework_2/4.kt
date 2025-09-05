package Homework_2

import Input

fun fibonacci(num: Int): Int {
    return when (num) {
        0 -> 0
        1 -> 1
        else -> fibonacci(num - 1) + fibonacci(num - 2)
    }
}

fun main() {
    val number = Input.writeInt()

    val sum = fibonacci(number)
    println(sum)
}