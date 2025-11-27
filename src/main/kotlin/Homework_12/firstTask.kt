package Homework_12

fun main() {
    val list = listOf("java", "listen",  "enlist", "avaj", "world", "silent")
    val groups = list.groupBy { it.toCharArray().sorted() }
    val resultList = mutableListOf<String>()

    groups.values.sortedBy { it.count() }.reversed().forEach{ groups->
       resultList.addAll(groups)
   }
    println(resultList)



}