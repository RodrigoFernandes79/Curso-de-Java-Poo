package programaprincipal;

import java.util.Scanner;

import classefuncionario.Funcionario;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
projetada abaixo
*/
		Scanner tc =new Scanner(System.in);
		Funcionario fun�a = new Funcionario();
		
	//Vamos inserir objetos dentro das atribui��es:
		System.out.println("Digite o nome do Funcion�rio:");
		fun�a.nome=tc.nextLine();
		System.out.println("Digite o sal�rio bruto: ");
		fun�a.salarioBruto=tc.nextDouble();
		System.out.println("Digite o valor da taxa  a ser deduzida: ");
		fun�a.imposto=tc.nextDouble();
		System.out.println(fun�a);
		// inserir a porcentagem do aumento do salario:
		System.out.println("Digite a porcentagem de aumento salarial: ");
		double porcentagem=tc.nextDouble();
		//Atualizar o aumento salarial :
		fun�a.aumentoSalario(porcentagem);//ap�s receber o valor do parametro porcentagem eu vou jogar ele
		System.out.println();              //no aumento do salario
		System.out.println(fun�a);
		
	
		
		
		
		

	}

}
