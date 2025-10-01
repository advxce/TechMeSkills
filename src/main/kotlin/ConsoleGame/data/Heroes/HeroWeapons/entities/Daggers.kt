package ConsoleGame.data.Heroes.HeroWeapons.entities

import ConsoleGame.data.Heroes.HeroWeapons.HeroAttack

class Daggers: HeroAttack {
    private var attack = 7
    override fun getHeroAttack(): Int {
        return attack
    }
    override fun setHeroAttack(attack:Int){
        this.attack = attack
    }
}