package com.amazonka.amazonkawebapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @RequestMapping("/")
    public String home(){
        return ("<h1> You are welcome. This page is accessible even for unauthorized users!</h1>");
    }

    @RequestMapping("/user")
    public String user(){
        return ("<h1> You are welcome, User!</h1>");
    }

    @RequestMapping("/admin")
    public String admin(){
        return ("<h1> You are welcome, Admin!</h1>");
    }
}
