package com.example.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }
    @GetMapping("/admin/user")
    public String User(){
        return "create";
    }
}
