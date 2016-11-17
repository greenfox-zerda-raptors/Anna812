package com.ToDoApp.AnnaDalnoki;

import java.util.ArrayList;

/**
 * Created by Anna812 on 11/17/2016.
 */
public class ToDoList {

    public ArrayList<ToDoItem> ls = new ArrayList<>();

    public void add(String content) {
        ToDoItem newToDO = new ToDoItem(content);
        ls.add(newToDO);
    }

    public void remove(int index) {
        ls.remove(index - 1);
    }

    public void list () {
        for (int i = 0; i< ls.size(); i++) {
            ToDoItem item = ls.get(i);
            System.out.println(i + 1 + item.toString());
        }
    }

    public void makeCompleted (int i) {
        ToDoItem item = ls.get(i - 1);
        item.setComplete(true);
    }
}
