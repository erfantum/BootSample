package com.example.demo.controller;

import com.example.demo.model.UsersAuthModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
    @RequestMapping("/loginPage")
    public String loginPage(Model model){
        model.addAttribute("user",new UsersAuthModel());
        return "loginpage";
    }
}
