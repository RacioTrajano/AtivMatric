package br.imd.ufrn.dominio;

import java.util.List;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String matricula;
	private Curso curso;
	private double ira;
	private List<Disciplina> disciplinas;
	
	//cria��o do construtor padr�o
	
	/*public Aluno() {
		disciplinas = new ArrayList<Disciplina>();
	}*/
	
	//cria��o de getters e setters
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public void solicitarMatricula(Disciplina disciplina) {
		
	}
	public void trancarMatricula(Disciplina disciplina) {
		
	}
	public List<Disciplina> listarDisciplinas;
	
	
	
}
