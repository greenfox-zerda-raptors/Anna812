package com.greenfox.RPGGame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Skeleton extends Enemy {

    public Skeleton(int posX, int posY) {
        super("skeleton.png", posX, posY);
        HP = 2 * level * (dice.nextInt(6) + 1);
        DP = level / 2 * (dice.nextInt(6) + 1);
        SP = level * (dice.nextInt(6) + 1);
    }

    public static ArrayList<Enemy> createAnyNumberOfSkeletons(Board board) {
        Random random =  new Random();
        ArrayList<Enemy> skeletons = new ArrayList<>();

        for(int i = 0; i < random.nextInt(4) + 3; i++) {
            int[] temp = board.createValidPosition();
            Skeleton skeleton =  new Skeleton(temp[0], temp[1]);
            skeletons.add(skeleton);
        }
        return skeletons;
    }
}
