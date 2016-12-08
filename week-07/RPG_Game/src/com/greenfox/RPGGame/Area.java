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
                    GameObject floor = new GameObject("floor.png", j, i);
                    gameObjectList.add(floor);
                } else {
                    GameObject wall = new GameObject("wall.png", j, i);
                    gameObjectList.add(wall);
                }
            }
        }
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
