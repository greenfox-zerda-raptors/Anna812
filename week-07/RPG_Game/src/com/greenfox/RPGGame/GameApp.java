package com.greenfox.RPGGame;

import javax.swing.*;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class GameApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Board();
        }
        });
    }
}
