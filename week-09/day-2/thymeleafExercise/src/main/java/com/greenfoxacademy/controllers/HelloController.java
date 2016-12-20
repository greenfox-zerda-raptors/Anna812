package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Anna on 16/12/20.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/helloworld")
    @ResponseBody
    public String helloWorld(@RequestParam(value = "name", required = false, defaultValue = "Thymeleaf") String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd. HH:mm");
        Date currentTime = new Date();
        return String.format("Hello %s! %s", name, sdf.format(currentTime));
    }
}
