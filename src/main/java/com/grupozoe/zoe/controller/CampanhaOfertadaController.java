package com.grupozoe.zoe.controller;

import com.grupozoe.zoe.model.CampanhaOfertada;
import com.grupozoe.zoe.repository.CampanhaOfertadaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campanhaofertada")
public class CampanhaOfertadaController {

    @Autowired
    private CampanhaOfertadaRepository campanhaRepo;

    @GetMapping
    public List<CampanhaOfertada> listar() {
        return campanhaRepo.findAll();
    }
}
