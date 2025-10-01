package ConsoleGame.data.Heroes.HeroArmor.entities

import ConsoleGame.data.Heroes.HeroArmor.ArmorType
import ConsoleGame.data.Heroes.HeroArmor.HeroArmor

class HeavyArmor: HeroArmor {
    private val defense = 10
    override fun getArmorDefense(): Int {
        return defense
    }

    override fun getArmorType(): ArmorType {
        return ArmorType.HEAVY
    }
}