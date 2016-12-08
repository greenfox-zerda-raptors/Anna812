package com.greenfox.RPGGame;

import java.util.Random;

/**
 * Created by Anna on 12/7/2016.
 */
public abstract class Enemy extends PlayableCharacters {

    public Enemy(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }
}
