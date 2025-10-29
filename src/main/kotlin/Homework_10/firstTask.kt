package Homework_10

import java.util.InputMismatchException

fun division(firstNum:Int, secondNum:Int):Int{
    return firstNum/secondNum
}

fun main(){


    try {
        val firstNum = readln().toInt()
        val secondNum = readln().toInt()
        println( division(firstNum, secondNum))

    }
    catch (divisionException:ArithmeticException){
        println("division by 0 is prohibited")
    }
    catch (numberFormatException:NumberFormatException){
        println("not true type of value")
    }
}