package Homework_13


fun sortedNumbers(list:List<Long>):Long{

    val newListSum = list
        .asSequence()
        .filter { (it%2).toInt() == 0 }
        .map{it*it}
        .sum()



    return newListSum
}
const val size = 1000000

fun main(){

    val listNumbers = mutableListOf<Long>()

    for (i in 0..size){
        listNumbers.add(i.toLong())
    }

//    println(listNumbers.asSequence().filter { (it%2).toInt()==0 }.map { it*it }.toList())
    println("Sum elements = ${sortedNumbers(listNumbers)}")


}