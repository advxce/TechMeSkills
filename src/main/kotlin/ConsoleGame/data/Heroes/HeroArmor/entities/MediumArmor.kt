package ConsoleGame.data.Heroes.HeroArmor.entities

import ConsoleGame.data.Heroes.HeroArmor.ArmorType
import ConsoleGame.data.Heroes.HeroArmor.HeroArmor

class MediumArmor: HeroArmor {
    private val defense = 5
    override fun getArmorDefense(): Int {
        return defense
    }

    override fun getArmorType(): ArmorType {
        return ArmorType.MEDIUM
    }
}