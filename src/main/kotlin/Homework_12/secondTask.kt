package Homework_12

fun main(){

    //1
    val list = listOf(1,2,3,3,4,4,5,6,7)
    println(list.groupBy { it }.entries.firstOrNull{it.value.size >1}?.key)
    //2
    val newList = listOf(1,2,3,3,4,4,5,6,7)
    val mySet = mutableSetOf<Int>()
    var result = 0
    for(elem in newList){
        if(elem in mySet){
            result = elem
            break
        }

        mySet.add(elem)
    }
    println(result)
}