package com.ToDoApp.AnnaDalnoki;

import java.util.Arrays;

/**
 * Created by Anna812 on 11/17/2016.
 */
abstract public class UserInputHandling {

    public static void help() {

        String[] intro = new String[]{"list", "Lists all the tasks", "l", "shorthand for list", "add", "Adds a new task",
                "a", "shorthand for add", "remove", "Removes a task", "r", "shorthand for remove", "complete", "Completes a task",
                "c", "shorthand for complete", "help", "Print out this list again", "h", "shorthand for help"};

        for (int i = 0; i < intro.length; i+=2) {
            System.out.printf("%-10s %s\n", intro[i], intro[i+1]);
        }
    }

    public static void commandInput(String input, ToDoList tl){

        String[] a = input.split("\\s+");
        int b;

        if (a[0].equals("remove") || a[0].equals("r")) {
            try {
                b = Integer.parseInt(a[1]);
                tl.remove(b);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to remove: No index is provided");
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: Index is not a number");
            }

        } else if (a[0].equals("complete") || a[0].equals("c")) {
            try{
                b = Integer.parseInt(a[1]);
                tl.makeCompleted(b);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Unable to complete: No index is provided");
            } catch (NumberFormatException e) {
                System.out.println("Unable to complete: Index is not a number");
            }

        } else if (a[0].equals("list") || a[0].equals("l")) {
            tl.list();

        } else if (a[0].equals("add") || a[0].equals("a")) {
            String str = "";
            for (int i = 1; i < a.length; i++) {
                str = str + " " + a[i];
            }
            ToDoItem temp = new ToDoItem(str);
            tl.add(temp);

        } else if (a[0].equals("help") || a[0].equals("h")) {
            UserInputHandling.help();
        } else {
            System.out.println("Unsupported argument");
        }
    }
}

