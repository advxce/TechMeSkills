package Homework_7

class Book(
    val title:String,
    val author: String,
    val year:Int,
    val genre:Genre,
    override val id: Int
):LibraryItem() {


    override fun toString(): String {
        return "Book(title='$title', author='$author', year=$year, genre=$genre, id=$id)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        if (title != other.title) return false
        if (author != other.author) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + author.hashCode()
        return result
    }

}