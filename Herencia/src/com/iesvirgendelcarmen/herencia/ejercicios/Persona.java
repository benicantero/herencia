package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class Persona {
	
	private String dni;
	private String nombrePersona;
	private LocalDate fechaNacimiento;
	
	public Persona(String dni, String nombrePersona, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombrePersona=" + nombrePersona + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
	
	
	
}
