package com.greenfox.RPGGame;

import java.util.Random;

/**
 * Created by Anna812 on 12/5/2016.
 */
public  abstract class PlayableCharacters extends GameObject{

    protected int level;
    protected int HP, DP, SP;
    protected Random dice = new Random();

    public PlayableCharacters(String filename, int posX, int posY) {
        super(filename, posX, posY);
        level = 1;
    }

    @Override
    public String toString() {
        return String.format("(Level %d) HP: *d/10 | DP: %d | SP: %d", level, HP, DP, SP);
    }
}
