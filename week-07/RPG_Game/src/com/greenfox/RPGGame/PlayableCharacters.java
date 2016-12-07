package com.greenfox.RPGGame;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class PlayableCharacters extends GameObject{

    public PlayableCharacters(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void moveLeft(Area area) {
        if (area.isFloor(posX - 1, posY)) {
            posX -= 1;
            filename = "hero-left.png";
        }
    }

     public void moveRight(Area area) {
         if (area.isFloor(posX + 1, posY)) {
             posX += 1;
             filename = "hero-right.png";
         }
     }

    public void moveUp(Area area) {
        if (area.isFloor(posX, posY - 1)) {
            posY -= 1;
            filename = "hero-up.png";
        }
    }

    public void moveDown(Area area) {
        if (area.isFloor(posX, posY + 1)) {
            posY += 1;
            filename = "hero-down.png";
        }
    }

}