package com.greenfox.RPGGame;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Hero extends PlayableCharacters {

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
        level = 1;
        HP = 20 + 3 * (dice.nextInt(6) + 1);
        DP = 2 * (dice.nextInt(6) + 1);
        SP = 5 + dice.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return "Hero" + super.toString();
    }

    public void moveLeft(Area area) {
        if (area.isFloor(posX - 1, posY)) {
            posX -= 1;
            drawImageOfObject("hero-left.png");
        }
    }

    public void moveRight(Area area) {
        if (area.isFloor(posX + 1, posY)) {
            posX += 1;
            drawImageOfObject("hero-right.png");
        }
    }

    public void moveUp(Area area) {
        if (area.isFloor(posX, posY - 1)) {
            posY -= 1;
            drawImageOfObject("hero-up.png");
        }
    }

    public void moveDown(Area area) {
        if (area.isFloor(posX, posY + 1)) {
            posY += 1;
            drawImageOfObject("hero-down.png");
        }
    }
}
