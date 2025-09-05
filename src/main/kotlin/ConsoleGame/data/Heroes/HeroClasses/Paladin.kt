package ConsoleGame.data.Heroes.HeroClasses

import ConsoleGame.data.Heroes.HeroArmor.HeroArmor
import ConsoleGame.data.Heroes.HeroArmor.entities.HeavyArmor
import ConsoleGame.data.Heroes.Heroes
import ConsoleGame.data.Heroes.HeroHealth.HeroHealth
import ConsoleGame.data.Heroes.HeroHealth.HeroHealthImpl
import ConsoleGame.data.Heroes.HeroWeapons.HeroAttack
import ConsoleGame.data.Heroes.HeroWeapons.entities.HeavyAxe

class Paladin(
    override var attack: Int = HeavyAxe().getHeroAttack(),
    override var defense: Int = HeavyArmor().getArmorDefense(),
    override var health: Int = HeroHealthImpl(HeroHealthImpl.PALADIN_HEALTH).getHeroHealth()
) : Heroes(){
    override fun getHeroDefense(): Int {
        return defense
    }

    override fun getHeroAttack(): Int {
        return attack
    }

    override fun getHeroHealth(): Int {
        return health
    }

    fun getAllAttribute():String{
        return this.getAllHeroAttribute(attack,defense,health)
    }
}