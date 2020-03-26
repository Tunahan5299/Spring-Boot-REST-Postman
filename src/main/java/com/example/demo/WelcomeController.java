package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

public class WelcomeController {
    @GetMapping("/Welcome")
    @ResponseBody
    public String Welcome(@RequestParam(required = false) String naam){

        return "Welcome " + naam ;
    }
}
