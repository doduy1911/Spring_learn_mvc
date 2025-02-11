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
// Danh Sách Người Dùng
    @RequestMapping("/admin/user")
    public String getAdminPage(Model model) {
        List<User> users = this.userService.getAllUser();
        model.addAttribute("users1", users);
        return "admin/user/User";
    }
//    Tạo Mới Người Dùng

    @RequestMapping("/admin/user/create")
    public String User(Model model){
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }
//    form tạo mới người Dùng submit nên

    @RequestMapping(value = "/admin/user/create1",method = RequestMethod.POST)
    public String CreateUserPage(Model model,@ModelAttribute("newUser") User doduy){
//        System.out.println(doduy);
        this.userService.handSaveUser(doduy);
        return "redirect:/admin/user";
    }
//    xem chi tiết người Dùng
    @RequestMapping("admin/user/{UserID}")
    public String getUserDetailPage(Model model ,@PathVariable long UserID){
//        System.out.println(UserID);
        List<User> UserIDd = this.userService.getAllUserByid(UserID); 
        model.addAttribute("users", UserID);
        model.addAttribute("id", UserIDd);
        return "admin/user/UserDetail";
    }

//    Cập Nhật Người Dùng

    @RequestMapping("/admin/user/update/{UserID}")
    public String getUserUpdate(Model model, @PathVariable long UserID){
        User updateUser = this.userService.getUserById(UserID);
        // System.out.println(updateUser);
        model.addAttribute("updateUser", updateUser);
        return "admin/user/update";
    }
//    Form Ngươi dùng submit nen
    @PostMapping("/admin/user/update")
    public String UpdateUserPage(Model model,@ModelAttribute("updateUser") User updateUser){
        User currentUser = this.userService.getUserById(updateUser.getId());
        if(currentUser != null){
            currentUser.setFullName(updateUser.getFullName());
            currentUser.setEmail(updateUser.getEmail());
            currentUser.setPhone(updateUser.getPhone());
            currentUser.setAddress(updateUser.getAddress());
            this.userService.handSaveUser(updateUser);
        }
        return "redirect:/admin/user";
    }


    @RequestMapping("admin/user/delete/{id}")
    public String DeleteUser(Model model,@PathVariable long id){
//        model.addAttribute("id", id);
//        User user = new User();
//        user.setId(id);
//        model.addAttribute("deleteUser",user);
//
//        return "admin/user/delete";
        this.userService.deleteUser(id);

        return "redirect:/admin/user";
    }

//    @PostMapping("admin/user/delete")
//    public String DeleteUserPage(Model model,@ModelAttribute("id") long id){
//
//    }


}
