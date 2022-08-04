package Jogo;

public class Jogador {
	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	public Jogador(String novoNome) {
		nome = novoNome;
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public void setHp(int novoHp) {
		if(novoHp > 0)hp = novoHp;
		else System.err.println("O jogador: " + nome + "Está morto.");
	}
	public void setXp(int novoXp) {
		if(novoXp > 0) xp = novoXp;
		else System.err.println("A experiencia do jogador nao pode ser menor do que 0");
	}
	
	public String getNome() {
		return nome;
}
	public int getHp() {
		return hp;
}
	public int getXp() {
		return xp;
}
	
	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public void mostrar() {
		System.out.println(nome + ", hp: " + hp + ", level: " + xp + ", envenenado: " + envenenado);
}
	
	public void receberDano(int pontos) {
		if(hp - pontos > 0) {
			hp = hp - pontos;
			System.out.println(nome + " Recebeu " + pontos + " de dano e ficou com " + hp + " pontos de hp");
		}
		else if(hp - pontos <= 0) {
			hp = hp - hp;
			System.out.println(nome + " Recebeu " + pontos + " de dano e ficou com " + hp + " pontos de hp");
			System.out.println("- O jogador " + nome + " morreu.");
		}
		
}
	public void beberPocao(int pontos) {
		hp = hp + pontos;
		System.out.println(nome + " Bebeu uma pocao de " + pontos + " de hp");
}
	public void ganharXp(int pontos) {
		xp = xp + pontos;
		System.out.println(nome + " Ganhou " + pontos + " pontos de experiência");
}
	public void receberAntidoto() {
		if(envenenado == true) envenenado = false;
		
		else envenenado = true;
			System.out.println("O jogador " + nome + " bebeu um antidoto, está envenenado? " + envenenado);
		}
	}

