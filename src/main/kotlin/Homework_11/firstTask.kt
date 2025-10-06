package Homework_11

import java.util.LinkedList

fun check(list:LinkedList<Int>):Int{
    var peoples = list
    var index = 0
    while (peoples.size>1){
        index = (index+1)%peoples.size
        peoples.removeAt(index)
        if (index == peoples.size){
            index = 0
        }
    }

return peoples.first
}

fun main(){
    val linkedList:LinkedList<Int> = LinkedList(listOf(1,2,3,4,5,6,7))

    //ИИ
    println(check(linkedList))
    //Мое
    var size = linkedList.size
    var i = 2
    var j = 1
    while (linkedList.size !=1){

        if(i-j<linkedList.size ){

            linkedList.remove(linkedList[i-j])
            i+=2
            j++
        }
        else {
            i -= size
            j=1
            size=linkedList.size
        }


    }
    println(linkedList)

}
