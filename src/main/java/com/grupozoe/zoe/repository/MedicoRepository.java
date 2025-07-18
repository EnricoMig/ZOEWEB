package com.grupozoe.zoe.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.grupozoe.zoe.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String> {
}
