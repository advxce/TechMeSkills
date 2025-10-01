package ConsoleGame.data.Heroes.HeroWeapons.entities

import ConsoleGame.data.Heroes.HeroWeapons.HeroAttack

class HeavyAxe: HeroAttack {
    private var attack = 4
    override fun getHeroAttack(): Int {
        return attack
    }

    override fun setHeroAttack(attack:Int){
        this.attack = attack
    }
}