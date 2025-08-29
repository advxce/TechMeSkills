package Homework_1.tasks

import Homework_1.Input

fun main(){
    val valueN = Input.writeInt()
    for(i in 1..10){
        println("$valueN*$i = ${valueN*i}")
    }

}