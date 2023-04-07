package br.com.alura.rh.model;

import java.math.BigDecimal;

public class DadosPessoais {
	
	protected String nome;
	protected String cpf;
	protected Cargo cargo;
	protected BigDecimal salario;
	
	public DadosPessoais(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}


	
}
