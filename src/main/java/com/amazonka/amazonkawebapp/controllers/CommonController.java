package com.amazonka.amazonkawebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @RequestMapping("/")
    public String home(){
        return ("<h1> You are welcome!</h1>");
    }
}
