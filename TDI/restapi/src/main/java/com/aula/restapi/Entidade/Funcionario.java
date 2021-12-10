package com.aula.restapi.Entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valor gerado automaticamente
    public int idFunc;
    @Column(nullable = false) 
	public String nomeFunc;
    @Column(nullable = false)
	public boolean plano;


    public int getIdFunc() {
        return idFunc;
    }
    public int setIdFunc(int idFunc) {
        return this.idFunc = idFunc;
    }
    public String getNomeFunc() {
        return nomeFunc;
    }
    public String setNomeFunc(String nomeFunc) {
        return this.nomeFunc = nomeFunc;
    }
    public boolean isPlano() {
        return plano;
    }
    public boolean setPlano(boolean plano) {
        return this.plano = plano;
    }

    	public static String Carteirinha (int idFunc, String nomeFunc, boolean plano) {
		int id = idFunc;
		String nome = nomeFunc;
		String verificarPlano;
		
		if (plano == true) { 
			verificarPlano =  "true";
		} else {
			verificarPlano = "false";
		}
		return "ID:" + id + "\n" + "Nome:" + nome + "\n" + "Plano: " + verificarPlano;
	}	

}
