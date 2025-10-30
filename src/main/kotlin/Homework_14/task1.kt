package Homework_14

val obj = Any()

class Counter(){


    var count = 0

    fun increment(){
        synchronized(obj){
            count++
        }
    }

    fun decrement(){
        synchronized(obj){
            count--
        }
    }

}


fun main(){

    val counter = Counter()

//
    val firstThread = Thread{
        repeat(10){
            counter.increment()
        }
    }

    val secondThread = Thread{
        repeat(10){
            counter.decrement()
        }
    }

    firstThread.start()
    secondThread.start()

    firstThread.join()
    secondThread.join()

    println(counter.count)


}