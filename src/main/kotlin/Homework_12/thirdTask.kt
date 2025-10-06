package Homework_12

fun main(){
    val list = listOf(1,2,3,4,5,6,7,8,9,3,5,6)
    val targetVal = 9
    val countMap = mutableMapOf<Int,Int>()
    val result = mutableListOf<Pair<Int, Int>>()

    for (i in list){
        countMap[i] = countMap.getOrDefault(i,0)+1
    }

    for (i in list){
        val secondVal = targetVal-i
        val count = countMap[secondVal]?:0

        if(count>0 && countMap[i]!! >0){
            result.add(i to secondVal)
            countMap[i] = countMap[i]!! - 1
            countMap[secondVal] = countMap[secondVal]!! - 1
        }
    }

    println(result)
}