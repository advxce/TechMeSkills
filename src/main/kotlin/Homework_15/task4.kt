package Homework_15

import java.util.concurrent.locks.ReentrantLock


val lock:ReentrantLock = ReentrantLock()
fun attemptLock(){
    if (lock.tryLock()){
        try {
            println("поток захвачен потоком ${Thread.currentThread().name}")
            Thread.sleep(500)
            println("${Thread.currentThread().name} выполняю свою задачу")
            Thread.sleep(500)
            println("${Thread.currentThread().name} Выполнил свою")
            Thread.sleep(500)
        }
        catch (e:InterruptedException){
            e.printStackTrace()
        }
        finally {
            lock.unlock()
            println("Поток освобожден")
        }

    }
    else{

        println("поток ${Thread.currentThread().name} не смог захватить lock")
        Thread.sleep(500)
        println("${Thread.currentThread().name} Выполняю другую задачу")
        Thread.sleep(500)
        println("${Thread.currentThread().name} Выполнил другую")
    }
}

fun main(){


    val thread1 = Thread{
        attemptLock()
    }

    val thread2 = Thread{
        attemptLock()
    }

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    Thread.sleep(200)
    println("finish")

}