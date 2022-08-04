package aula_02;

import javax.swing.JOptionPane;

public class ex06 {
public static void main(String[] args) {
	double populacao = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da população mundial"));
	double taxa = Integer.valueOf(JOptionPane.showInputDialog("Digite a taxa de crescimento anual da população"));
	for(int a = 5; a >= 1; a--) {
		populacao += (taxa / 100 * populacao); // vai atualizar a população do ano atual
		System.out.println(populacao);
	}
	System.out.println("Em 5 anos a população será estimada em: " + populacao);
}
}
