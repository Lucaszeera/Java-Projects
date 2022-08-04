package aula_02;

import javax.swing.JOptionPane;

public class ex04 {
	public static void main(String[] args) {
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		int unidade = numero % 10;
		int dezena = numero / 10 % 10;
		int centena = numero / 100 % 10;
		int milhar = numero / 1000 % 10;
		int dezmilhar = numero / 10000 % 10;
		System.out.println("Unidade: " + unidade);
		System.out.println("Dezena = " + dezena);
		System.out.println("Centena = " + centena);
		System.out.println("Milhar = " + milhar);
		System.out.println("Dezena de milhar = " + dezmilhar);
	}
}
