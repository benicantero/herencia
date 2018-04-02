package com.iesvirgendelcarmen.herencia.ejercicios;

public class Analista extends Informatico {
	
	private String especialidad;

	public Analista(String nombreEmpresa, String especialidad) {
		super(nombreEmpresa);
		this.especialidad = especialidad;
	}

	@Override
	public double pagarSueldo(double horas) {
		return super.pagarSueldo(horas) * 1.3;
	}

	@Override
	public String toString() {
		return "Soy Analista especializado en " + especialidad + " y con sueldo base por hora " + getSueldoBasePorHora() + "€";
	}

	
}
