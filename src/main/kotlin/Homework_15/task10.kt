package Homework_15

import java.util.concurrent.CountDownLatch
import java.util.concurrent.CyclicBarrier

fun main(){
    val startBarrier = CyclicBarrier(4){
        println("get start barrier")
    }
    val finishBarrier = CyclicBarrier(4){
        println("get finish barrier")
    }

    val mainThread = CountDownLatch(4)

    val thread = (1..4).map { threadNumber->
        Thread{
            println("${Thread.currentThread().name} поток делает свою задачу")
            try {
                Thread.sleep(1000)
            }
            catch (e:InterruptedException){
                e.printStackTrace()
            }
            finally {
                println("${Thread.currentThread().name}  готовится к работе...")
                Thread.sleep((500 * threadNumber).toLong())

                println("${Thread.currentThread().name}  готов и ждет у стартового барьера")
                startBarrier.await()

                println("${Thread.currentThread().name}  НАЧАЛ работу одновременно со всеми!")
                val workTime = (1000 + Math.random() * 1000).toLong()
                Thread.sleep(workTime)
                println("${Thread.currentThread().name}  завершил работу за ${workTime}ms")
                finishBarrier.await()

                mainThread.countDown()
                println("${Thread.currentThread().name}  сообщил о завершении")

            }
        }.apply { start() }
    }


    thread.forEach { it.join() }

    println("Главный поток ждет завершения всех рабочих потоков...")
    mainThread.await()

    println("\nГЛАВНЫЙ ПОТОК: Все потоки завершили работу!")
    println("Продолжаем выполнение основной программы...")

}