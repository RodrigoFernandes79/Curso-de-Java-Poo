package principal;

import java.util.Scanner;

import classetrianguloestatico.TrianguloEstatico;

public class Principal01 {

	public static void main(String[] args) {
		/* Receba os tres lados de um triangulo e mostre a area , usando membros estaticos:
		 */
		Scanner tc= new Scanner(System.in);
		System.out.println("Digite os 3 lados do primeiro triangulo");
		double a = tc.nextDouble();
		double b =tc.nextDouble();
		double c=tc.nextDouble();
		double areax= TrianguloEstatico.area(a,b,c);
		System.out.printf("A �rea do primeiro triangulo �: %.2f\n",areax);
		
		
		
		
		
		
		
	}

}
