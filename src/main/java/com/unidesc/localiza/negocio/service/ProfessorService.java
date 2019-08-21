package com.unidesc.localiza.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidesc.localiza.entity.Curso;
import com.unidesc.localiza.entity.Professor;
import com.unidesc.localiza.repository.ProfessorRepository;

@Service
public class ProfessorService {

//	@Autowired
//	ProfessorRepository professorRepository;
//	
//	public Professor buscarPorNome(String nome) {
//		return professorRepository.buscarNome(nome);
//	}
//	
//	
//	public List<Professor> buscarTodos(){
//		return professorRepository.findAll();
//	}
//	
//	
//	public Professor salvarCompletos(Professor professor) {
//		
//		Professor professorSalva = professorRepository.save(professor);
//		
//		
//		
//		professor.getCursos().forEach(cursos->{
//				cursos.setIdprofessor(professorSalva.getIdProfessor());
//			});
//		
//		
//		professorRepository.save(professor);
//		return professorSalva;
//	}
//	
//	
//	public Professor atualizarProfessor(Professor professor) {
//		return professorRepository.save(professor);
//	}
//
//	// Deletar convidado
//	public void deletarProfessor(Long idProfessor) {
//		professorRepository.deleteById(idProfessor);
//	}
}
