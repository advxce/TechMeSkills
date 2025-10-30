package Homework_15

import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

fun main(){

    val pools = Executors.newFixedThreadPool(10)
    for(i in 1..10){
        pools.execute {

            println("${Thread.currentThread().name} make task")
            Thread.sleep(1000)
            println("${Thread.currentThread().name} end task")
        }
    }



    pools.shutdown()
}