package principalteste;

import java.util.Scanner;

import entidade.ClassePessoa;

public class PrincipalTeste {

	public static void main(String[] args) {
		/*Crie uma pessoa, coloque seu nome e idade iniciais, fa�a alguns anivers�rios (aumentando a idade)
		e imprima seu nome e sua idade.
		*/
		ClassePessoa pessoa=new ClassePessoa();
		Scanner tc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		pessoa.nome=tc.nextLine();
		System.out.println("Seu nome �: "+pessoa.nome);
		System.out.println();
		System.out.println("Digite sua idade:");
		pessoa.idade=tc.nextInt();
		System.out.println("Voc� tem "+pessoa.idade+ " anos.");
		pessoa.aniversario();
		
		

	}

}
