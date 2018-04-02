package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class Profesor extends Persona {

	private String especialidad;

	public Profesor(String dni, String nombrePersona, LocalDate fechaNacimiento, String especialidad) {
		super(dni, nombrePersona, fechaNacimiento);
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor: especialidad: " + especialidad + " DNI " + getDni() + " Nombre: "
				+ getNombrePersona() + "]";
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
}
