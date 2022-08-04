package Empresa;

public final class Engenheiro extends Funcionarios{
	private String departamento;
	private int crea;
	
	public Engenheiro(int codigo, String nome, int CREA) {
		super(codigo, nome);
		this.crea = CREA;
	}
    public String toString() {	
        return "Codigo: " + getCodigo() + "\nNome: " + getNome() + "\nDepartamento: " + getDepartamento() + "\nCREA: " + getCrea() + "\nSalario: R$" +  calcularSalario() + "\n";
    }
    @Override
    public double calcularSalario() {
    	return super.getSalario() + (super.getSalario() * 0.5);
    }
    
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getCrea() {
		return crea;
	}
}
