package ClasseConversorDeMoeda;
/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
 */

public class ConversorDeMoeda {
 
public static  final  double IOF = 0.06;
	
public static double  conversorDolarSobreReal(double dolar,double cambio){
	
	 return cambio*dolar -(cambio * dolar*IOF);
	 
	 
	
}

}
	







