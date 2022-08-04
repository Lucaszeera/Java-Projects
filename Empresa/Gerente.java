package Empresa;

public final class Gerente extends Funcionarios{
	private String area;
	private double bonus;
	
	public Gerente(int codigo, String nome) {
		super(codigo, nome);
	}
	public String toString() {	
        return "Codigo: " + getCodigo() + "\nNome: " + getNome() + "\nArea: " + getArea() + "\nSalario: R$" + calcularSalario() + "\n"; 
    }
	@Override
	public double calcularSalario() {
		return super.getSalario() + bonus;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
