package TestePrincipal;

import java.util.Scanner;

import entidade.Conta;
import entidade.Data;

public class TestePrincipal {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		Conta c1=new Conta();
		c1.agencia= "0289-2";
		c1.numero=247546;
		c1.saldo=1000;
		c1.titular="Rodrigo";
		c1.dataAbertura.dia=15;
		c1.dataAbertura.mes=05;
		c1.dataAbertura.ano=2021;
		System.out.println(c1.recuperaDadosParaImpressao());
		Conta c2=new Conta();
		c2.saldo=1000;
		c2.titular="Hugo";
		//c1=c2;//objeto c1 recebe referencias do objeto c2
		/*if(c1==c2) {
			System.out.println("Contas iguais");
		}else {
			System.out.println("Contas diferentes");
		}
		*/
		System.out.println("Digite o valor para saque:");
		double saque=tc.nextDouble();
		c1.sacar(saque);
		System.out.println("Digite o valor para deposito:");
		double deposito=tc.nextDouble();
		c1.depositar(deposito);
		c1.calculaRendimento();
		System.out.println(c1.recuperaDadosParaImpressao());
		
		
		

	}

}
