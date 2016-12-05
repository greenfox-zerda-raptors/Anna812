package com.greenfox.RPGGame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Area extends JComponent {

    public Area() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        setPreferredSize(new Dimension(720, 720));
        frame.pack();
    }

    @Override
    public void paint(Graphics graphics) {
        Tile floor = new Tile("floor.png", 300, 300);
        floor.draw(graphics);
    }
}
