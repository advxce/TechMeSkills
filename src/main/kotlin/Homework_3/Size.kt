package Homework_3

object Size {
    fun getIntSize(num:Int):Int{
        var newNum = num
        var count = 0
        while (newNum>0){
            newNum /=10
            count++
        }
        return count

    }
}