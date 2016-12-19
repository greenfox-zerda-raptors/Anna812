package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Anna on 16/12/19.
 */
@RestController
public class HelloRESTController {
    private AtomicLong counter = new AtomicLong(1);


    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name) {
        long id = counter.incrementAndGet();
        return new Greeting(id, "Hello " + name);
    }
}
