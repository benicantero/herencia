package com.iesvirgendelcarmen.herencia.ejercicios;

public class Programador extends Informatico{
	
	private String lenguajeProgramacion;

	public Programador(String nombreEmpresa, String lenguajeProgramacion) {
		super(nombreEmpresa);
		this.lenguajeProgramacion = lenguajeProgramacion;
	}

	// El programador va a cobrar un 10% mas que un informatico
	
	@Override
	public double pagarSueldo(double horas) {
		return super.pagarSueldo(horas) * 1.1;
	}

	@Override
	public String toString() {
		return "Soy un Programador que trabajo en el lenguaje de programacion " + lenguajeProgramacion + " y trabajo en " + getNombreEmpresa();
	}
	
	
}
