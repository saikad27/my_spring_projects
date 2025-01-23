package com.myApplication.demo.__rest_controller.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @GetMapping
    String fun() {
        return coachName;
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
