package aula_02;

import javax.swing.JOptionPane;

public class ex02 {

public static void main(String[] args) {
	int num1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
	int num2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro numero"));
	boolean multiplo = num1 % num2 == 0 || num2 % num1 == 0;
	if(multiplo) {
		System.out.println("Os dois numeros são multiplos");
	}else {
		System.out.println("Os dois numeros não são multiplos");
	}

	}

}
