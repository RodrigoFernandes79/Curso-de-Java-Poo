package variaveiscompostas;

public class Triangulo {
	// para calcular area do triangulo em classes variaveis, é preciso declarar os atributos(dados/campos):
	
		public double a;
		public double b;
		public double c;
	 /*Depois é preciso importar esses atributos la no ProgramaSemClasses , onde esta o programa rodando de metodo 
	tradicional
	*/
// Agora criaremos o METODO	área para calcular a area do triangulo:
	public double area() {   //nomeei o metodo "area()" para calcular a area do triangulo
		double p=(a+b+c)/2; // p é perímetro
		double resultado= Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return resultado; // O método "area()" vai retornar a equaçao inserida no "resultado"
	}// agora jogamos o método la no programa principal para calcular a area de cada triangulo
	
}
 
 


