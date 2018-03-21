package com.iesvirgendelcarmen.herencia.teoria;

public class Poligono {
	
	private int numeroLados;
	private boolean regular;
	private String nombre;
	
	public Poligono(int numeroLados, boolean regular, String nombre) {
		this.numeroLados = numeroLados;
		this.regular = regular;
		this.nombre = nombre;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public boolean isRegular() {
		return regular;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Poligono [numeroLados=" + numeroLados + ", regular=" + regular + ", nombre=" + nombre + "]";
	}

	
}
