package com.unidesc.localiza.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina implements Serializable {
	
	private static final long serialVersionUID =1l;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="iddisciplina")
	private Long idDisciplina;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="bloco")
	private String bloco;
	
	@Column(name="sala")
	private String sala;
	
	@Column(name="horarioentrada")
	private String horarioEntrada;
	
	@Column(name="horariosaida")
	private String horarioSaida;
	
	@Column(name="curso")
	private String curso;
	
	@Column(name="diasemana")
	private String diaSemana;
	
	@Column(name="turno")
	private String turno;
	
	
	@Column(name="idprofessor")
	private Long idprofessor;


	public Long getIdDisciplina() {
		return idDisciplina;
	}


	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getBloco() {
		return bloco;
	}


	public void setBloco(String bloco) {
		this.bloco = bloco;
	}


	public String getSala() {
		return sala;
	}


	public void setSala(String sala) {
		this.sala = sala;
	}


	public String getHorarioEntrada() {
		return horarioEntrada;
	}


	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}


	public String getHorarioSaida() {
		return horarioSaida;
	}


	public void setHorarioSaida(String horarioSaida) {
		this.horarioSaida = horarioSaida;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getDiaSemana() {
		return diaSemana;
	}


	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public Long getIdprofessor() {
		return idprofessor;
	}


	public void setIdprofessor(Long idprofessor) {
		this.idprofessor = idprofessor;
	}
}
