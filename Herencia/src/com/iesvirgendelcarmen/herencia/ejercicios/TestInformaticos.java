package com.iesvirgendelcarmen.herencia.ejercicios;

public class TestInformaticos {
	
	public static void main(String[] args) {
		
		Programador programador1 = new Programador("Empresa1","java");
		Programador programador2 = new Programador("Empresa1","python");
		Analista analista1 = new Analista("Empresa1", "desarrollo web");
		Analista analista2 = new Analista("Empresa1", "desarrollo móvil");
		
		System.out.printf("Programador con %.2f horas trabajadas gana %.2f€%n",25.0,programador1.pagarSueldo(25));
		System.out.printf("Analista con %.2f horas trabajadas gana %.2f€%n",25.0,analista1.pagarSueldo(25));
		
		System.out.println("Empresa del programador 1 " + programador1.getNombreEmpresa());
		System.out.println("Empresa del analista 1 " + analista1.getNombreEmpresa());
		System.out.println(programador1);
		System.out.println(analista1.toString());
		
		Informatico informatico = new Programador("Empresa2", "javascript");
		
	}

}
