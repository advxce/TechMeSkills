package ConsoleGame.domain.UserHero


interface UserHero {

    fun setPosition(row:Int,column:Int)
    fun getPosition():Pair<Int,Int>

    fun setHeroName(heroName:String)
    fun setHeroAttack(attack: Int)
    fun setHeroDefense(defense: Int)
    fun setHeroHealth(health: Int)

    fun getHeroAttack():Int
    fun getHeroHealth():Int
    fun getHeroDefense():Int

    fun setHeroAttribute(attack: Int, defense: Int, health: Int)
}