import kotlinx.coroutines.*
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.util.concurrent.*
import kotlin.concurrent.thread

fun main(): Unit = runBlocking {
    var prev = 0
    var next = 1
    launch {
        for (i in 1..5) {
            println(prev)
            prev += next
            yield() // ✅ Даем шанс выполниться другим корутинам
        }
    }

    launch {
        for (i in 1..5) {

            println(next)
            next+=prev
            yield() // ✅ Даем шанс выполниться другим корутинам
        }
    }
}
