package com.ToDoApp.AnnaDalnoki;

import java.util.ArrayList;

/**
 * Created by Anna812 on 11/17/2016.
 */
public class ToDoList {

    public static ArrayList<ToDoItem> ls = new ArrayList<>();

    public static void add(String content) {
        ToDoItem newToDO = new ToDoItem(content);
        ls.add(newToDO);
    }

    public static void remove(int index) {
        ls.remove(index-1);
    }

    public static void list() {
        for (int i = 0; i< ls.size(); i++) {
            ToDoItem item = ls.get(i);
            System.out.println(i + 1 + " - " + item.toString());
        }
    }

    public static void makeCompleted (int i) {
        ToDoItem item = ls.get(i - 1);
        item.setComplete(true);
    }
}
