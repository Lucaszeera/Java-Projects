package aula_02;

import javax.swing.JOptionPane;

public class ex08 {
public static void main(String[] args) {
	double salario = 2000;
	double vendas = Double.valueOf(JOptionPane.showInputDialog("Digite o total de vendas de um funcion�rio."));
	double comissao = 0.08 * vendas;
	System.out.println("O total de vendas do funcionario foi: R$" + vendas);
	System.out.println("O valor padr�o do sal�rio dele �: R$" + salario);
	System.out.println("Com a comiss�o de vendas, ele receber�: R$" + (salario + comissao));
	
	
}
}
