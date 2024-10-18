package com.example.DZ_Spring_Sem4.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
