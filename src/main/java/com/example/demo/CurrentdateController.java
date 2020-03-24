package com.example.demo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentdateController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    @GetMapping("/Currentdate")
    public Currentdate currentdate(@RequestParam(value = dateFormat.format(date), defaultValue = "World")) {
        return new Currentdate(counter.incrementAndGet(), String.format(template, date));
    }
}
