package com.grupozoe.zoe.controller;
import com.grupozoe.zoe.repository.FuncionarioRepository;
import com.grupozoe.zoe.model.Funcionario;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin(origins = "*")
public class FuncionarioController {

    private final FuncionarioRepository repository;

    public FuncionarioController(FuncionarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return repository.findAll(); // Retorna todos do MongoDB
    }
}

