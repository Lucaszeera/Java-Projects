package Empresa;

public abstract class Funcionarios{
	private int codigo;
	private String nome;
	private double salario;
	
	public Funcionarios(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	@Override
    public String toString() {	
        return "Nome: " + getNome() + "Codigo: " + getCodigo();
    }
	public abstract double calcularSalario();
	
	public String mostrar() {
		return "Codigo: " +  codigo + " " + "Nome: " + nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
