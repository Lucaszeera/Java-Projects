package Itau;

public abstract class Conta extends Object{
	private int numero;
	private String nomeDoTitular;
	private double saldo;
	
	public Conta(int numero, String nomeDoTitular) {
		this.numero = numero;
		this.nomeDoTitular = nomeDoTitular;
	}	
	
	public String toString() {
		return "Nome: " + nomeDoTitular + "\nNumero: " + numero + "\nSaldo: R$" + saldo;
	}
	
	public void depositar(double valor) {
		if(valor > 0){
		saldo += valor;
		}else {
			System.err.println("Valor inválido.");
	}	}
	
	public void sacar(double valor) {
		saldo -= numero;
	}
	public void transferir(double valor, Conta contaRecebe) {
		this.saldo -= valor;
		contaRecebe.saldo += valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getNomeDoTitular() {
		return nomeDoTitular;
		
	}
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
		
	}
	public double getSaldo() {
		return saldo;
	}
}
