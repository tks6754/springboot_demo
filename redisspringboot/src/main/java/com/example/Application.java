package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by miaomu on 17-3-21.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println(" springApplication run !");
        SpringApplication.run(Application.class, args);
    }
}
