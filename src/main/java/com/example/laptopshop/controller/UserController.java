package com.example.laptopshop.controller;

import com.example.laptopshop.domain.User;
import com.example.laptopshop.repository.UserRepository;
import com.example.laptopshop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String getHomePage() {
        List<User> arrUser = this.userService.getAllUserByEmail("admin@gmail.com");
        System.out.println(arrUser);
        return "index";
    }

    @RequestMapping("/admin/user")
    public String getAdminPage(Model model) {
        List<User> users = this.userService.getAllUser();
        model.addAttribute("users1", users);
        return "admin/user/User";
    }



    @RequestMapping("/admin/user/create")
    public String User(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1",method = RequestMethod.POST)
    public String CreateUserPage(Model model,@ModelAttribute("newUser") User doduy){
        System.out.println(doduy);
        this.userService.handSaveUser(doduy);
        return "redirect:/admin/user";
    } 
}
