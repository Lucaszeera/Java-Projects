package aula_01;

import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		int numero = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero")); // 3
			int fatorial = 1;
		for(int i= numero; i >= 1; i--)
			fatorial = fatorial * i;
			System.out.println(fatorial);
	}
}
