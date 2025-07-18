package com.grupozoe.zoe.controller;

import com.grupozoe.zoe.model.Medico;
import com.grupozoe.zoe.repository.MedicoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medico")
@CrossOrigin(origins = "*") // libera para o frontend
public class MedicoController {

    private final MedicoRepository medicoRepository;

    public MedicoController(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    // Listar todos os médicos
    @GetMapping
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }

    // Cadastrar novo médico
    @PostMapping
    public Medico salvarMedico(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }
}
