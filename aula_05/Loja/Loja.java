package aula_05;

public class Loja {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setDescricao("Panela");
		produto.setPreco(120);
		
		Livro livro = new Livro();
		livro.setDescricao("Livro de Java");
		livro.setAutor("Joao");
		livro.setPreco(30);
		
		Smartphone smartphone = new Smartphone();
		smartphone.setDescricao("Celular");
		smartphone.setMarca("Xiaomi");
		smartphone.setModelo("MI 9");
		smartphone.setPreco(2500);
		System.out.println(smartphone);
}}
