package programaprincipal;

import java.util.Scanner;

import classeretangulo.Retangulo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura
de dois ret�ngulos. Em seguida, mostrar na tela o valor de
sua �rea, per�metro e diagonal. Usar uma classe como
mostrado no projeto ao lado.
 */
		Scanner tc = new Scanner(System.in);
		Retangulo x = new Retangulo(); // criei uma classe para cada retangulo e vou receber
		Retangulo y = new Retangulo();// objetos atraves de "Retangulo()"
		// vou receber os objetos "altura e largura" do primeiro retangulo:
		System.out.print("Digite a altura do primeiro retangulo:");
		x.altura = tc.nextDouble();//"x" nome da classe do primeiro retangulo
		System.out.print("Digite a largura do primeiro retangulo: ");
		x.largura=tc.nextDouble();//"nome da classe"."nome da variavel" 
		System.out.println();
		//Agora vou receber os objetos "altura e largura" do segundo retangulo:
		System.out.print("Digite a altura do segundo retangulo: ");
		y.altura=tc.nextDouble();
		System.out.print("Digite a largura do segundo retangulo: ");
		y.largura=tc.nextDouble();
		System.out.println();
		System.out.println();
		//mostre na tela a area de cada retangulo:
		System.out.printf("A �rea do primeiro retangulo �: %.2f \n",x.area());
		System.out.printf("A �rea do segundo retangulo �: %.2f\n ",y.area());
		// mostre na tela o per�metro de cada retangulo:
		System.out.println();
		System.out.printf("O per�metro do primeiro retangulo �: %.2f\n ", x.perimetro());
		System.out.printf("O per�metro do segundo retangulo �: %.2f\n ",y.perimetro());
		//mostre na tela a diagonal de cada retangulo:
		System.out.println();
		System.out.printf("A diagonal do primeiro retangulo �: %.2f\n ",x.diagonal());
		System.out.printf("A diagonal do segundo retangulo �: %.2f\n ",y.diagonal());
		

		

	}

}
