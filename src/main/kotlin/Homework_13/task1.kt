package Homework_13

fun myReduce(list:List<Int>,sum:()->Int):Int{
    return sum()
}

fun mySum(numbers:List<Int>) = numbers.reduce { acc, i -> acc+i }

fun main(){
    val list = listOf(1,2,2,3,4,)
    val mySumCheck =  myReduce(list){
        val sum = list.sum()
        sum
    }
    println(mySumCheck)

    println(mySum(numbers = list))


}