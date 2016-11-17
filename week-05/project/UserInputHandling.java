package com.ToDoApp.AnnaDalnoki;

import java.util.Arrays;

/**
 * Created by Anna812 on 11/17/2016.
 */
abstract public class UserInputHandling {

    public static void help() {
        String[][] introText = new String[10][2];
        introText[0] = new String[]{"list", "Lists all the tasks"};
        introText[1] = new String[]{"l", "shorthand for list"};
        introText[2] = new String[]{"add", "Adds a new task"};
        introText[3] = new String[]{"a", "shorthand for add"};
        introText[4] = new String[]{"remove", "Removes a task"};
        introText[5] = new String[]{"r", "shorthand for remove"};
        introText[6] = new String[]{"complete", "Completes a task"};
        introText[7] = new String[]{"c", "shorthand for complete"};
        introText[8] = new String[]{"help", "Print out this list again"};
        introText[9] = new String[]{"h", "shorthand for help"};

        for (String[] row : introText) {
            System.out.println(Arrays.asList(row));
        }
    }

    public static void commandInput(String input){
        if (input.equalsIgnoreCase("list") || input.equalsIgnoreCase("l")) {
            ToDoList.list();
        } else if (input.contains("add") || input.contains("a")) {
            String[] a = input.split("\\s+");
            String b = a[1];
            ToDoList.add(b);
        } else if (input.contains("remove") || input.contains("r")) {
            String[] a = input.split("\\s+");
            int b = Integer.parseInt(a[1]);
            ToDoList.remove(b);
        } else if (input.contains("complete") || input.contains("c")) {
            String[] a = input.split("\\s+");
            int b = Integer.parseInt(a[1]);
            ToDoList.makeCompleted(b);
        } else if (input.contains("help") || input.contains("h")) {
            UserInputHandling.help();
        }
    }
}

