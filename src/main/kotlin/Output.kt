object Output {
    fun printArray(array: Array<Int>) {
        print("Output:\t")
        for (i in array.indices){
            print("${array[i]} ")
        }
        println()
    }
}