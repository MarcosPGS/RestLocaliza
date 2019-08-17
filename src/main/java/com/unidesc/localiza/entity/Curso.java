package com.unidesc.localiza.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="curso")
public class Curso implements Serializable {

	private static final long serialVersionUID=1L;
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	@Column(name="idcurso")
	private Long idCurso;
	
	@Column(name="nome")
	private String nome;
	
	
	@Column(name="semestre")
	private String semestre;
	
	@Column(name="turno")
	private String turno;
	
	@Column(name="idprofessor")
	private Long idprofessor;
	
	@Column(name="disciplina")
	private String disciplina;
	
	@Column(name="bloco")
	private String bloco;
	
	@Column(name="sala")
	private String sala;
	
	@Column(name="horarioentrada")
	private String horarioEntrada;
	
	@Column(name="horariosaida")
	private String horarioSaida;

	public Long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
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

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
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



}
