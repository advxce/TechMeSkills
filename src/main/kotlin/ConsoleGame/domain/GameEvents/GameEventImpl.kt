package ConsoleGame.domain.GameEvents

import ConsoleGame.data.GameMap.GameMap
import ConsoleGame.domain.GameMovements.GameBattle
import ConsoleGame.domain.GameMovements.GameMovement
import ConsoleGame.domain.GameMovements.Renders.RenderHeroes
import ConsoleGame.domain.GameSettings.GameSettings

class GameEventImpl(private val count:Int):GameEvents {
    private  val gameSettings = GameSettings()
    private var state = false

    init {
        gameSettings.setPlayersCount(count)
        gameSettings.getPlayersHeroes()
    }

    override fun startGame() {
        println("Game start\n")
        val renderHeroes = RenderHeroes(gameSettings)
        renderHeroes.renderMap()
        GameMap.drawGameMap(GameMap.gameMap)
    }

    override fun battle() {
        while (true){
            var count = 0
            while (count < gameSettings.heroesList.size){
                println("\"w\"->up, \"s\"->down, \"a\"->left, \"d\"->right")
                val playerMove = readln()
                val userHero = gameSettings.heroesList[count]
                if(userHero!=null){
                    val gameMovement = GameMovement(playerMove,GameMap.gameMap, userHero = userHero, gameSettings)
                    gameMovement.movement()
                    if(gameMovement.findNearbyHeroes().isNotEmpty()){
                        println("1 -> move, 2-> fight")
                        val battleMove = readln().toInt()

                        when(battleMove){
                            1->gameMovement.movement()
                            else -> {
                                val gameBattle = GameBattle(userHero,gameMovement.findNearbyHeroes()[0])
                                gameBattle.battle()
                                gameSettings.getPlayersHeroes()

                            }
                        }

                    }

                    if(gameSettings.heroesList[count]?.getHeroHealth()!! <= 0){
                        gameSettings.heroesList.remove(count, gameSettings.heroesList[count])
                    }

                    if (gameSettings.heroesList.count() <= 1){
                        state = true
                        return
                    }
                    count++
                }

            }

        }
    }

    override fun endGame() {
        if (state){
            if(gameSettings.heroesList.isNotEmpty())
                println("Winner ${gameSettings.heroesList[0]}")
            else println("Draw, we no have winner")
        }
    }
}