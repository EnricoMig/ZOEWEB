package com.grupozoe.zoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Página inicial
    @GetMapping("/")
    public String home() {
        return "index"; // corresponde a src/main/resources/templates/index.html
    }

    // Página de atendimentos
    @GetMapping("/atendimentos")
    public String atendimentos() {
        return "atendimentos"; // corresponde a src/main/resources/templates/atendimentos.html
    }

    // Página de atendimentos
    @GetMapping("/agendar")
    public String agenda() {
        return "agendar"; // corresponde a src/main/resources/templates/atendimentos.html
    }

    @GetMapping("/formClinica")
    public String formClinica(){
        return "formClinica";
    }

    @GetMapping("/formCompany")
    public String formCompany(){
        return "formCompany";
    }
}
