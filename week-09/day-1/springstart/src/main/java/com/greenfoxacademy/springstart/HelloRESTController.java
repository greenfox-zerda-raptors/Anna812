package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anna on 16/12/19.
 */
@RestController
public class HelloRESTController {

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam() String name) {
        return new Greeting(name);
    }
}
