package Exceptions;

public class Bhaskara {

	public static void main(String[] args) {
		Bhaskara bhaskara = new Bhaskara();
		bhaskara.init();
	}
	private double raizDeDelta;
	private double b;
	private double x2;
	private double x1;
	private double bAoQuadrado;
	private double delta;
	private double a;
	private double c;

	private void init() {
		calcularDelta();

		x1 = (-b + raizDeDelta) / (2 * a);
		x2 = (-b - raizDeDelta) / (2 * a);
		mostrarResultado();
	}

	private void calcularDelta() {
		bAoQuadrado = calcularQuadradoDeB();
		delta = bAoQuadrado - (4 * a * c);
		raizDeDelta = Math.sqrt(delta);
	}

	private double calcularQuadradoDeB() {
		return Math.pow(b, 2);
	}

	private void mostrarResultado() {
		System.out.println(x1);
		System.out.println(x2);
	}
}