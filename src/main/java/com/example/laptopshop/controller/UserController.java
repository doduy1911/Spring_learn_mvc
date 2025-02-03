package com.example.laptopshop.controller;

import com.example.laptopshop.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class UserController {
    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }
    @RequestMapping("/admin/user")
    public String User(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1",method = RequestMethod.POST)
    public String CreateUserPage(Model model,@ModelAttribute("newUser") User doduy){
        System.out.println("aaaa"+doduy);

        return "create";

    }
}
