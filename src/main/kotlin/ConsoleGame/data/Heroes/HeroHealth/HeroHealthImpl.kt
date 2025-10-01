package ConsoleGame.data.Heroes.HeroHealth

class HeroHealthImpl(private val defaultHealth:Int): HeroHealth {
    private var heroHealth:Int = 0
    override fun getHeroHealth(): Int {
        heroHealth = defaultHealth
        return heroHealth
    }

    override fun setHeroHealth(health: Int) {
        heroHealth = health
    }

    companion object{
        const val ARCHER_HEALTH = 2
        const val PALADIN_HEALTH = 2
        const val ROBBER_HEALTH = 2
    }
}