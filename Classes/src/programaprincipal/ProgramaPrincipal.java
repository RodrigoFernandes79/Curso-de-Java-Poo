package programaprincipal;

import java.util.Scanner;

import variaveiscompostas.Triangulo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		/*PROBLEMA EXEMPLO:
		 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
		 */
		Scanner tc = new Scanner(System.in);
		//importo os atributos da classe ClasseTriangulo.java:
		Triangulo x,y;
		//Para que eu possa receber os objetos é preciso criá los:
		x = new Triangulo();
		y = new Triangulo();
		
		
		System.out.println("Digite as medidas do triângulo x:");
		x.a = tc.nextDouble();
		x.b = tc.nextDouble();
		x.c = tc.nextDouble();
		System.out.println("Digite as medidas do triângulo y:");
		y.a=tc.nextDouble();
		y.b = tc.nextDouble();
		y.c= tc.nextDouble();
		
		/*calcular a area de cada triangulo com a formula de Heron: area é raiz quadrada de p(p-a)(p-b)(p-c),onde
		 * p=a+b+c/2; foi criado um MÈTODO lá na classe Triangulo para a realização desse calculo da area e vamos 
		 * inserir esse metodo "area()" aqui no programa principal . veja a seguir:
		 */
		double areax = x.area();  //criei duas variaveis "areax e areay" e nelas inseri o método "area"5,2
		
		double areay = y.area();
		
		if(areax>areay) {
			System.out.println("Área x é maior");
		}else {
			System.out.println("Área y é maior");
			
	
		
	}tc.close();
	}
}





	


