package com.iesvirgendelcarmen.herencia.teoria;

public class Triangulo extends Poligono {
	
	private TipoTriangulo tipoDeTriangulo;
	private float lado1;
	private float lado2;
	private float lado3;
	
	public Triangulo(  TipoTriangulo tipoDeTriangulo, float lado1,float lado2, float lado3)
	{
		super(3, (lado1 == lado2) && (lado2 == lado3), "Triangulo"); // constructor de la clase padre que es poligono
	 
		this.tipoDeTriangulo = tipoDeTriangulo;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public TipoTriangulo getTipoDeTriangulo() {
		return tipoDeTriangulo;
	}

	public float getLado1() {
		return lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public float getLado3() {
		return lado3;
	}
	
	public float calcularPerimetro() {
		return lado1+lado2+lado3; // tambien se pueden poner los geters de los lados
	}

	@Override
	public String toString() {
		return  super.toString() + "\nTriangulo: tipoDeTriangulo=" + tipoDeTriangulo + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3="
				+ lado3;
	}
		
}
