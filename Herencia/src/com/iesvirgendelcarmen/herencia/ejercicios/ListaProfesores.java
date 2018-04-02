package com.iesvirgendelcarmen.herencia.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaProfesores {

		private List<Profesor> lista = new ArrayList<>();
		
	public boolean aniadirProfesor(Profesor profesor) {
		return lista.add(profesor);
	}

	public List<Profesor> getLista() {
		return lista;
	}
		
}
