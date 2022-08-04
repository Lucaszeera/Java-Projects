package aula_01;

import javax.swing.JOptionPane;

public class MOSTRANDOPRABUNDONA {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Qual sua idade? "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual seu peso?"));
		
		System.out.println(nome + idade + peso);
	}
}
