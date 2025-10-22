package Homework_13

data class People(val name:String, val age:Int)

fun sortedByDescending(list:List<People>){

    val resultList = list
        .filter { it.age>18 }
        .sortedByDescending { it.age }
        .apply {
            println("Output information with apply: $this")
        }
        .let {
            println("Output information with let $it")
        }


}
fun main(){

    val listPeople = listOf<People>(
        People("Dima", 18),
        People("Ilya", 21),
        People("Andrey", 23),
        People("Oleg", 4),

    )

    sortedByDescending(listPeople)

}