package com.grupozoe.zoe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.grupozoe.zoe.model.CampanhaAceita;

public interface CampanhaAceitaRepository extends MongoRepository<CampanhaAceita, String> {
    // Se quiser filtros, pode criar métodos customizados aqui
    // List<CampanhaAceita> findByEmpresa(String empresa);
    // List<CampanhaAceita> findByNomeCompleto(String nomeCompleto);
}
