package Homework_4

import Input
import Output
import kotlin.math.min

fun findMaxValue(array: Array<Int>) {
    var maxValue = array[0]
    for (i in array.indices) {
        if (maxValue < array[i])
            maxValue = array[i]
    }
    println("maxValue: $maxValue")
}

fun findMinValue(array: Array<Int>) {
    var minValue = array[0]
    for (i in array.indices) {
        if (minValue > array[i])
            minValue = array[i]
    }
    println("minValue: $minValue")
}

fun main() {
    val arrayValues = Input.writeRandomArray(21,40, 6)
    Output.printArray(arrayValues)
    findMaxValue(arrayValues)
    findMinValue(arrayValues)
}