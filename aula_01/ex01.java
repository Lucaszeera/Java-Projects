package aula_01;

import javax.swing.JOptionPane;

public class ex01 {

public static void main(String[] args) {

	int u = 0;
	while(u < 500) {
		int n = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		int total = u + n;
		System.out.println("a soma foi: " + u + " + " + n + " = " + total);
		u += n;
		}		
	}
}
