package com.ToDoApp.AnnaDalnoki;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anna812 on 11/17/2016.
 */
public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("CLI Todo application\n====================\n\nAvailable commands:\n");
        UserInputHandling.help();

        ToDoList tasks = new ToDoList();
        tasks.add("kaja");
        tasks.add("pia");
        tasks.add("pihenes");

        while (userInput.hasNext()){
            String input = userInput.nextLine();
            UserInputHandling.commandInput(input);
        }
    }
}
