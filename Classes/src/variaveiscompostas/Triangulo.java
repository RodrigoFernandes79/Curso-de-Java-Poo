package variaveiscompostas;

public class Triangulo {
	// para calcular area do triangulo em classes variaveis, � preciso declarar os atributos(dados/campos):
	
		public double a;
		public double b;
		public double c;
	 /*Depois � preciso importar esses atributos la no ProgramaSemClasses , onde esta o programa rodando de metodo 
	tradicional
	*/
// Agora criaremos o METODO	�rea para calcular a area do triangulo:
	public double area() {   //nomeei o metodo "area()" para calcular a area do triangulo
		double p=(a+b+c)/2; // p � per�metro
		double resultado= Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return resultado; // O m�todo "area()" vai retornar a equa�ao inserida no "resultado"
	}// agora jogamos o m�todo la no programa principal para calcular a area de cada triangulo
	
}
 
 


