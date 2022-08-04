package Empresa;

public final class Presidente extends Funcionarios{
	private double valorCota;
	private double acoes;
	
	public Presidente(int codigo, String nome) {
		super(codigo, nome);
	}
	public String toString() {	
        return "Codigo: " + getCodigo() + "\nNome: " + getNome() + "\nInvestimento em ações: R$" + getAcoes() + "\nValor da cota de ações: R$" + getValorCota() + "\nSalario: R$" + calcularSalario() + "\n";
	}
	@Override
	public double calcularSalario() {
		return super.getSalario() + valorCota;
	}
	
	public double getValorCota() {
		return valorCota;
	}
	public void setValorCota(double valorCota) {
		this.valorCota = valorCota;
	}
	public double getAcoes() {
		return acoes;
	}
	public void setAcoes(double acoes) {
		this.acoes = acoes;
	}
}
