package com.grupozoe.zoe.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.grupozoe.zoe.model.Funcionario;
public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}

