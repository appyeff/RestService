package com.example.curso.service;

import java.util.List;

import com.example.curso.entity.CursoEntity;

public interface ICursoService {
	
	public List<CursoEntity> findAll();
	
	public void saveCurso(CursoEntity curso);
	
	public List<CursoEntity> getCursosProfesor(Long id);
}
