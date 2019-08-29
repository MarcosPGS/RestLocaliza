package com.unidesc.localiza.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unidesc.localiza.entity.Disciplina;
import com.unidesc.localiza.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
	

	//EndPoint Find Name
	public List<Disciplina> buscarTodos(){
		return disciplinaRepository.findAll();
	}
	
	//EndPoint Create
	public Disciplina salvarCompletos(Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}
	
	//EndPoint Update
	public Disciplina atualizarDisciplina(Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}

	//EndPoint Delete
	public void deletarDisciplina(Long idDisciplina) {
		disciplinaRepository.deleteById(idDisciplina);
	}

}
