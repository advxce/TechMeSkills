package ConsoleGame.presentation

import ConsoleGame.domain.GameEvents.GameEventImpl

fun main(){


  val gameEvent = GameEventImpl(2)
    gameEvent.startGame()
    gameEvent.battle()
    gameEvent.endGame()
}