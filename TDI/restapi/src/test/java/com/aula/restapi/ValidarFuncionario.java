package com.aula.restapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.aula.restapi.Entidade.Funcionario;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;


    @ExtendWith(SpringExtension.class)
    @Sql(scripts="classpath:aula.sql")
    @JdbcTest
    public class ValidarFuncionario {
       
        @Test
        void InserirFuncionario() {
    
            //Arrange
            Funcionario funcionario = new Funcionario();
    
            int id =  funcionario.setIdFunc(1);
            String nome = funcionario.setNomeFunc("Maria");
            boolean plano = funcionario.setPlano(true);
    
            String esperado = "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Plano: " + plano;
    
            //Act
            String resultado = Funcionario.Carteirinha(id, nome, plano);
                    
            //Assert
            assertEquals(esperado,resultado);
        }

    }