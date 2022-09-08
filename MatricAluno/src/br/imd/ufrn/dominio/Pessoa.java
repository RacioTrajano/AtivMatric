package br.imd.ufrn.dominio;

import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private Date dataNascimento;
	private String cpf;
	
	//criação de getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//criação da saida padrão
	@Override
	public String toString() {
		return nome + "cpf: " + cpf ;
	}
	
	
	
}
