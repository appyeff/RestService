package com.example.curso.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.curso.entity.ProfesorEntity;

public interface IProfesorDao extends CrudRepository<ProfesorEntity, Long>{
	
	public ProfesorEntity findByEmail(String email);
	
	public ProfesorEntity findByEmailAndPassword(String email, String password);
	
	public Optional<ProfesorEntity> findById(Long id);
	
	@Query("select p from ProfesorEntity p where p.id=?1")
	public ProfesorEntity findByIdSQL(Long id);
	
}
