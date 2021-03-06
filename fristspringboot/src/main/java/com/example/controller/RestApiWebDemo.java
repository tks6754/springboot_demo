package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by miaomu on 17-3-21.
 */

@RestController
@EnableAutoConfiguration
public class RestApiWebDemo {

    @RequestMapping("/")
    String home(){
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(RestApiWebDemo.class, args);
    }
}
