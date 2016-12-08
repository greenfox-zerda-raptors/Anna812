package com.greenfox.RPGGame;

import java.util.Random;

/**
 * Created by Anna on 12/7/2016.
 */
public abstract class Monster extends PlayableCharacters {

    public Monster(String filename,int posX, int posY) {
        super(filename, posX, posY);
    }

    public static int generatePosition() {
        Random random = new Random();
        int coordinate = random.nextInt(9);
        return coordinate;
    }
}