package ConsoleGame.data.Heroes.HeroWeapons.entities

import ConsoleGame.data.Heroes.HeroWeapons.HeroAttack

class Bow: HeroAttack {
    private var attack = 10
    override fun getHeroAttack(): Int {
        return attack

    }
    override fun setHeroAttack(attack:Int){
        this.attack = attack
    }
}