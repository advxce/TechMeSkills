package Homework_15

import java.util.concurrent.CountDownLatch

fun main(){
    val latch: CountDownLatch = CountDownLatch(5)

    val runnable:Runnable = Runnable {
        println("Something work on ${Thread.currentThread().name}")

        try {
            Thread.sleep(2000)
            println("${Thread.currentThread().name} end task")
        }
        catch (e:InterruptedException){
            e.printStackTrace()
        }
        latch.countDown()
        println("${Thread.currentThread().name} завершил свою работу")
    }

    Thread(runnable).start()
    Thread(runnable).start()
    Thread(runnable).start()
    Thread(runnable).start()
    Thread(runnable).start()

    latch.await()

     
    println("Finish")

}