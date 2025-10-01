package Homework_7

fun main(){
    val libraryItems = listOf<Book>(
        Book("Ono","Steven King", 1986, Genre.HORROR, 1 ),
        Book("Ono2","Steven King", 1998, Genre.HORROR, 1 ),
        Book("Langoliers","Steven King", 1992, Genre.HORROR, 1 )
    )

    libraryItems.forEach {
        println(it)
    }
}