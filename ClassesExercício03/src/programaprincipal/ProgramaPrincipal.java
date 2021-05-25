package programaprincipal;

import java.util.Scanner;

import classeestudante.Estudante;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
		 */
		Scanner tc = new Scanner(System.in);
		
		Estudante aluno = new Estudante();
		System.out.println("Nome do aluno:");
		aluno.nome =tc.nextLine();
		System.out.println("Nota primeiro trimestre: ");
		aluno.nota1=tc.nextDouble();
		System.out.println("Nota segundo trimestre:");
		aluno.nota2=tc.nextDouble();
		System.out.println("Nota terceiro trimestre:");
		aluno.nota3=tc.nextDouble();
		//Mostrar o nome do aluno:
		System.out.println(aluno.nome);
		//Mostrar a nota final do aluno:
		System.out.println();
		aluno.notaFinal();
		System.out.printf("A nota final do Aluno é: %.2f\n",aluno.notaFinal());
		
		if(aluno.notaFinal()>=60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("Faltaram %.2f pontos para ser aprovado",aluno.faltaPontos());
		}
		
		
		tc.close();
		
		
		

	}

}
