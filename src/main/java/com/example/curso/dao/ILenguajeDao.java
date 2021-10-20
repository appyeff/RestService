package com.example.curso.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.LenguajeEntity;

public interface ILenguajeDao extends CrudRepository<LenguajeEntity, Long>{
	
	@Query("select l from LenguajeEntity l where l.id=?1")
	public LenguajeEntity findByIdSQL(Long id);
	
}
