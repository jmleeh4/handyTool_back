package com.example.handytool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {
    @GetMapping("/hello")
    public String helloWolrd(){
        System.out.println("test");

        return "hello";
    }
}
