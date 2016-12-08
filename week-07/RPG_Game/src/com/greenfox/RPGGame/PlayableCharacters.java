package com.greenfox.RPGGame;

/**
 * Created by Anna812 on 12/5/2016.
 */
public  abstract class PlayableCharacters extends GameObject{

    protected int level;
    protected int HP, DP, SP;

    public PlayableCharacters(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    @Override
    public String toString() {
        return String.format("(Level %d) HP: *d/10 | DP: %d | SP: %d", level, HP, DP, SP);
    }
}
