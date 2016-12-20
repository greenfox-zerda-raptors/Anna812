package com.greenfoxacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Anna on 16/12/20.
 */
@AllArgsConstructor
public class Todo {
    @Getter
    @Setter
    int id;
    String title;
    Boolean isUrgent;
    Boolean isDone;

    public Todo(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
