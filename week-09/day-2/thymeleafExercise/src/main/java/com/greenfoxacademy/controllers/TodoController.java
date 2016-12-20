package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Anna on 16/12/20.
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @RequestMapping(value = "/list")
    @ResponseBody
    public void listToDos() {

    }
}
