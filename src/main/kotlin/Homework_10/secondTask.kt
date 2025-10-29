package Homework_10

class CustomException:Exception() {
    override val message: String
        get() = "You younger than 18"
}

fun main(){
    val age = readln().toInt()
    try {
        if(age<18){
            throw CustomException()
        }
        else{
            println("you accept")
        }
    }
    catch (e:CustomException){
        println(CustomException().message)
    }
}