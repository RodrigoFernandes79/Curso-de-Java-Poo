package classeprincipal;


import java.util.Scanner;

import ClasseConversorDeMoeda.ConversorDeMoeda;



public class Principal {

	public static void main(String[] args) {
		/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
*/
		
		Scanner tc = new Scanner(System.in);
		System.out.println("Quantos dólares você quer comprar?");
		double dolar=tc.nextDouble();
		System.out.println("Quanto está o cambio?");
		double cambio =tc.nextDouble();
		double preçoDolar =ConversorDeMoeda.conversorDolarSobreReal(dolar, cambio);
		System.out.printf("O preço do dólar é: %.2f",preçoDolar);
		
		

	}

}
