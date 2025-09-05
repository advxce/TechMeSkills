package Homework_4

import Output

fun countOfEvenAndOddValues(array: Array<Int>) {
    var countOdd = 0
    var countEven = 0

    for (i in array.indices) {
        if (array[i] % 2 == 0) {
            countEven++
        } else {
            countOdd++
        }
    }

    println("Count Odd: $countOdd")
    println("Count Even: $countEven")
}

fun main() {
    val arrayValues = Input.writeRandomArray(10,40, 10)
    Output.printArray(arrayValues)
    countOfEvenAndOddValues(arrayValues)
}