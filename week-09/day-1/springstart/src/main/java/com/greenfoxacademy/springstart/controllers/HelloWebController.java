package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Anna on 16/12/19.
 */
@Controller
public class HelloWebController {
    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        long id = counter.incrementAndGet();
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "greeting";
    }
}
