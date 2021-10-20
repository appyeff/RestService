package com.example.curso.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.curso.dao.IProfesorDao;
import com.example.curso.entity.ProfesorEntity;
import com.example.curso.service.IProfesorService;

@Service
public class ProfesorServiceImpl implements IProfesorService{
	
	@Autowired
	private IProfesorDao profesorDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ProfesorEntity> findAll() {
		return (List<ProfesorEntity>) profesorDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ProfesorEntity findProfesor(ProfesorEntity profesor) {
		return (ProfesorEntity) profesorDao.findByEmail(profesor.getEmail());
	}

	@Override
	@Transactional(readOnly = true)
	public ProfesorEntity checkProfesorLogin(ProfesorEntity profesor) {
		return (ProfesorEntity) profesorDao.findByEmailAndPassword(profesor.getEmail(), profesor.getPassword());
	}

	@Override
	@Transactional
	public void deleteProfesor(ProfesorEntity profesor) {
		profesorDao.deleteById(profesor.getId());
	}

	@Override
	@Transactional
	public ProfesorEntity updateProfesor(ProfesorEntity profesor) {
		return (ProfesorEntity) profesorDao.save(profesor);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<ProfesorEntity> findProfesorById(Long profesor_id) {
		return (Optional<ProfesorEntity>) profesorDao.findById(profesor_id);
	}

	@Override
	@Transactional
	public void deleteProfesor(Long id) {
		profesorDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public ProfesorEntity findById(Long id) {
		return profesorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public ProfesorEntity findByIdSQL(Long id) {
		return profesorDao.findByIdSQL(id);
	}

	@Override
	@Transactional
	public void save(ProfesorEntity profesor) {
		profesorDao.save(profesor);
	}

	@Override
	public void deleteAllProfesor() {
		profesorDao.deleteAll();	
	}
}
