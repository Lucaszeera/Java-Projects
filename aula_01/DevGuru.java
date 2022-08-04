package aula_01;

import java.util.Scanner;

public class DevGuru {
	public static void main(String[] args) {
		char opcao;
		String resposta = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("*********************************");
		System.out.println("*                               *");
		System.out.println("*           DEV GURU            *");
		System.out.println("*        Seu Assistente         *");
		System.out.println("*            Virtual            *");
		System.out.println("*                               *");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("O que deseja saber?");
		System.out.println();
		System.out.println("a - O que � um operador bin�rio?");
		System.out.println("b - Qual � o operador de resto?");
		System.out.println("c - O que significa a palavra default?");
		System.out.println("d - Como posso concatenar caracteres?");
		System.out.println("e - Eu ja sei tudo. (Sair)");
		do {
			String stringOpcao = scan.next();		
			opcao = stringOpcao.toLowerCase().charAt(0);
			switch (opcao) {
			case 'a':
				resposta = "Operador bin�rio � aquele que atua sobre dois operandos n�o necessariamente nos valores bin�rios.";
				break;
			case 'b':
				resposta = "O operador de resto � o %";
				break;
			case 'c':
				resposta = "default � a condi��o padr�o da classe Switch";
				break;
			case 'd':
				resposta = "Adicionando '+' entre dois objetos";
				break;
			case 'e':
				resposta = "Obrigado por acessar o Dev Guru!";
				break;
			default:
				resposta = "Op��o inv�lida.";
				break;
			}
			System.out.println(resposta);
		}while(opcao != 'e');
		scan.close();
		
		
		/*
		 * if (opcao.equals("a")) System.out.println(
		 * "Operador bin�rio � aquele que atua sobre dois operandos n�o necessariamente nos valores bin�rios."
		 * ); String resposta = "";
		 * if(opcao.equals("b"))System.out.println("O operador de resto � o %");
		 * if(opcao.equals("c"))System.out.
		 * println("default � a condi��o padr�o da classe Switch");
		 * if(opcao.equals("d"))System.out.println("Adicionando '+' entre dois objetos"
		 * );
		 * if(opcao.equals("e"))System.out.println("Obrigado por acessar o Dev Guru!");
		 * //else System.out.println("Op��o inv�lida, reinicie o programa.");
		 */	}

}
