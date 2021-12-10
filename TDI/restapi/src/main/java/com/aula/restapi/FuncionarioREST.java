package com.aula.restapi;
import java.util.List;
import com.aula.restapi.database.RepositorioFuncionario;
import com.aula.restapi.Entidade.Funcionario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/funcionario")
public class FuncionarioREST {
    
    @Autowired //cria objeto, injeta no atributo
    private RepositorioFuncionario repositorio;

    @GetMapping
    public List<Funcionario> listar(){
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Funcionario funcionario){
        repositorio.save(funcionario);
    }

    @PutMapping
    public void alterar(@RequestBody Funcionario funcionario){
        if(funcionario.getIdFunc() > 0){
            repositorio.save(funcionario);
        }
    }

    @DeleteMapping
    public void excluir(@RequestBody Funcionario funcionario){
        repositorio.delete(funcionario);
    }
}
