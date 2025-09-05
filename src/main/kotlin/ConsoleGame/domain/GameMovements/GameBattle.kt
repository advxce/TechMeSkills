package ConsoleGame.domain.GameMovements

import ConsoleGame.domain.GameSettings.GameSettings
import ConsoleGame.domain.UserHero.UserHero
import kotlin.math.abs

class GameBattle(val currentHero: UserHero, val enemyHero: UserHero) {


    fun battle(){

        if(currentHero.getHeroHealth() == 0){
            println("Cant fight, because has 0 hp, $currentHero lose")
            return
        }
        if (enemyHero.getHeroHealth() == 0    ){
            println("Cant fight, because has 0 hp, $enemyHero lose")
            return
        }

        val resist = enemyHero.getHeroAttack()-2
        val enemyHeroDifDefense = enemyHero.getHeroDefense()-currentHero.getHeroAttack()
        enemyHero.setHeroDefense(enemyHeroDifDefense)
        val currentHeroDifDefense = currentHero.getHeroDefense()-resist
        currentHero.setHeroDefense(currentHeroDifDefense)
        if (enemyHero.getHeroDefense()<0){
            enemyHero.setHeroHealth(enemyHero.getHeroHealth()- abs(enemyHero.getHeroDefense()))
        }
        if (currentHero.getHeroDefense()<0){
            currentHero.setHeroHealth(currentHero.getHeroHealth()- abs(currentHeroDifDefense))
        }



    }

}

fun main(){
    val gameSettings = GameSettings()
    gameSettings.setPlayersCount(2)
    gameSettings.getPlayersHeroes()
    val hero1 = gameSettings.heroesList[0]
    val hero2 = gameSettings.heroesList[1]
    if(hero1 != null && hero2 != null){
        val gameBattle = GameBattle(hero1, hero2)
        gameBattle.battle()
        gameSettings.getPlayersHeroes()
    }


}