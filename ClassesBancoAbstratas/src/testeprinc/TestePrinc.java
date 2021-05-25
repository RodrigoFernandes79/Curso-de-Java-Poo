package testeprinc;

import entidadeConta.ContaPf;
import entidadeConta.ContaPjuridica;
import entidadeConta.ContaPoupança;
import entidadeConta.TotalizadorSaldo;

public class TestePrinc {

	public static void main(String[] args) {

		TotalizadorSaldo total = new TotalizadorSaldo();
		ContaPf c1 = new ContaPjuridica(1005, "Marcelo", 1500, 500);// Como criei a classe CONTAP f e tornei ela
		total.TotalConta(c1);															// abstrata, instanciei outras classes no objeto
		total.setSaldoTotal(c1);															// ContaPf e vamos somar o total de saldos:

		ContaPf c2 = new ContaPoupança(1006, "Renato", 2000, 0.2);
		total.TotalConta(c2); // atribui o saldo de cada conta e vou mostrar o total:
		total.setSaldoTotal(c2);
		ContaPf c3 = new ContaPoupança(1007, "Paulo", 3200, 0.2);
		total.TotalConta(c3);
		total.setSaldoTotal(c3);
		ContaPf c4 = new ContaPjuridica(1008, "Rodrigo", 5000, 5500);
		total.TotalConta(c4);
		total.setSaldoTotal(c4);
		// mostrando o total:
		System.out.println("A Soma de todos os saldos das contas é: R$ "+total.getSaldoTotal());
		// Mostrando o saldo acrescentando 10 reais para cada saldo
		System.out.println("A Conta " + c1.getNumero()+ " possui R$ "+c1.getSaldo());
		System.out.println("A Conta " + c2.getNumero()+ " possui R$ "+c2.getSaldo());
		System.out.println("A Conta " + c3.getNumero()+ " possui R$ "+c3.getSaldo());
		System.out.println("A Conta " + c4.getNumero()+ " possui R$ "+c4.getSaldo());

	}

}
