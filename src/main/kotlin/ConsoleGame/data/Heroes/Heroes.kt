package ConsoleGame.data.Heroes

import ConsoleGame.data.Heroes.HeroArmor.HeroArmor
import ConsoleGame.data.Heroes.HeroHealth.HeroHealth
import ConsoleGame.data.Heroes.HeroWeapons.HeroAttack

abstract class Heroes {
    abstract var attack: Int
    abstract var defense: Int
    abstract var health: Int


    abstract fun getHeroDefense():Int
    abstract fun getHeroAttack():Int
    abstract fun getHeroHealth():Int

    fun getAllHeroAttribute(
        attack: Int,
        defense: Int,
        health: Int
    ): String {
        return """
            |Hero attribute:
            |<---> attack: $attack
            |<---> defense: $defense
            |<---> health: $health
        """.trimMargin()
    }
}