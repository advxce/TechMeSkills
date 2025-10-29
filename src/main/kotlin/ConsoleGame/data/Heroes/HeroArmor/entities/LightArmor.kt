package ConsoleGame.data.Heroes.HeroArmor.entities

import ConsoleGame.data.Heroes.HeroArmor.ArmorType
import ConsoleGame.data.Heroes.HeroArmor.HeroArmor

class LightArmor: HeroArmor {
    private val defense = 1
    override fun getArmorDefense(): Int {
        return defense
    }

    override fun getArmorType(): ArmorType {
        return ArmorType.LIGHT
    }
}