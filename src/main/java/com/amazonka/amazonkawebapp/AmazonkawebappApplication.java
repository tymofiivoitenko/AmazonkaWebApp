package com.amazonka.amazonkawebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@SpringBootApplication
public class AmazonkawebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmazonkawebappApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("loh you are here");
        return String.format("Hello %s!", name);
    }
}