package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Todo;
import com.greenfoxacademy.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


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
    public String listToDos(@RequestParam(required = false) String active, Model model) {
        if (active != null) {
            model.addAttribute("todoList", listActiveTodos());
        } else {
            model.addAttribute("todoList", todoService.getTodos());
        }
        return "todo";
    }

    public ArrayList<Todo> listActiveTodos() {
        ArrayList<Todo> activeTodos = new ArrayList<>();
        for (Todo temp : todoService.getTodos()) {
            if(temp.isDone()) {
                activeTodos.add(temp);
            }
        }
        return activeTodos;
    }

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public String detailToDos(@PathVariable("id") int index, Model model) {
        model.addAttribute("todo", todoService.getTodos().get(index));
        return "details";
    }
}
