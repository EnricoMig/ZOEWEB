package com.grupozoe.zoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
    
    @GetMapping("/funcionario")
    public String funcionario() {
        return "funcionario";
    }

    @GetMapping("/campanha")
    public String campanha() {
        return "campanha";
    }

    @GetMapping("/medico")
    public String medico() {
        return "medico";
    }
}
