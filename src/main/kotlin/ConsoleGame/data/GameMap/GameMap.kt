package ConsoleGame.data.GameMap

object GameMap {
    const val COLUMN:Int = 7
    const val ROW:Int = 7

    var gameMap:MutableList<MutableList<Char>> = renderMap(ROW, COLUMN)

    fun renderMap(row:Int,column:Int): MutableList<MutableList<Char>> {
        val tempGameMap = mutableListOf<MutableList<Char>>()
        for(i in 0..row){
            val currentRow = mutableListOf<Char>()
            for(j in 0..column){
                currentRow.add('-')
            }
            tempGameMap.add(currentRow)
        }
        return tempGameMap
    }
    fun drawGameMap(map:List<List<Char>>){
        for(i in map.indices){
            for(j in map[i].indices){
                print("${map[i][j]} ")
            }
            println()
        }
        println()
    }
}

fun main(){
    GameMap.apply {
        renderMap(ROW, COLUMN)
        drawGameMap(gameMap)
    }
}