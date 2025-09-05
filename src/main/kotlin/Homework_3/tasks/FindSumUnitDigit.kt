package Homework_3.tasks


import Homework_3.Size
import Input
//new
fun findSumUnitDigit(num: Int): Int {
    var newNum = num
    var sum = 0

    while (newNum > 0) {
        sum += newNum % 10
        newNum /= 10
    }
    return sum
}

fun main() {
    var num = Input.writeInt(1000000)
    while (num > 9){
        num = findSumUnitDigit(num)
    }

    println(num)
}