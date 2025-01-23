package com.demo.__spring_boot_actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/hello")
    String sayHello(){
        return "Hello World 2";
    }
}
