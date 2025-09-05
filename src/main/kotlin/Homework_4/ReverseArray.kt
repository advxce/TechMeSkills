package Homework_4

import Output

fun reverseArray(array:Array<Int>){
    print("Result:\t")
    for (i in array.indices){
        print("${array[array.size-1 -i]} ")
    }
}

fun main(){
//    val arrayValues = Input.writeRandomArray(21,40, 6)
//    Output.printArray(arrayValues)
//    reverseArray(arrayValues)

    val hello = "Kotlin the best"
    val newString:StringBuilder = StringBuilder()
    hello.contains(' ')
    println(hello.replace(" ", "",false))
    println(newString.toString())
}