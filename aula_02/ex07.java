package aula_02;

import javax.swing.JOptionPane;

public class ex07 {
public static void main(String[] args) {
	int qtde = Integer.valueOf(JOptionPane.showInputDialog("Quantas vezes voc� abasteceu o carro?"));
	double litros = 0;
	double km = 0;
	System.out.println("Voc� abasteceu o carro " + qtde + " vezes.");
		for(int a = qtde; a >=1; a--) {
			km += Double.valueOf(JOptionPane.showInputDialog("Digite a dist�ncia em quil�metros rodada:"));
			litros += Double.valueOf(JOptionPane.showInputDialog("Digite a quantidade de litros abastecida"));
		}
		double media = km / litros;
		System.out.println("Calculando a media de km rodados por litro");			
		System.out.println("Seu carro faz " + media + " quilometros por litro");
}
}
