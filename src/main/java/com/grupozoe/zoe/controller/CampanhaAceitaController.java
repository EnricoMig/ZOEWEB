package com.grupozoe.zoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

import com.grupozoe.zoe.model.CampanhaAceita;
import com.grupozoe.zoe.service.CampanhaAceitaService;
import com.grupozoe.zoe.repository.CampanhaAceitaRepository;

@RestController
@RequestMapping("/api/campanhaaceita")
@CrossOrigin(origins = "*")
public class CampanhaAceitaController {

    @Autowired
    private CampanhaAceitaService aceitaService;

    @Autowired
    private CampanhaAceitaRepository aceitaRepo;

    // ✅ Aceitar uma campanha
    @PostMapping("/aceitar")
    public ResponseEntity<CampanhaAceita> aceitarCampanha(
            @RequestParam String campanhaId,
            @RequestParam String medicoId) {

        CampanhaAceita aceita = aceitaService.aceitarCampanha(campanhaId, medicoId);
        return ResponseEntity.ok(aceita);
    }

    // ✅ Listar todas as campanhas aceitas
    @GetMapping
    public List<CampanhaAceita> listarAceitas() {
        return aceitaRepo.findAll();
    }
}
