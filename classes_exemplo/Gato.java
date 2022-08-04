package classes_exemplo;

public class Gato{
	
	String nome;
	String cor;
	private double tamanho;
	private char genero;
	
	public void setTamanho(double novoTamanho) {
		if(novoTamanho < 0) {
			System.err.println("NÃO É POSSIVEL ADICIONAR ESSE VALOR AO TAMANHO.");
		}else {
		tamanho = novoTamanho;
		}
	}public void setGenero(char novoGenero) {
		if(novoGenero == 'M' || novoGenero == 'F') {
			genero = novoGenero;
		}else {
			System.err.println("NÃO É POSSIVEL RECONHECER O GENERO DO GATO");
		}
	}
	
	public void miar() {
		System.out.println("Miau!");
	}
	public void pum() {
		System.out.println("-Pum");
	}
	public void mostrar() {
		System.out.println();
		System.out.println("Nome: " + nome + ", " + cor + ", " + tamanho + " centimetros, " + genero);
	}
	
}

