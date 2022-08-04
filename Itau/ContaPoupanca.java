package Itau;

public class ContaPoupanca extends Conta{
	private double taxaDeRendimento;
	
	public ContaPoupanca(int numero, String nomeDoTitular) {
		super(numero, nomeDoTitular);
	}
	public ContaPoupanca(int numero, String nomeDoTitular, double taxaDeRendimento) {
		super(numero, nomeDoTitular);
		this.taxaDeRendimento = taxaDeRendimento;
	}

	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}
	
	
}
