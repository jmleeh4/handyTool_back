package com.lime.handytool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lime.handyTool")
@SpringBootApplication
public class HandyToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandyToolApplication.class, args);
    }



}
