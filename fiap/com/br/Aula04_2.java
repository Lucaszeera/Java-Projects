package fiap.com.br;

import javax.swing.JOptionPane;

public class Aula04_2 {
	public static void main(String[] args) {
		String stringCategoria = JOptionPane.showInputDialog("Digite a categoria");
		char categoria = stringCategoria.charAt(0);
		String resposta = "Categoria inválida";
		
//		if(categoria == 'A' || categoria == 'a') resposta = "moto";
//		if(categoria == 'B' || categoria == 'b') resposta = "carro";
//		if(categoria == 'C' || categoria == 'c') resposta = "onibus";
//		if(categoria == 'D' || categoria == 'd') resposta = "caminhão";
//		if(categoria == 'E' || categoria == 'e') resposta = "tudo";
		System.out.println(resposta);
		switch(categoria){
		
		}
	}
}
