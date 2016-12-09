package com.greenfox.RPGGame;

/**
 * Created by Anna on 12/7/2016.
 */
public abstract class Enemy extends PlayableCharacter {

    public Enemy(String filename, int posX, int posY) {
        super(filename, posX, posY);
        level = generateLevel();
    }

    private int generateLevel() {
        int roll = dice.nextInt(10);
        if(roll < 5) {
            return 1;
        } else if(roll < 9) {
            return 2;
        } else {
            return 3;
        }
    }
}
