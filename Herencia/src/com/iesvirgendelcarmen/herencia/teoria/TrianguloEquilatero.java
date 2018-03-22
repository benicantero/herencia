package com.iesvirgendelcarmen.herencia.teoria;

public final class TrianguloEquilatero extends Triangulo { // se puede declarar final porque no hay ninguna clase que vaya a heredar de ella

	private float lado;

	public TrianguloEquilatero(float lado) {
		super(TipoTriangulo.EQUILATERO, lado, lado, lado);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}
	
	public float calcularArea() {
		return (float)(Math.pow(lado, 2)*(Math.sqrt(3) / 4));
	}
	
}
