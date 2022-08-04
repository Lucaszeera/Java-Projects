package Jogo;

public class Historia {

	public static void main(String[] args) {
		Jogador lucas = new Jogador("Lucas");
		lucas.setHp(3000);
		lucas.setXp(100);
		lucas.isEnvenenado();
		
		lucas.mostrar();
		
		Jogador cellbit = new Jogador("Cellbit");
		cellbit.setHp(1000);
		cellbit.setXp(10);
		cellbit.isEnvenenado();
		
		cellbit.mostrar();
		
		cellbit.receberDano(500);
		cellbit.receberDano(490);
		cellbit.mostrar();
		cellbit.receberDano(10);
}}
