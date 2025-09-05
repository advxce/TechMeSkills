package Homework_2

import Input

fun main(){
    val valueN = Input.writeInt()
    for(i in 1..10){
        println("$valueN*$i = ${valueN*i}")
    }

}