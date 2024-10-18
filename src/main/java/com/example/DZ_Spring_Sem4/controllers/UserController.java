package com.example.DZ_Spring_Sem4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.DZ_Spring_Sem4.models.User;
import com.example.DZ_Spring_Sem4.servisces.UserService;

@Controller
public class UserController {

    private UserService users;

    public UserController(UserService users) {
        this.users = users;
    }

    @GetMapping("/users")
    public String getProducts(Model model) {
        model.addAttribute("users", users.getAllUsers());
        return "users";
    }

    @GetMapping("/registration")
    public String getRegPage(){
        return "registration";
    }
    @PostMapping("/registration")
    public String regUser(User user, Model model){
        users.addUser(user);
        model.addAttribute("registration", users.getAllUsers());
        return "users";
    }
}
