package classeprincipal;


import java.util.Scanner;

import ClasseConversorDeMoeda.ConversorDeMoeda;



public class Principal {

	public static void main(String[] args) {
		/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
para ser respons�vel pelos c�lculos.
*/
		
		Scanner tc = new Scanner(System.in);
		System.out.println("Quantos d�lares voc� quer comprar?");
		double dolar=tc.nextDouble();
		System.out.println("Quanto est� o cambio?");
		double cambio =tc.nextDouble();
		double pre�oDolar =ConversorDeMoeda.conversorDolarSobreReal(dolar, cambio);
		System.out.printf("O pre�o do d�lar �: %.2f",pre�oDolar);
		
		

	}

}
