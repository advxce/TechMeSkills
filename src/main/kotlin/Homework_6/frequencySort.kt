package Homework_6

fun frequencySort(array: IntArray) {
    val arrayCountKey = IntArray(array.size)
    for (i in 0..array.size - 1) {
        var count = 0
        for (j in 0..array.size - 1) {
            if (array[i] == array[j]) {
                count++
            }

        }
        arrayCountKey[i] = count

    }

    for (i in 0..array.size - 1) {
        for (j in 1..array.size - 1) {
            if (arrayCountKey[j - 1] < arrayCountKey[j]) {
                val temp = array[j - 1]
                array[j - 1] = array[j]
                array[j] = temp

                val tempKey = arrayCountKey[j - 1]
                arrayCountKey[j - 1] = arrayCountKey[j]
                arrayCountKey[j] = tempKey


            }

            if (arrayCountKey[j - 1] == arrayCountKey[j] && array[j - 1] >= array[j] && arrayCountKey[j] >1){
                val newTemp = array[j - 1]
                array[j - 1] = array[j]
                array[j] = newTemp
            }

        }

    }

    array.forEach {
        print("$it ")
    }

}

fun main() {
    val arr = intArrayOf(4,5,6,5,4,3)
    frequencySort(arr)
}
