package com.unidesc.localiza.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidesc.localiza.entity.Curso;
import com.unidesc.localiza.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	CursoRepository cursoRepository;
	
	
	
	public List<Curso> buscarTodos(){
		return cursoRepository.findAll();
	}
	
	
	public Curso salvarCompleto(Curso curso) {
		 Curso cursoSalvo = cursoRepository.save(curso);
		 
		 curso.getProfessores().forEach(professores->{
			 professores.setIdcurso(cursoSalvo.getIdCurso());
		 });
		 
		 cursoRepository.save(curso);
		return cursoSalvo;
	}
	
	public Curso atualizarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}

	
	public void deletarCurso(Long idCurso) {
		cursoRepository.deleteById(idCurso);
	}

}
