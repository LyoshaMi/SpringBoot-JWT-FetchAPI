package com.example.preproject2_2.controllers;

import com.example.preproject2_2.models.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public String getUser(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user", user);
        return "user-panel";
    }
}
