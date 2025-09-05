package ConsoleGame.domain.GameSettings

import ConsoleGame.data.GameMap.GameMap
import ConsoleGame.data.Heroes.HeroClasses.Archer
import ConsoleGame.data.Heroes.HeroClasses.Paladin
import ConsoleGame.data.Heroes.HeroClasses.Robber
import ConsoleGame.domain.UserHero.UserHero
import ConsoleGame.domain.UserHero.UserHeroImpl

class GameSettings {

    val heroesList = hashMapOf<Int, UserHero>()

    fun setPlayersCount(count: Int) {
        for (i in 0..count - 1) {
            println(
                """Enter class Hero:
                |1 -> Archer
                |2 -> Robber
                |3 -> Paladin
            """.trimMargin()
            )
            val randomRaw = (0..GameMap.ROW).random()
            val randomCol = (0..GameMap.COLUMN).random()

            val classHero: Int = readln().toInt()
            println("Enter hero name")
            val nameHero: String = readln()
            when (classHero) {
                1 -> {
                    val archer = UserHeroImpl(
                        userHero = Archer(),
                        heroStartName = nameHero
                    )
                    archer.setPosition(randomRaw, randomCol)
                    heroesList[i] = archer

                }

                2 -> {
                    val robber = UserHeroImpl(
                        userHero = Robber(),
                        heroStartName = nameHero
                    )
                    robber.setPosition(randomRaw,randomCol)
                    heroesList[i] = robber

                }

                else -> {
                    val paladin = UserHeroImpl(
                        userHero = Paladin(),
                        heroStartName = nameHero
                    )
                    paladin.setPosition(randomRaw,randomCol)
                    heroesList[i] = paladin

                }
            }
        }
    }

    fun getPlayersHeroes() {
        heroesList.forEach { key, value ->
            println("Player ${key + 1} \n ${value}")
        }
    }

}


