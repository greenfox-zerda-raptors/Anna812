package com.greenfox.RPGGame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Anna on 12/7/2016.
 */
public class Area {
    protected ArrayList<GameObject> gameObjectList;
    private int [][] map = new int[][] {
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 1, 1, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 0, 0, 0, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 0, 0, 0, 1, 1},
            {0, 0, 1, 1, 0, 0, 1, 0, 0, 1},
            {0, 1, 0, 0, 0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 0}
    };

    public Area() {
        gameObjectList = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] == 0) {
                    Floor floor = new Floor(j ,i);
                    gameObjectList.add(floor);
                } else {
                    Wall wall = new Wall(j, i);
                    gameObjectList.add(wall);
                }
            }
        }
    }

    public int[] createValidPosition() {
        Random random = new Random();
        int[] validPosition = new int[2];
        int posX = 0;
        int posY = 0;
        boolean isValidPosition = false;

        while(!isValidPosition) {
            posX = random.nextInt(10);
            posY = random.nextInt(10);
            isValidPosition = isFloor(posX, posY);
        }
        validPosition[0] = posX;
        validPosition[1] = posY;

        return validPosition;
    }

    public boolean isFloor(int posX, int posY) {
        if (isValidPosition(posX) && isValidPosition(posY)){
            return map[posY][posX] == 0;
        }
        return false;
    }

    public boolean isValidPosition (int position) {
        return position < map.length && position >= 0;
    }
}
