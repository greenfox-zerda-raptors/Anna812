package com.horoscopeGenerator.AnnaDalnoki;

import java.util.Scanner;

/**
 * Created by Anna812 on 11/18/2016.
 */
public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        DestinyList dl = new DestinyList();

        InputHandling.print();
        String prompt = "What is your sign? (or type exit to quit)";
        System.out.println(prompt);

        while (userInput.hasNext()) {
            String sign = userInput.next();

            if (sign.equalsIgnoreCase("exit")) {
                System.out.println("May the odds ever be in your favour!");
                break;
            } else {
                InputHandling.commandReading(sign, dl);
            }
            System.out.println(prompt);
        }
    }
}
