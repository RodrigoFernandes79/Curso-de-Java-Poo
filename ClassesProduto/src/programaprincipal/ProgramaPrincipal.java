package programaprincipal;

import java.util.Scanner;

import classeproduto.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um produto em estoque(nome, preço e quantidade no estoque.
		 * em seguida: 
		 * -Mostrar os dados do Produto(nome, preço , quantidade noestoque e o valor total);
		 * -Realizar uma entrada no estoque e mostrar novamente os dados do produto;
		 * -Realizar uma saida no estoque e mostrar novamente os dados do produto
		 * UML:
		 * NOME DA CLASSE: Produto
		 * ATRIBUTOS:nome(String);preco(double);quantidade(int)
		 * MÈTODOS: ValorTotalNoEstoque(double);adProdutoNoEstoque(int)void;retiraProdutoNoEstoque(int)void.
		 */
		
		Scanner tc = new Scanner(System.in);
		Produto produto = new Produto(); // importei a classe "PRODUTO" e nomeei a classe com o nome "produto"
		System.out.println("Insira os dados do produto:");
		System.out.println("Nome:");
		produto.nome = tc.nextLine(); //vou inserir objeto dentro de um atributo "nome" que esta na classe "produto"
		System.out.println("Preço:");
		produto.preço=tc.nextDouble();//vou inserir o objeto dentro de um atributo "preço" que esta na classe "produto"
		System.out.println("Quantidade no estoque:");
		produto.quantidade=tc.nextInt();//vou inserir o objeto dentro de um atributo "quantidade" que esta na classe "produto"
		
	/* Vamos mostrar na tela a leitura dos objetos atribuidos dentro desse atibutos que estao na classe 
	 * produto usando o método toString. É preciso usar esse metodo toString porque todos os objetos precisam
	 * ser transformado em strings:
	 */
		System.out.println("Dados do produto: "+produto);//insere os dados "produtos"
		System.out.print("Insira a quantidade do produto a ser adicionado ao estoque: " );
		int quantidade = tc.nextInt();//usuario vai digitar a quantidade a ser adicionada
		produto.addProdutoNoEstoque(quantidade);//o programa vai adicionar a quantidade no programa.
		//Agora vamos atualizar os dados e mostrar na tela:
		System.out.println("Dados atualizados do produto: "+produto);
		// Pra finalizar, iremos inserir a quantidade de saída do estoque:
		System.out.print("Insira a quantidade do produto de saída no estoque: ");
		quantidade = tc.nextInt();
		produto.RetiraProdutoNoEstoque(quantidade);
		System.out.println("Dados atualizados do produto: "+produto);
		
			

		

	}

}
