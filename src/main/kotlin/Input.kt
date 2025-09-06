object Input {
    fun writeInt(size: Int = 100): Int {
        val number = readln().toIntOrNull()
        return if (number != null && number < size) {
            number
        } else writeInt()

    }

    fun writeRandomArray(startRange:Int, endRange:Int, arraySize:Int):Array<Int>{
        var array = Array(arraySize){0}
        for (i in array.indices){
            array[i] = startRange.rangeTo(endRange).random()
        }
        return array
    }



}