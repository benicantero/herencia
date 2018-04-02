package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class TestProfesores {

	public static void main(String[] args) {
		
		ListaProfesores claustro = new ListaProfesores(); // creamos lista vacia
		Profesor profesor1 = new ProfesorTitular("11222333P", "juan", LocalDate.of(1975, 12, 1), "Lengua", LocalDate.of(2018, 01, 01));
		Profesor profesor2 = new ProfesorTitular("22233344T", "pedro", LocalDate.of(1980, 10, 21), "mates", LocalDate.of(2018, 01, 01));
		Profesor profesor3 = new ProfesorTitular("33344455R", "luis", LocalDate.of(1985, 2, 12), "informatica", LocalDate.of(2018, 01, 01));
		Profesor profesor4 = new ProfesorInterino("12345678Z", "isabel", LocalDate.of(1965, 1, 2), "latin", LocalDate.of(2018, 01, 01));
		Profesor profesor5 = new ProfesorInterino("98765432D", "antonio", LocalDate.of(1990, 8, 20), "griego", LocalDate.of(2018, 01, 01));
		
		claustro.aniadirProfesor(profesor1);
		claustro.aniadirProfesor(profesor2);
		claustro.aniadirProfesor(profesor3);
		claustro.aniadirProfesor(profesor4);
		claustro.aniadirProfesor(profesor5);
		System.out.println(claustro.getLista());
	}

}
