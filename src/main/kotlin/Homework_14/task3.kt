package Homework_14

class NewCounter(){
    var counter:Int = 0

    fun increment(lock:Any){
        synchronized(lock){
            counter++
        }
    }

    fun decrement(lock:Any){
        synchronized(lock){
            counter--
        }
    }
}


fun main(){
    val counter = NewCounter()

    val obj1 = Any()

    val firstThread = Thread{
//
        repeat(10){
            println("Thread First")
            counter.increment(obj1)
//            Thread.sleep(500)
        }
    }

    val secondThread = Thread{
        repeat(10){
            println("Thread Second")

            counter.decrement(obj1)
//            Thread.sleep(500)
        }
    }
    firstThread.start()
    secondThread.start()

    firstThread.join()
    secondThread.join()

    println(counter.counter)
}