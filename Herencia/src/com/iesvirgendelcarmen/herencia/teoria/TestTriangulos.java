package com.iesvirgendelcarmen.herencia.teoria;

public class TestTriangulos {

	public static void main(String[] args) {
		TrianguloEquilatero triangulo1 = new TrianguloEquilatero(3);
		System.out.println(triangulo1);
		System.out.printf("Area equilatero: %.2f, perimetro equilatero %.2f%n%n", triangulo1.calcularArea(), triangulo1.calcularPerimetro());
		TrianguloIsosceles triangulo2 = new TrianguloIsosceles(3, 2);
		System.out.println(triangulo2);
		System.out.printf("Area isosceles: %.2f, perimetro isosceles %.2f%n%n", triangulo2.calcularArea(), triangulo2.calcularPerimetro());
		TrianguloRectangulo triangulo3 = new TrianguloRectangulo(3, 3);
		System.out.println(triangulo3);
		System.out.printf("Area rectangulo: %.2f, perimetro isosceles %.2f%n%n", triangulo3.calcularArea(), triangulo3.calcularPerimetro());
	}

}
