package com.example.curso.service;

import java.util.List;

import com.example.curso.entity.LenguajeEntity;

public interface ILenguajeService {

	public List<LenguajeEntity> findAll();
	
	public void saveLenguaje(LenguajeEntity lenguaje);
	
	public LenguajeEntity findLenguajeByID(Long id);
}
