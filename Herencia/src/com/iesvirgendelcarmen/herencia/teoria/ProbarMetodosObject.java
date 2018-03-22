package com.iesvirgendelcarmen.herencia.teoria;

public class ProbarMetodosObject {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Juan", 25);
		Persona persona2 = new Persona("Juanita", 25);
		
		//probamos equals
		System.out.println(persona1.equals(persona2) + " debe dar falso");
		Persona persona3 = persona1;
		System.out.println(persona1.equals(persona3) + " debe dar true");
		persona2.setNombre("JUAN");
		System.out.println(persona1.equals(persona2) + " debe dar true");
		System.out.println((persona1 == persona3) + " debe dar true");
		System.out.println((persona1 == persona3) + " debe dar true");
		System.out.println((persona1 == persona2) + " debe dar false");

		//probamos metodo clone
		
		Persona persona4 = persona2;
		persona4.setEdad(26);
		System.out.println((persona4 == persona2) + " debe dar true");
		System.out.println(persona4.equals(persona2) + " debe dar true");
		try {
			Persona persona5 = (Persona) persona2.clone();
			System.out.println((persona5 == persona2) + " debe dar false"); // aqui se comparan direcciones de memoria
			System.out.println(persona5.equals(persona2) + " debe dar true"); // equals compara contenido
			persona2.setEdad(25);
			System.out.println((persona5.equals(persona2)) + " debe dar false");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
