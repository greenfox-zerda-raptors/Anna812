package com.ToDoApp.AnnaDalnoki;

/**
 * Created by Anna812 on 11/17/2016.
 */
public class ToDoItem {

    public String content;
    public boolean complete;

    public ToDoItem(String content) {
        this.content = content;
        this.complete = false;
    }

    public boolean isComplete(ToDoItem toDoItem) {
        return complete = true;
    }

    @Override
    public String toString() {
        if (complete == false) {
            return String.format("[ ] - %s", content);
        } else
            return String.format("[X] - %s", content);
    }
}
