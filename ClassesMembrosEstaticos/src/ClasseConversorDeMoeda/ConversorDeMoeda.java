package ClasseConversorDeMoeda;
/*Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
para ser respons�vel pelos c�lculos.
 */

public class ConversorDeMoeda {
 
public static  final  double IOF = 0.06;
	
public static double  conversorDolarSobreReal(double dolar,double cambio){
	
	 return cambio*dolar -(cambio * dolar*IOF);
	 
	 
	
}

}
	







