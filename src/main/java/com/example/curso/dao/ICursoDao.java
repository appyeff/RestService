package com.example.curso.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.CursoEntity;

public interface ICursoDao extends CrudRepository<CursoEntity, Long>{
	
	public List<CursoEntity> findByProfesorId(Long id);
	
}
