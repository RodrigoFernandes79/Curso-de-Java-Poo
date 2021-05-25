package testmain;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupan�a;
import entidades.Movimenta�aoConta;

public class MainTest {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		Conta c1 = new Conta("Rodrigo",1001,3000);
		System.out.println(c1);
		c1.sacar(500);
		System.out.println( "Saldo atual: R$ "+c1.getSaldo());
		c1.depositar(300);
		c1.getSaldo();
		System.out.println(c1);
		System.out.println();
		System.out.println("%%%$$$$&&&&&&$$$$$$$$");
		ContaPoupan�a c2 = new ContaPoupan�a("Mike", 1002, 5000, 0.1);
		System.out.println(c2);
		c2.sacar(500);
		System.out.println( "Saldo atual: R$ "+c2.getSaldo());
		c2.depositar(3000);
		c2.getSaldo();
		
	
		System.out.println(c2);
		System.out.println();
		System.out.println();
		System.out.println("%%%$$$$&&&&&&$$$$$$$$");
		ContaEspecial c3  = new ContaEspecial("Adarberto", 1003, 50000, 1500);
		System.out.println(c3);
		c3.sacar(1000);
		System.out.println( "Saldo atual: R$ "+c3.getSaldo());
		c3.depositar(3000);
		c3.getSaldo();
		System.out.println(c3);
		
		Movimenta�aoConta mov = new Movimenta�aoConta();
		mov.TotalConta(c1);
		mov.TotalConta(c2);
		mov.TotalConta(c3);
		
		System.out.println("A soma total do saldo de todas as contas � de R$: "+mov.getSomaConta());
		
		
		
		

	}

}
