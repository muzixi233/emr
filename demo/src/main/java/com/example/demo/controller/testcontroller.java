package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testcontroller {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
