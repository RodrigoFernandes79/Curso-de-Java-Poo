package principal;

import java.util.Scanner;

import entidade.Conta;

public class Principal {
	
	public static void main(String[] args) {
	Conta c1 = new Conta();
	Scanner tc =new Scanner(System.in);
	System.out.println("Digite o numero: ");
	
	c1.numero =tc.nextInt();
	c1.dono ="Rodrigo";
	c1.saldo=50;
	c1.limite=200;
	System.out.println(c1);
	
	}

}
