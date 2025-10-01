package ConsoleGame.domain.GameMovements


import ConsoleGame.data.GameMap.GameMap
import ConsoleGame.domain.GameMovements.Renders.RenderHeroes
import ConsoleGame.domain.GameSettings.GameSettings
import ConsoleGame.domain.UserHero.UserHero
import kotlin.math.abs

class GameMovement(
    private var selectMove: String,
    private var gameMap: MutableList<MutableList<Char>>,
    val userHero: UserHero,
    private val gameSettings: GameSettings
) {

    fun movement() {
        val (currentX, currentY) = userHero.getPosition()
        var (newX, newY) = newPosition(currentX, currentY)

        while (!isValidMove(newX, newY)) {
            println("You can't move in this direction, choose another direction (w/a/s/d):")
            selectMove = readln()
            val (tempX, tempY) = newPosition(currentX, currentY)
            newX = tempX
            newY = tempY
        }

        gameMap[currentX][currentY] = '-'
        gameMap[newX][newY] = '*'
        userHero.setPosition(newX, newY)

        GameMap.drawGameMap(gameMap)
        println("Find players: ${findNearbyHeroes()} ")

    }

    private fun newPosition(currentX: Int, currentY: Int): Pair<Int, Int> {


        return when (selectMove) {
            "w" -> currentX - 1 to currentY
            "s" -> currentX + 1 to currentY
            "a" -> currentX to currentY - 1
            "d" -> currentX to currentY + 1
            else -> currentX to currentY
        }
    }

    private fun isValidMove(newX: Int, newY: Int): Boolean {
        return newX in gameMap.indices && newY in gameMap[newX].indices && gameMap[newX][newY] != '*'
    }
    fun findNearbyHeroes(): List<UserHero> {
        val nearbyPlayers = mutableListOf<UserHero>()
        val targetPlayer = userHero
        val targetPos = targetPlayer.getPosition()

        gameSettings.heroesList.forEach{ (_, player) ->
            if (player != userHero) {
                val otherPos = player.getPosition()
                val distanceX = abs(targetPos.first - otherPos.first)
                val distanceY = abs(targetPos.second - otherPos.second)

                if (distanceX <= 1 && distanceY <= 0 || distanceX <= 0 && distanceY <= 1  ) {
                    nearbyPlayers.add(player)
                }
            }
        }

        return nearbyPlayers
    }

}



fun main() {
//    val gameSettings = GameSettings()
//    gameSettings.setPlayersCount(2)
//    gameSettings.getPlayersHeroes()
//    val renderHeroes = RenderHeroes(2,gameSettings)
//    renderHeroes.renderMap()
//    GameMap.drawGameMap(GameMap.gameMap)
//    while (true){
//        val event = readln()
//        val gameMovement1 = GameMovement(event,GameMap.gameMap,gameSettings.heroesList[0]!!)
//        gameMovement1.movement()
//        val event1= readln()
//        val gameMovement2 = GameMovement(event1,GameMap.gameMap,gameSettings.heroesList[1]!!)
//        gameMovement2.movement()
//        if (event == "q")
//            return
//    }

}