package org.example.Homework_1

import Input

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


fun main() {

    val height = Input.writeInt()
    val width = Input.writeInt()

    val p = 2 * (height+width)
    val s = height*width

    println("Perimeter: $p, Square: $s")


}
