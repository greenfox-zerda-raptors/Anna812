package com.greenfox.RPGGame;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Boss extends Enemy {

    public Boss(int posX, int posY) {
        super("boss.png", posX, posY);
        maxHP = 42;
        HP = 2 * level * (dice.nextInt(6) + 1) + (dice.nextInt(6) + 1);
        DP = level / 2 * (dice.nextInt(6) + 1)  + (dice.nextInt(6) + 1) / 2;
        SP = level * (dice.nextInt(6) + 1) + level;
    }

    @Override
    public String toString() {
        return "Boss" + super.toString();
    }
}
