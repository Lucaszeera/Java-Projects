package aula_02;

import javax.swing.JOptionPane;

public class ex06 {
public static void main(String[] args) {
	double populacao = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da popula��o mundial"));
	double taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da popula��o"));
	for(int a = 5; a >= 1; a--) {
		populacao += (taxa / 100 * populacao); // vai atualizar a popula��o do ano atual
		System.out.println(populacao);
	}
	System.out.println("Em 5 anos a popula��o ser� estimada em: " + populacao);
}
}
