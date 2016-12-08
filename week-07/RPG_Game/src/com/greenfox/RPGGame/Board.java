package com.greenfox.RPGGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Board extends JComponent implements KeyListener{
    private Area area;
    private Hero hero;
    private ArrayList<Skeleton> skeletons;
    Monster monster;

    public Board() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        setPreferredSize(new Dimension(720, 720));
        frame.pack();
        repaint();
        frame.addKeyListener(this);

        area = new Area();
        hero = new Hero("hero-down.png",0, 0);
        createAnyNumberOfSkeletons(4);
    }

    private ArrayList<Skeleton> createAnyNumberOfSkeletons(int numberOfSkeletonsNeeded) {
        skeletons = new ArrayList<>();
        for(int i = 0; i < numberOfSkeletonsNeeded; i++) {
            int[] temp = createValidPosition();
            Skeleton skeleton =  new Skeleton(temp[0], temp[1]);
            skeletons.add(skeleton);
            System.out.printf("%d.: x: %d, Y: %d\n", i, skeleton.posX, skeleton.posY);
        }
        return skeletons;
    }

    private int[] createValidPosition() {
        Random random = new Random();
        int[] validPosition = new int[2];
        int posX = 0;
        int posY = 0;
        boolean isValidPosition = false;

        while(!isValidPosition) {
            posX = random.nextInt(10);
            posY = random.nextInt(10);
            isValidPosition = area.isFloor(posX, posY);
        }

        validPosition[0] = posY;
        validPosition[1] = posX;
        return validPosition;
    }

    @Override
    public void paint(Graphics graphics) {
        for(GameObject temp : area.gameObjectList) {
                temp.draw(graphics);
        }
        for(Skeleton temp : skeletons) {
            temp.draw(graphics);
        }
        hero.draw(graphics);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.moveLeft(area);
            repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.moveRight(area);
            repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.moveUp(area);
            repaint();
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.moveDown(area);
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}

