package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {

	private LocalDate finDeContrato;

	public ProfesorInterino(String dni, String nombrePersona, LocalDate fechaNacimiento, String especialidad,
			LocalDate finDeContrato) {
		super(dni, nombrePersona, fechaNacimiento, especialidad);
		this.finDeContrato = finDeContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [finDeContrato= " + finDeContrato + "Especialidad: " + getEspecialidad()
				+ "Nombre: " + getNombrePersona();
	}
	
	
		
}
