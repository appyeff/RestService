package com.example.curso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.curso.dao.ICursoDao;
import com.example.curso.entity.CursoEntity;
import com.example.curso.service.ICursoService;

@Service
public class CursoServiceImpl implements ICursoService{
	
	@Autowired
	private ICursoDao cursoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<CursoEntity> findAll() {
		return (List<CursoEntity>) cursoDao.findAll();
	}

	@Override
	public void saveCurso(CursoEntity curso) {
		cursoDao.save(curso);	
	}

	@Override
	public List<CursoEntity> getCursosProfesor(Long id) {
		return (List<CursoEntity>) cursoDao.findByProfesorId(id);
	}

}
