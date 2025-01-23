package com.demo.__dev_tools;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewRestController {
    @GetMapping("/hello")
    String fun(){
        return "Hello World!";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    String workout(){
        return "Run a hard 5k!";
    }

    //expose a new endpoint for forture
    @GetMapping("/fortune")
    String getDailyFortune(){
        return "Today is your lucky day.";
    }
}
