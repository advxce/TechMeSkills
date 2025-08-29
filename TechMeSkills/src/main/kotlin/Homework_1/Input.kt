package Homework_1

object Input {
    fun writeInt(size: Int = 100): Int {
        val number = readln().toIntOrNull()
        return if (number != null && number < 100) {
            number
        } else writeInt()

    }

}