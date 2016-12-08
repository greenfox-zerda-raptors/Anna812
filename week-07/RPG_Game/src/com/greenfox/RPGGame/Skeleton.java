package com.greenfox.RPGGame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Skeleton extends Enemy {

    public Skeleton(int posX, int posY) {
        super("skeleton.png", posX, posY);
    }

    public static ArrayList<Skeleton> createAnyNumberOfSkeletons(Area area) {
        Random random =  new Random();
        ArrayList<Skeleton> skeletons = new ArrayList<>();

        for(int i = 0; i < random.nextInt(7 - 3) + 3; i++) {
            int[] temp = area.createValidPosition();
            Skeleton skeleton =  new Skeleton(temp[0], temp[1]);
            skeletons.add(skeleton);
        }
        return skeletons;
    }
}
