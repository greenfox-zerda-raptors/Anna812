package com.greenfox.bx;

import java.util.ArrayList;

/**
 * Created by Anna812 on 11/16/2016.
 */
public class AppCreditCard {
    public static void main(String[] args) {
        ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
        int ct = 10;

        for (int i = 0; i<ct; i++) {
            cards.add(new CreditCard("ABC" + i, random16()));
        }

        for (CreditCard iCard: cards) {
            System.out.println(iCard.toString());
        }
    }

    static String random16() {
        String out ="";
        for(int i = 0; i<16; i++) {
            out += Integer.toString( (int) ( Math.random() * 9));
        }
        return out;
    }
}
