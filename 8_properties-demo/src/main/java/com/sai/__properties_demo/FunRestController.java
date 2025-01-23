package com.sai.__properties_demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    String teamInfo(){
        return "Coach : "+coachName+", Team name : "+teamName;
    }

    @GetMapping("/hello")
    String hello(){
        return "Hello World!";
    }
    @GetMapping("/fortune")
    String fortune(){
        return "Today is your lucky day!";
    }
}
