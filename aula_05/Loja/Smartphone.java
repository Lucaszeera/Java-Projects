package aula_05.Loja;

public class Smartphone extends Produto {

	private String marca;
	private String modelo;
	
	public String toString() {
		return getDescricao() + " " + getPreco() + " " + this.modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
