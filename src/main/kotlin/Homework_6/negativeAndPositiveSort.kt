package Homework_6

fun negativeAndPositiveSort(array:IntArray){
    for(i in 0..array.size-1){
        for(j in 1..array.size-1){
            if(array[j] <0 ){
                val temp = array[j-1]
                array[j-1] = array[j]
                array[j] = temp
            }
        }
    }

    array.forEach {
        println(it)
    }
}

fun main(){
    val array = intArrayOf(3,-5,5,-6,7,4,-8,-2)
    negativeAndPositiveSort(array)
}
