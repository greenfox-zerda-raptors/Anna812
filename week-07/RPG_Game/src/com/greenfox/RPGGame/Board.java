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
    private ArrayList<Enemy> enemies = new ArrayList<>();
    private Boss boss;

    Board() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        setPreferredSize(new Dimension(720, 910));
        frame.pack();
        repaint();
        frame.addKeyListener(this);

        area = new Area();
        hero = new Hero("hero-down.png",0, 0);
        enemies = Skeleton.createAnyNumberOfSkeletons(this);

        int[] temp = createValidPosition();
        boss =  new Boss(temp[0], temp[1]);
        enemies.add(boss);
    }

    @Override
    public void paint(Graphics graphics) {
        for(GameObject temp : area.gameObjectList) {
                temp.draw(graphics);
        }
        for(Enemy temp : enemies) {
            if(temp.isAlive()){
                temp.draw(graphics);
            }
        }

        hero.draw(graphics);

        graphics.setColor(Color.LIGHT_GRAY);
        graphics.fillRect(0, 720, 720, 910);

        displayStats(graphics);
    }

    private void displayStats(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Arial", Font.BOLD, 16));
        graphics.drawString(hero.toString(), 5, 740);

        for (int i = 0; i < enemies.size(); i++) {
            if (enemies.get(i).isAlive()) {
                graphics.drawString(enemies.get(i).toString(), 5, 760 + i * 20);
            }
        }
    }

    public int[] createValidPosition(){
        Random random = new Random();
        int[] validPosition = new int[2];
        int posX = -1;
        int posY = -1;

        while(!(area.isFloor(posX, posY) && isEmptyFloor(posX, posY))) {
            posX = random.nextInt(10);
            posY = random.nextInt(10);
        }
        validPosition[0] = posX;
        validPosition[1] = posY;

        return validPosition;
    }

    private boolean isEmptyFloor(int posX, int posY) {
        boolean freeSpace =!hero.isPositionTaken(posX, posY);
        for(Enemy temp: enemies) {
            freeSpace &= !temp.isPositionTaken(posX, posY);
        }
        return freeSpace;
    }

    private Enemy getEnemy(int posX, int posY) {
        for(Enemy temp: enemies) {
            if (temp.posX == posX && temp.posY == posY) {
                return temp;
            }
        }
        return null;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.moveLeft(area);
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.moveRight(area);
        }

        if(e.getKeyCode() == KeyEvent.VK_UP) {
            hero.moveUp(area);
        }

        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.moveDown(area);
        }

        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            if(!isEmptyFloor(hero.posX, hero.posY)) {
                hero.battle(getEnemy(hero.posX, hero.posY));
            }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}

