package Homework_15

import java.util.concurrent.locks.ReentrantLock

class SharedResource{
    val lock: ReentrantLock = ReentrantLock()
    fun showResource(){
        lock.lock()
        try {
            Thread.sleep(100)
            println("Some Resources from Thread:${Thread.currentThread().name}")
        }
        catch (e:Exception){
            println(e.message)
        }
        finally {
            lock.unlock()
        }
    }

}

fun main(){

    val sharedResource = SharedResource()

    val thread1 = Thread{ sharedResource.showResource()}
    val thread2 = Thread{ sharedResource.showResource()}

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()

    Thread.sleep(400)
    println("Finish work")

}