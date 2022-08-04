package aula_02;

import javax.swing.JOptionPane;

public class ex03 {
public static void main(String[] args) {
	double raio = Double.valueOf(JOptionPane.showInputDialog("Digite o raio de um circulo"));
	double diametro = raio * 2;
	double circunferencia = 2 * 3.1415 * raio;
	double area = raio * 2 * 3.1415;
	System.out.println("O diametro desse circulo é: " + diametro);
	System.out.println("A circunferencia desse circulo é: " + circunferencia);
	System.out.println("A área desse circulo é: " + area);
}
}
