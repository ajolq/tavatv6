package com.aula.restapi.database;

import com.aula.restapi.Entidade.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFuncionario extends JpaRepository<Funcionario,Integer> {
    
    
}
