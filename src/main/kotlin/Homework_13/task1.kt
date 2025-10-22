package Homework_13

fun reduce(list:List<Int>,sum:()->Int):Int{
    return sum()
}

fun main(){
    val list = listOf(1,2,2,3,4,)
    val mySum =  reduce(list){
        val sum = list.sum()
        sum
    }
    println(mySum)

}