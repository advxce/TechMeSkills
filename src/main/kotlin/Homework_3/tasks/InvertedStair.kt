package Homework_3.tasks

import Input
//new
fun printInvertedStair(heightFloor:Int){
    for(i in 0..heightFloor){
        val widthStair = "#".repeat(heightFloor-i)
        println(widthStair)
    }
}

fun main(){
    printInvertedStair(Input.writeInt())
}