package ConsoleGame.domain.GameEvents

import ConsoleGame.domain.UserHero.UserHeroImpl

interface GameEvents {

    fun startGame()
    fun battle()
    fun endGame()

}