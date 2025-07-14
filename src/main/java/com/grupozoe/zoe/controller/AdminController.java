package com.grupozoe.zoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> origin/main


@Controller
@RequestMapping("/admin")
public class AdminController {
    
    
    @GetMapping("/login")
    public String login() {
<<<<<<< HEAD
        return "login";
=======
        return "login"; // corresponde a src/main/resources/templates/index.html
>>>>>>> origin/main
    }

    @GetMapping("/senha")
    public String senha() {
        return "senha";
    }

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }
    
<<<<<<< HEAD
    @GetMapping("/gerencia")
    public String gerencia() {
        return "gerencia";
    }
=======
>>>>>>> origin/main
}
