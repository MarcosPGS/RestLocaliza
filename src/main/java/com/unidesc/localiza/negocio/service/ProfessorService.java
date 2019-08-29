package com.unidesc.localiza.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidesc.localiza.entity.Professor;
import com.unidesc.localiza.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository professorRepository;
	
	
	// Buscar por nome de Professor
	public Professor buscarPorNome(String nome) {
		return professorRepository.buscarNome(nome);
	}
	
	//EndPoint Find Name
	public List<Professor> buscarTodos(){
		return professorRepository.findAll();
	}
	
	//EndPoint Create
	public Professor salvarCompletos(Professor professor) {
		
		Professor professorSalva = professorRepository.save(professor);
		
		professor.getDisciplinas().forEach(disciplinas->{
			disciplinas.setIdprofessor(professorSalva.getIdProfessor());
			});
		
		
		professorRepository.save(professor);
		return professorSalva;
	}
	
	//EndPoint Update
	public Professor atualizarProfessor(Professor professor) {
		return professorRepository.save(professor);
	}

	//EndPoint Delete
	public void deletarProfessor(Long idProfessor) {
		professorRepository.deleteById(idProfessor);
	}
}








