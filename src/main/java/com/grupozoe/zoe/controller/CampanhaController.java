package com.grupozoe.zoe.controller;

import com.grupozoe.zoe.model.CampanhaOfertada;
import com.grupozoe.zoe.repository.CampanhaOfertadaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campanhaofertada")
@CrossOrigin(origins = "*")
public class CampanhaController {

    private final CampanhaOfertadaRepository campanhaRepository;

    public CampanhaController(CampanhaOfertadaRepository campanhaRepository) {
        this.campanhaRepository = campanhaRepository;
    }

    @GetMapping
    public List<CampanhaOfertada> listarCampanhas() {
        return campanhaRepository.findAll();
    }

    @PostMapping
    public CampanhaOfertada salvarCampanha(@RequestBody CampanhaOfertada campanha) {
        return campanhaRepository.save(campanha);
    }
}
