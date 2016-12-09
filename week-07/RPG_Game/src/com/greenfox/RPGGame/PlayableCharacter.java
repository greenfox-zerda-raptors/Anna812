package com.greenfox.RPGGame;

import java.util.Random;

/**
 * Created by Anna812 on 12/5/2016.
 */
public abstract class PlayableCharacter extends GameObject{

    protected int level;
    protected int HP, DP, SP, maxHP;
    protected Random dice = new Random();

    public PlayableCharacter(String filename, int posX, int posY) {
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
        while(this.isAlive() && enemy.isAlive()){
            strike(enemy);
            enemy.strike(this);
        }
        if(!enemy.isAlive()) {
            level++;
            maxHP += dice.nextInt(6) + 1;
            DP += dice.nextInt(6) + 1;
            SP += dice.nextInt(6) + 1;
        }
    }

    public void strike(PlayableCharacter playableCharacter) {
        int strikeValue = countStrikeValue();
        if(isStrikeSuccessful(playableCharacter, strikeValue)) {
            playableCharacter.HP -= (strikeValue - playableCharacter.DP);
        }
    }

    public int countStrikeValue(){
        return SP + (dice.nextInt(6) + 1) * 2;
    }

    public boolean isStrikeSuccessful(PlayableCharacter playableCharacter, int strikeValue) {
        return strikeValue > playableCharacter.DP;
    }
}
