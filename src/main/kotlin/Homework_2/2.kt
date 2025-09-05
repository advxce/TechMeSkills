package Homework_2

import Input

fun main(){
    val mark = Input.writeInt()

    val finalMark = when (mark) {
        in 0..29 -> {
            "Оценка F: 0 .. 29"
        }
        in 30..49 -> {
            "Оценка D: 30 .. 49"
        }
        in 50..74 -> {
            "Оценка C: 50 .. 74"
        }
        in 75..89 -> {
            "Оценка B: 75 .. 89"
        }
        in 90..100 -> {
            "Оценка A: 90 .. 100"
        }
        else -> {
            "Нет такой оценки"
        }
    }

    println(finalMark)
}