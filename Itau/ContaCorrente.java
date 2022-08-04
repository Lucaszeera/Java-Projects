package Itau;

public class ContaCorrente extends Conta{
	private double taxaDeRendimento;
	
	public ContaCorrente(int numero, String nomeDoTitular) {
		super(numero, nomeDoTitular);
	}
	
	public ContaCorrente(int numero, String nomeDoTitular, double taxaDeRendimento) {
		super(numero, nomeDoTitular);
		this.setTaxaDeRendimento(taxaDeRendimento);
}
	
	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}
	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}}
