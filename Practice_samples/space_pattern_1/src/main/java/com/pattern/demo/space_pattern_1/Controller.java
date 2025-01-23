package com.pattern.demo.space_pattern_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    char[] spacePattern(){
        char arr[] = new char[]{'A','B','C','D'};
        return arr;
    }
}
