package com.amazonka.amazonkawebapp.controllers;

import com.amazonka.amazonkawebapp.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/users")
    public String getUsers(Model model){

        model.addAttribute("users", userRepository.findAll());

        return "users/userlist";
    }

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}
