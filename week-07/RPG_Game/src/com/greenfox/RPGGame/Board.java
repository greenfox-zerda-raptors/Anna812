package com.greenfox.RPGGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Board extends JComponent {
    private Area area;
    private Hero hero;

    public Board() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        setPreferredSize(new Dimension(720, 720));
        frame.pack();
        repaint();
        area = new Area();
        hero = new Hero(0, 0);
    }

    @Override
    public void paint(Graphics graphics) {
        for(GameObject temp : area.gameObjectList) {
                temp.draw(graphics);
        }
        hero.draw(graphics);
    }
}

