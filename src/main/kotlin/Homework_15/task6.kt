package Homework_15

import java.util.concurrent.CyclicBarrier

fun main(){
    val cyclicBarrier = CyclicBarrier(3){
        println("Потоки дождались друг друга")
    }


    val threads = (1..3).map {
        Thread{
            println("Поток ${Thread.currentThread().name} выполняет свою работу")
            try {
                Thread.sleep((1000*it).toLong())
                println("Поток ${Thread.currentThread().name} ждет выполнения других потоков...")
                cyclicBarrier.await()
            }
            catch (e: InterruptedException){
                e.printStackTrace()
            }
            finally {
                Thread.sleep(1000)
                println("Поток ${Thread.currentThread().name} продолжает свою работу")
            }
        }.apply { start() }
    }

    threads.forEach{
        it.join()
    }

    println("finish")
}