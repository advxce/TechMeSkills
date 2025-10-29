package Homework_13


fun sortedNumbers(): Long {

    val newListSum = (1L..1000000L)
        .asSequence()
        .filter { (it % 2).toInt() == 0 }
        .map { it * it }
        .sum()



    return newListSum
}

fun main() {


    println("Sum elements = ${sortedNumbers()}")


}