package br.imd.ufrn.dominio;

import java.util.Objects;

public class Disciplina {
	private int id;
	private String descricao;
	private Curso curso;
	private Professor professor;
	
	//criação dos getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	//saida padronizada
	
	@Override
	public String toString() {
		return descricao + "pertencente ao curso: " + curso;
	}
	
	
	//criação de hash para indicar objetos iguais
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return id == other.id;
	}
	
	
	
	
}
