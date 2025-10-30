package Homework_15

import kotlinx.coroutines.delay


class Bank{

    val obj = Object()

    var credits = 10000

    fun withdraw(value:Int){
        synchronized(obj){
            if(credits < value){
                println("you cant withdraw money")
            }
            else{
                credits-=value
            }
        }

    }

}

fun main(){

    val userCredit = Bank()

    println(userCredit.credits)
    val thread1 = Thread{
        userCredit.withdraw(3000)
        Thread.sleep(10)
    }

    val thread2 = Thread{
        userCredit.withdraw(8000)
        Thread.sleep(10)
    }


    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    println(userCredit.credits)

}