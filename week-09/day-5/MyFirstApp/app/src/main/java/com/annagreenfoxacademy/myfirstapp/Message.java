package com.annagreenfoxacademy.myfirstapp;

/**
 * Created by Anna on 16/12/23.
 */
public class Message {
    String username;
    String body;
    boolean read;

    public Message() {
    }

    public Message(String name, String body) {
        this.username = name;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                ", name='" + username + '\'' +
                '}';
    }

}
