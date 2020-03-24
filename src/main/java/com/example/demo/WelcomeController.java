package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

public class WelcomeController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/Welcome")
    public Welcome welcome(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Welcome(counter.incrementAndGet(), String.format(template, name));
    }
}
