package programaprincipal;

import java.util.Scanner;

import variaveiscompostas.Triangulo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		/*PROBLEMA EXEMPLO:
		 * Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas
v�lidas). Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos
possui a maior �rea.
A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a
seguinte (f�rmula de Heron):
		 */
		Scanner tc = new Scanner(System.in);
		//importo os atributos da classe ClasseTriangulo.java:
		Triangulo x,y;
		//Para que eu possa receber os objetos � preciso cri� los:
		x = new Triangulo();
		y = new Triangulo();
		
		
		System.out.println("Digite as medidas do tri�ngulo x:");
		x.a = tc.nextDouble();
		x.b = tc.nextDouble();
		x.c = tc.nextDouble();
		System.out.println("Digite as medidas do tri�ngulo y:");
		y.a=tc.nextDouble();
		y.b = tc.nextDouble();
		y.c= tc.nextDouble();
		
		/*calcular a area de cada triangulo com a formula de Heron: area � raiz quadrada de p(p-a)(p-b)(p-c),onde
		 * p=a+b+c/2; foi criado um M�TODO l� na classe Triangulo para a realiza��o desse calculo da area e vamos 
		 * inserir esse metodo "area()" aqui no programa principal . veja a seguir:
		 */
		double areax = x.area();  //criei duas variaveis "areax e areay" e nelas inseri o m�todo "area"5,2
		
		double areay = y.area();
		
		if(areax>areay) {
			System.out.println("�rea x � maior");
		}else {
			System.out.println("�rea y � maior");
			
	
		
	}tc.close();
	}
}





	


