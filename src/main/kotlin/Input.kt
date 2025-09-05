object Input {
    fun writeInt(size: Int = 100): Int {
        val number = readln().toIntOrNull()
        return if (number != null && number < size) {
            number
        } else writeInt()

    }



}