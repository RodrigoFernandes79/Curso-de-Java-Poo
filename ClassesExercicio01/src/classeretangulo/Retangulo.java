package classeretangulo;

public class Retangulo {
	//INSERIR ATRIBUTOS À CLASSE RETANGULO:
	public double altura;
	public double largura;
	
	// VAMOS AOS METODOS:
	
	//Calculo da area do retangulo:
	public double area() {
		//area do retangulo é altura x largura;
		return altura *largura;
		
	}
	//Calculo do perímetro do retangulo:
	public double perimetro() {
		//Para calcular o perímetro do retângulo soma se todas os lados:
		return ((2*altura)+(2*largura));
		
	}
	//Calculo da diagonal do retangulo:
	public double diagonal() {
		// diagonal do retangulo é o quadrado da hipotenusa é igual a soma dos quadrados dos catetos:
		return Math.sqrt(Math.pow(altura, 2)+Math.pow(largura,2));
				
	}
	
	
	
	

}
