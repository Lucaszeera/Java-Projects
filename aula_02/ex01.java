package aula_02;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
		int num1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
		int num2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro numero"));
	
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
	}

}
