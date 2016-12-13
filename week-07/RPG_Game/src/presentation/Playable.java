package presentation;

import java.util.Random;

/**
 * Created by Anna on 12/9/2016.
 */
public class Playable {

    private int level;
    protected int HP, DP, SP, maxHP;
    Random dice = new Random();

    public void battle(Monster monster) {
        while(this.isAlive() && monster.isAlive()){
            int heroStrikeValue = SP + (dice.nextInt(6) + 1) * 2;
            if(heroStrikeValue > monster.DP) {
                monster.HP -= (heroStrikeValue - monster.DP);
            }
            int monsterStrikeValue = SP + (dice.nextInt(6) + 1) * 2;
            if(monsterStrikeValue > this.DP) {
                HP -= (monsterStrikeValue - DP);
            }
        }
        if(!monster.isAlive()) {
            level += 1;
            maxHP += dice.nextInt(6) + 1;
            DP += dice.nextInt(6) + 1;
            SP += dice.nextInt(6) + 1;
        }
    }

//     private void upgradeHero(Monster monster) {
//        if(!monster.isAlive()) {
//            level += 1;
//            maxHP += dice.nextInt(6) + 1;
//            DP += dice.nextInt(6) + 1;
//            SP += dice.nextInt(6) + 1;
//        }
//    }
//
//    public int countStrikeValue(){
//        return SP + (dice.nextInt(6) + 1) * 2;
//    }
//
//    public boolean isStrikeSuccessful(Playable playable, int strikeValue) {
//        return strikeValue > playable.DP;
//    }
//
//    public void strike(Playable playable) {
//        int strikeValue = countStrikeValue();
//        if(isStrikeSuccessful(playable, strikeValue)) {
//            playable.HP -= (strikeValue - playable.DP);
//        }
//    }

    public boolean isAlive(){
        return HP > 0;
    }
}
