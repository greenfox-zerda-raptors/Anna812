package com.greenfox.RPGGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class GameObject {
    private BufferedImage image;
    protected int posX, posY;

    public GameObject(String filename, int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        drawImageOfObject(filename);
    }

    public void drawImageOfObject(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX *72, posY *72, null);
        }
    }
}
