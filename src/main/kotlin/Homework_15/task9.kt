package Homework_15

import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingQueue

fun main(){

    val queue = ArrayBlockingQueue<String>(5)

    val producer = Thread{
        println("Добавление товаров в ${Thread.currentThread().name}")
        val listProducts = listOf<String>("apple", "banana", "orange", "peak", "watermelon","greyfruit", "cucumber" )

        listProducts.forEach { product->

            try {
                val beforeSize = queue.size
                println("add item as ${product}")
                queue.put(product)
                val afterSize = queue.size
                println("Добавил: $product (очередь: $beforeSize → $afterSize/5)")
                Thread.sleep(100)
            }
            catch (e:InterruptedException){
                println("producer break")
                return@Thread
            }

        }

        queue.put("finish")
        println("producer finish work")


    }

    val consumer = Thread{
        while (true){
            try {

                Thread.sleep(2000)
                val product = queue.take()
                println("Consumer забрал: $product (очередь: ${queue.size}/5)")
                if (product == "finish"){
                    println("consumer get signal as finish")
                    break
                }
            }
            catch (e:InterruptedException){
                e.printStackTrace()
                println("consumer break")
                break
            }

        }

        println("consumer finish work")

    }

    producer.start()
    consumer.start()
    producer.join()
    consumer.join()
}