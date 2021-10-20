package com.example.curso.service;

import java.util.List;
import java.util.Optional;

import com.example.curso.entity.ProfesorEntity;

public interface IProfesorService {
	
	public List<ProfesorEntity> findAll();
	
	public void save(ProfesorEntity profesor);
	
	public ProfesorEntity findProfesor(ProfesorEntity profesor);
	
	public ProfesorEntity checkProfesorLogin(ProfesorEntity profesor);
	
	public void deleteProfesor(ProfesorEntity profesor);
	
	public ProfesorEntity updateProfesor(ProfesorEntity profesor);
	
	public Optional<ProfesorEntity> findProfesorById(Long profesor_id);
	
	public void deleteProfesor(Long id);
	
	public void deleteAllProfesor();
	
	public ProfesorEntity findById(Long id);
	
	public ProfesorEntity findByIdSQL(Long id);
}
