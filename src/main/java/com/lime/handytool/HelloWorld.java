package com.lime.handytool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {
    @GetMapping("/hello")
    public String helloWolrd(){
        //20221022
        System.out.println("test1");

        return "hello";
    }
}
