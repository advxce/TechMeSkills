package Homework_15

import java.util.concurrent.Semaphore

class ParkingLot{

    val parkingLimiter = Semaphore(3)

    fun tryParking(time: Long){

        println("Попытка занять место")
        Thread.sleep(2000)
        try {
            parkingLimiter.acquire()
            println("${Thread.currentThread().name} занял парковку")
            Thread.sleep(time*1000)
        }
        catch (e:InterruptedException){
            e.printStackTrace()
        }
        finally {
            Thread.sleep(1000)
            println("${Thread.currentThread().name} освободил парковку")
            parkingLimiter.release()

        }

    }

}

fun main(){

    val parkingLot = ParkingLot()

    Thread{
        parkingLot.tryParking(2)
    }.start()
    Thread{
        parkingLot.tryParking(4)
    }.start()
    Thread{
        parkingLot.tryParking(5)
    }.start()
    Thread{
        parkingLot.tryParking(1)
    }.start()
    Thread{
        parkingLot.tryParking(3)
    }.start()

}