package com.grupozoe.zoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/admin")
public class AdminController {
    
    
    @GetMapping("/login")
    public String login() {
        return "login"; // corresponde a src/main/resources/templates/index.html
    }

    @GetMapping("/senha")
    public String senha() {
        return "senha";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }
    
}
