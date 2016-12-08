package com.greenfox.RPGGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Board extends JComponent implements KeyListener{
    private Area area;
    private Hero hero;
    private ArrayList<Skeleton> skeletons;
    private Boss boss;

    Board() {
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
        skeletons = Skeleton.createAnyNumberOfSkeletons(area);

        int[] temp = area.createValidPosition();
        boss =  new Boss(temp[0], temp[1]);
    }

    @Override
    public void paint(Graphics graphics) {
        for(GameObject temp : area.gameObjectList) {
                temp.draw(graphics);
        }
        for(Skeleton temp : skeletons) {
            temp.draw(graphics);
        }
        boss.draw(graphics);
        hero.draw(graphics);
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
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}

