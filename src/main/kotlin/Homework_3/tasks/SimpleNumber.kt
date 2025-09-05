package Homework_3.tasks

/**
 * simple num: 1, 2, 3, 5, 7, 11, 13, 17
 * 5 = 1*5 or 5*1
 */
//new
fun simpleNumber(num: Int): String {
    var count = 0
    for (i in 1..num) {
        if (num % i == 0) {
            count++
            println("Divider $i")
        }
    }
    return if (count == 2)
        "Simple"
    else
        "Not Simple"
}

fun main() {
    println(simpleNumber(18))
}