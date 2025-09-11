package Homework_5

import Input

fun converterFromStringToASCII(str: String): String {
    val resultStr = str.map { it.code }.joinToString(" ")
    return resultStr
}

fun converterFromASCIIToString(str: String): String {
    val numbers = str.split(" ").map { it.toInt() }
    val resultStr = numbers.map { it.toChar() }.joinToString(" ")
    return resultStr
}

fun main() {
    val strASCII = converterFromStringToASCII(Input.writeString())
    println(strASCII)
    println(converterFromASCIIToString(strASCII))


}