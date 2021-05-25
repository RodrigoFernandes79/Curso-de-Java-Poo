package classeretangulo;

public class Retangulo {
	//INSERIR ATRIBUTOS � CLASSE RETANGULO:
	public double altura;
	public double largura;
	
	// VAMOS AOS METODOS:
	
	//Calculo da area do retangulo:
	public double area() {
		//area do retangulo � altura x largura;
		return altura *largura;
		
	}
	//Calculo do per�metro do retangulo:
	public double perimetro() {
		//Para calcular o per�metro do ret�ngulo soma se todas os lados:
		return ((2*altura)+(2*largura));
		
	}
	//Calculo da diagonal do retangulo:
	public double diagonal() {
		// diagonal do retangulo � o quadrado da hipotenusa � igual a soma dos quadrados dos catetos:
		return Math.sqrt(Math.pow(altura, 2)+Math.pow(largura,2));
				
	}
	
	
	
	

}
