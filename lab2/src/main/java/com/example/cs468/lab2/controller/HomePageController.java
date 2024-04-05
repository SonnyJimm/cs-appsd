package com.example.cs468.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = { "/", "/home", "/lab2" })
    public String homePage(Model model) {
        model.addAttribute("name", "Tserenpuntsag");
        return "home/index";
    }
}