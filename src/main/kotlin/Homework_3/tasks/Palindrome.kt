package Homework_3.tasks

import Homework_3.Size
import Input
import kotlin.math.ceil
import kotlin.math.pow
//new
fun palindrome(num: Int) {
    val count = Size.getIntSize(num)

    val roundedNum = count / 2.toDouble()
    var state = false

    for (i in 0 until ceil(roundedNum).toInt()) {

        val leftRight = num / 10.toDouble().pow((count - (i + 1).toDouble())) % 10

        val rightLeft = num / 10.toDouble().pow(i.toDouble()) % 10

        if (leftRight.toInt() != rightLeft.toInt()) {
            state = false
            break
        } else
            state = true
    }

    if (state)
        println("Palindrome")
    else
        println("Not palindrome")


}

fun main() {
    palindrome(Input.writeInt(10000000))
}