package Homework_11

import java.util.LinkedList

fun main(){
    val linkedList1 = LinkedList<Int>(listOf(1,5,7,9,4,10)).sorted()
    val linkedList2 = LinkedList<Int>(listOf(1,2,7,3,4,11,13,0)).sorted()

    val linkedList3 = LinkedList<Int>()

    var i = 0
    var j = 0
    while (i<linkedList1.size && j<linkedList2.size){
        if(linkedList1[i]< linkedList2[j]){
            linkedList3.add(linkedList1[i])
            i++
        }
        else{
            linkedList3.add(linkedList2[j])
            j++
        }

    }

    while (i < linkedList1.size) {
        linkedList3.add(linkedList1[i])
        i++
    }
    while (j < linkedList2.size) {
        linkedList3.add(linkedList2[j])
        j++
    }
    println(linkedList3)
}