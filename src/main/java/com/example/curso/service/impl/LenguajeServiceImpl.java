package com.example.curso.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.curso.dao.ILenguajeDao;
import com.example.curso.entity.LenguajeEntity;
import com.example.curso.service.ILenguajeService;

@Service
public class LenguajeServiceImpl implements ILenguajeService{
	
	@Autowired
	private ILenguajeDao lenguajeDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<LenguajeEntity> findAll() {
		return (List<LenguajeEntity>)lenguajeDao.findAll();
	}

	@Override
	@Transactional
	public void saveLenguaje(LenguajeEntity lenguaje) {
		lenguajeDao.save(lenguaje);
		
	}

	@Override
	public LenguajeEntity findLenguajeByID(Long id) {
		// TODO Auto-generated method stub
		return lenguajeDao.findByIdSQL(id);
	}

	
}
