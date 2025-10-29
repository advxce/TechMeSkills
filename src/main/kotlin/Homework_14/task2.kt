package Homework_14

import kotlinx.coroutines.delay
import java.util.concurrent.atomic.AtomicInteger


fun main(){

    var counter = AtomicInteger(0)

    val firstThread = Thread{
        repeat(1000){
//            println("Thread First")
            counter.incrementAndGet()
        }
    }

    val secondThread = Thread{
        repeat(1000){
//            println("Thread Second")

            counter.decrementAndGet()
        }
    }


    firstThread.start()
    secondThread.start()

    firstThread.join()
    secondThread.join()

    println(counter)

}

//import java.util.concurrent.atomic.AtomicInteger
//
//fun testAtomicCounter() {
//    val atomicCounter = AtomicInteger(0)
//    val startTime = System.currentTimeMillis()
//
//    val threads = List(10) { index ->
//        Thread {
//            repeat(100000) {
//                atomicCounter.incrementAndGet()
//            }
//            println("Поток $index завершил")
//        }
//    }
//
//    threads.forEach { it.start() }
//    threads.forEach { it.join() }
//
//    val duration = System.currentTimeMillis() - startTime
//    println("AtomicInteger: $duration мс, результат: ${atomicCounter.get()}")
//}
//
//fun testSynchronizedCounter() {
//    var synchronizedCounter = 0
//    val lock = Object()
//    val startTime = System.currentTimeMillis()
//
//    val threads = List(10) { index ->
//        Thread {
//            repeat(100000) {
//                synchronized(lock) {
//                    synchronizedCounter++
//                }
//            }
//            println("Поток $index завершил")
//        }
//    }
//
//    threads.forEach { it.start() }
//    threads.forEach { it.join() }
//
//    val duration = System.currentTimeMillis() - startTime
//    println("Synchronized: $duration мс, результат: $synchronizedCounter")
//}
//
//fun main() {
//    println("=== Сравнение производительности ===")
//    testAtomicCounter()
//    testSynchronizedCounter()
//}