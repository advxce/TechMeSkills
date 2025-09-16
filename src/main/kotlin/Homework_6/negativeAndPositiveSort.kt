package Homework_6

fun negativeAndPositiveSort(array:IntArray){
    for(i in 0..array.size-1){
        for(j in 1..array.size-1){
            if(array[j-1]>=0){
                val temp = array[j-1]
                array[j-1] = array[j]
                array[j] = temp
            }
        }
    }

    array.forEach {
        print("$it ")
    }
}

fun main(){
    val array = intArrayOf(4,-3,2,-1,0,-5)
    negativeAndPositiveSort(array)



}



