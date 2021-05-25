package programaprincipal;

import java.util.Scanner;

import classefuncionario.Funcionario;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo
*/
		Scanner tc =new Scanner(System.in);
		Funcionario funça = new Funcionario();
		
	//Vamos inserir objetos dentro das atribuições:
		System.out.println("Digite o nome do Funcionário:");
		funça.nome=tc.nextLine();
		System.out.println("Digite o salário bruto: ");
		funça.salarioBruto=tc.nextDouble();
		System.out.println("Digite o valor da taxa  a ser deduzida: ");
		funça.imposto=tc.nextDouble();
		System.out.println(funça);
		// inserir a porcentagem do aumento do salario:
		System.out.println("Digite a porcentagem de aumento salarial: ");
		double porcentagem=tc.nextDouble();
		//Atualizar o aumento salarial :
		funça.aumentoSalario(porcentagem);//após receber o valor do parametro porcentagem eu vou jogar ele
		System.out.println();              //no aumento do salario
		System.out.println(funça);
		
	
		
		
		
		

	}

}
