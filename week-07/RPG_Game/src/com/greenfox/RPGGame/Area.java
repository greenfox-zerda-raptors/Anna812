package com.greenfox.RPGGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Area extends JComponent {

    private ArrayList<Tile> tileList;

    public Area() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        setPreferredSize(new Dimension(720, 720));
        frame.pack();
        tileList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                Tile floor = new Tile("floor.png", i * 72, j * 72);
                tileList.add(floor);
            }
        }
    }

    @Override
    public void paint(Graphics graphics) {
        for(Tile temp : tileList) {
                temp.draw(graphics);
        }
    }
}

