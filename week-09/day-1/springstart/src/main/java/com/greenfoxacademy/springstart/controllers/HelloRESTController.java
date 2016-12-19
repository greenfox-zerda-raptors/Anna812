package com.greenfoxacademy.springstart.controllers;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Anna on 16/12/19.
 */
@RestController
public class HelloRESTController {
    private AtomicLong counter = new AtomicLong(0);

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name) {
        long id = counter.incrementAndGet();
        return new Greeting(id, "Hello " + name);
    }
}
