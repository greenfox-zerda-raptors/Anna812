package com.greenfoxacademy.controllers;

import com.greenfoxacademy.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Anna on 16/12/20.
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping(value = "/list")
    public String listToDos(Model model) {
        model.addAttribute("todoList", todoService.getTodos());
        return "todo";
    }
}
