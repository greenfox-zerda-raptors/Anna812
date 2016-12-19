package com.greenfoxacademy.springstart;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Anna on 16/12/19.
 */
@AllArgsConstructor
@Getter
public class Greeting {
    Long id;
    String content;

    public Greeting(String content) {
        this.content = content;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public String getContent() {
//        return content;
//    }
}

