package com.greenfox.RPGGame;

import java.util.ArrayList;

/**
 * Created by Anna on 12/7/2016.
 */
public class Area {
    protected ArrayList<GameObject> gameObjectList;
    private int [][] map = new int[][] {
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public Area() {
        gameObjectList = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[j][i] == 0) {
                    GameObject floor = new GameObject("floor.png", i, j);
                    gameObjectList.add(floor);
                } else {
                    GameObject floor = new GameObject("wall.png", i, j);
                    gameObjectList.add(floor);
                }
            }
        }
    }

    public boolean isFloor(int posX, int posY) {
        if (isValidPosition(posX) && isValidPosition(posY)){
            return map[posX][posY] == 0;
        }
    }

    public boolean isValidPosition (int position) {
        return position < map.length + 1 && position >= 0;
    }
}
