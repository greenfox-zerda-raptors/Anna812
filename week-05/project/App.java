package com.ToDoApp.AnnaDalnoki;

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
        tasks.loadFromFile();

        while (userInput.hasNext()){
            String input = userInput.nextLine();
            if (input.equals("exit") || input.equals("e")) {
                break;
            }
            UserInputHandling.commandInput(input, tasks);
        }
        tasks.writeToFile();
    }
}
