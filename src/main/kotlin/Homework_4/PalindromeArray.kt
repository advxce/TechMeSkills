package Homework_4

fun palindromeArray(array: Array<Int>):Boolean{
    var palindromeState = false
    val middle = array.size /2
    println(middle)
    for (i in 0..middle){
        val cursorStart = 0
        val cursorEnd = array.size-1
        if(array[cursorStart+i] != array[cursorEnd-i]){
            palindromeState = false
            break
        }
        else{
            palindromeState = true
        }
    }
    return palindromeState

}

fun main(){
    val palindromeState = palindromeArray(arrayOf(1,2,3,4,5,3,2,1))
    if(palindromeState)
        println("Palindrome")
    else
        println("Not palindrome")
}