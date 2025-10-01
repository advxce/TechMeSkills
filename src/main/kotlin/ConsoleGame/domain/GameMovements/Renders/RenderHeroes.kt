package ConsoleGame.domain.GameMovements.Renders

import ConsoleGame.data.GameMap.GameMap
import ConsoleGame.domain.GameSettings.GameSettings
import ConsoleGame.domain.UserHero.UserHero
import kotlin.math.abs

class RenderHeroes(gameSettings: GameSettings) {

    private var gameMap = GameMap.gameMap
    val myPlayers: HashMap<Int, UserHero> by lazy {
        gameSettings.heroesList
    }


    init {

        checkPosition()
        GameMap.apply {
            renderMap(ROW, COLUMN)
        }

    }


    fun renderMap(){
        gameMap = renderHeroesOnMap()
    }
    private fun checkPosition() {
        for (i in 0 until myPlayers.size - 1) {
            val currentPlayer = myPlayers[i]
            val nextPlayer = myPlayers[i + 1]

            if (currentPlayer?.getPosition() == nextPlayer?.getPosition()) {
                val randRow = (0..GameMap.ROW).random()
                val randCol = (0..GameMap.COLUMN).random()
                currentPlayer?.setPosition(randRow, randCol)
            }
        }
    }

    private fun renderHeroesOnMap(): MutableList<MutableList<Char>> {
        val tempGameMap = gameMap

        myPlayers.forEach { (_, player) ->
            player.getPosition().let { (x, y) ->
                if (x in tempGameMap.indices && y in (tempGameMap.getOrNull(x)?.indices ?: IntRange.EMPTY)) {
                    tempGameMap[x][y] = '*'
                }
            }
        }



        return tempGameMap
    }


}


