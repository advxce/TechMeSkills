package ConsoleGame.domain.UserHero

import ConsoleGame.data.Heroes.Heroes

class UserHeroImpl(private var userHero: Heroes, heroStartName: String = "User") : UserHero {
    private var heroName: String = heroStartName

    private var position:Pair<Int,Int> = Pair(0,0)

    override fun setPosition(row:Int, column:Int){
        val newPosition = position.copy(row,column)
        position = newPosition
    }
    override fun getPosition():Pair<Int,Int>{
        return position
    }

    override fun setHeroName(heroName: String) {
        this.heroName = heroName

    }

    override fun setHeroAttack(attack: Int) {
        userHero.attack = attack
    }

    override fun setHeroDefense(defense: Int) {
        userHero.defense = defense
    }

    override fun setHeroHealth(health: Int) {
        userHero.health = health
    }

    override fun getHeroAttack(): Int {
        return userHero.attack
    }

    override fun getHeroHealth(): Int {
        return userHero.health
    }

    override fun getHeroDefense(): Int {
        return userHero.defense
    }

    override fun setHeroAttribute(attack: Int, defense: Int, health: Int) {
        userHero.attack = attack
        userHero.defense = defense
        userHero.health = health
    }

    override fun toString(): String {
        return """ 
            | ---Hero name='$heroName', 
            | ---Hero class=${userHero.javaClass.simpleName},
            | ---Hero position=${getPosition()}
            | ---${
            userHero.getAllHeroAttribute(
                attack = userHero.attack,
                defense = userHero.defense,
                health = userHero.health
            )
        }""".trimMargin()
    }
}