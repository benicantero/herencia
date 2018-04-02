package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {

	private LocalDate fechaIncorporacion;

	public ProfesorTitular(String dni, String nombrePersona, LocalDate fechaNacimiento, 
			String especialidad,LocalDate fechaIncorporacion) {
		super(dni, nombrePersona, fechaNacimiento, especialidad);
		this.fechaIncorporacion = fechaIncorporacion;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaIncorporacion=" + fechaIncorporacion + "especialidad " + getEspecialidad()
				+ "nombre persona " + getNombrePersona();
	}
	
	
	
	
}
