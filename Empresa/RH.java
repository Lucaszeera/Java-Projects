package Empresa;

public class RH extends Object {

	public static void main(String[] args) {

		Engenheiro engenheiro1 = new Engenheiro(312, "Lucas", 1234);
		engenheiro1.setDepartamento("Planejamento estratégico");
		engenheiro1.setSalario(2000);
		System.out.println(engenheiro1);

		Gerente gerente1 = new Gerente(285, "Joao Carlos");
		gerente1.setArea("Vendas");
		gerente1.setBonus(1250);
		gerente1.setSalario(3000);
		System.out.println(gerente1);

		Presidente presidente1 = new Presidente(648, "Jesuis");
		presidente1.setSalario(8000);
		presidente1.setAcoes(25000);
		presidente1.setValorCota(350);
		System.out.println(presidente1);
	}
}
