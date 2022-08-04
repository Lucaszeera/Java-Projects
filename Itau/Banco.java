package Itau;

public class Banco {
public static void main(String[] args) {
	
	ContaCorrente contaCorrente1 = new ContaCorrente(3123, "Maria Gorette");
	ContaCorrente contaCorrente2 = new ContaCorrente(5345, "Ari Junior", 0.03);
	ContaPoupanca contaPoupanca1 = new ContaPoupanca(1379, "Lukinhas", 0.5);
	contaCorrente1.depositar(100);
	System.out.println(contaCorrente1);
	System.out.println();
	contaCorrente2.depositar(20000);
	System.out.println(contaCorrente2);
	System.out.println();
	System.out.println(contaPoupanca1);
	System.out.println();
	contaCorrente2.transferir(1165, contaPoupanca1);
	System.out.println(contaPoupanca1);
	System.out.println();
	System.out.println(contaCorrente2);
	
	
	
}}
