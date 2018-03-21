package com.iesvirgendelcarmen.herencia.teoria;

public class TrianguloIsosceles extends Triangulo {
	private float lado1y2;
	private float ladoDiferente;
	public TrianguloIsosceles(float lado1y2, float ladoDiferente) {
		super(TipoTriangulo.ISOSCELES, lado1y2, lado1y2, ladoDiferente);
		this.lado1y2 = lado1y2;
		this.ladoDiferente = ladoDiferente;
	}
	public float getLado1() {
		return lado1y2;
	}
	public float getLadoDiferente() {
		return ladoDiferente;
	}
	
	public float calcularArea() {
		return (float) ((ladoDiferente*(Math.sqrt(((lado1y2*lado1y2)-((ladoDiferente*ladoDiferente)/4)))))/2);
	}
	
	
	
	

}
