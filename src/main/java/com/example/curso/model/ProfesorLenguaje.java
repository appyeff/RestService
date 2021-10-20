package com.example.curso.model;

import com.example.curso.entity.LenguajeEntity;
import com.example.curso.entity.ProfesorEntity;

public class ProfesorLenguaje {
	
	private ProfesorEntity profesor;
	private LenguajeEntity lenguaje;
	public ProfesorEntity getProfesor() {
		return profesor;
	}
	public void setProfesor(ProfesorEntity profesor) {
		this.profesor = profesor;
	}
	public LenguajeEntity getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(LenguajeEntity lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	
}
