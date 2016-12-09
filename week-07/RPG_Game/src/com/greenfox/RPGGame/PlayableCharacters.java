package com.greenfox.RPGGame;

import java.util.Random;

/**
 * Created by Anna812 on 12/5/2016.
 */
public abstract class PlayableCharacters extends GameObject{

    protected int level;
    protected int HP, DP, SP, maxHP;
    protected Random dice = new Random();

    public PlayableCharacters(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    @Override
    public String toString() {
        return String.format("(Level %d) HP: %d / %d | DP: %d | SP: %d", level, HP, maxHP, DP, SP);
    }

    public boolean isPositionTaken(int posX, int posY) {
        return this.posX == posX && this.posY == posY;
    }

    public boolean isAlive(){
        return HP > 0;
    }

    public void battle(Enemy enemy) {
        while(this.isAlive() || enemy.isAlive()){
            int heroStrikeValue = countStrikeValue();
            if(isStrikeSuccessful(enemy, heroStrikeValue)) {
                enemy.HP -= (heroStrikeValue - enemy.DP);
            }
            int enemyStrikeValue = countStrikeValue();
            if(enemy.isStrikeSuccessful(this, enemyStrikeValue)) {
                HP -= (enemyStrikeValue - DP);
            }
        }
    }

    public int countStrikeValue(){
        return SP + dice.nextInt(7) * 2;
    }

    public boolean isStrikeSuccessful(PlayableCharacters playableCharacter, int strikeValue) {
        return strikeValue > playableCharacter.DP;
    }
}
