package Homework_10

fun main(){
    val word:String? = readlnOrNull()
    try {
        if(word.isNullOrBlank()){
            throw IllegalArgumentException()
        }
        else{
            println(word)
        }
    }
    catch (e:IllegalArgumentException){
        println("empty string")
    }

}