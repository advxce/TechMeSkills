package Homework_15

import java.util.concurrent.atomic.AtomicInteger


var count = AtomicInteger(0)

@Volatile
var state = false
fun main(){

    val thread1 = Thread{
        (1..13).forEach{ _ ->
            count.incrementAndGet()
            println(count)
            if (count.get() == 10) state = true
            Thread.sleep(100)
        }
    }

    val thread2 = Thread{
        while (!state){

            Thread.sleep(20)
        }
        println("Достигнуто")
    }
    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()


}