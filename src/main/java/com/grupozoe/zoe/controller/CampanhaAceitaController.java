package com.grupozoe.zoe.controller;

import com.grupozoe.zoe.model.CampanhaAceita;
import com.grupozoe.zoe.service.CampanhaAceitaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campanhaaceita")
public class CampanhaAceitaController {

    private final CampanhaAceitaService campanhaAceitaService;

    public CampanhaAceitaController(CampanhaAceitaService campanhaAceitaService) {
        this.campanhaAceitaService = campanhaAceitaService;
    }

    @GetMapping
    public List<CampanhaAceita> listarCampanhasAceitas() {
        return campanhaAceitaService.listarAceites();
    }
}
