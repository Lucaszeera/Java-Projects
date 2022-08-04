package aula_01;

import javax.swing.JOptionPane;

public class ex04 {
	public static void main(String[] args) {
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = " + i * numero);
		}
	}
}
