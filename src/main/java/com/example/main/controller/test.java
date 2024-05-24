package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {

    @RequestMapping("/hh")
    @ResponseBody
    public String showRegistrationForm() {
        
        return "register";
    }
	
}
