package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produtos;
import entidades.ProdutosImportados;
import entidades.ProdutosUsados;

public class TestMain {

	public static void main(String[] args) throws ParseException {
		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
		 * Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que
		 * foram digitados. Todo produto possui nome e preço. Produtos importados
		 * possuem uma taxa de alfândega, e produtos usados possuem data de fabricação.
		 * Estes dados específicos devem ser acrescentados na etiqueta de preço conforme
		 * exemplo (próxima página). Para produtos importados, a taxa e alfândega deve
		 * ser acrescentada ao preço final do produto. Favor implementar o programa
		 * conforme projeto ao lado.
		 */
		Scanner tcInt = new Scanner(System.in);
		Scanner tcStr = new Scanner(System.in);
		List<Produtos> list = new ArrayList<>();
		SimpleDateFormat fdd = new SimpleDateFormat("dd/mm/aaaa");

		System.out.print("Entre com a quantidade de produtos: ");
		int quantidade = tcInt.nextInt();
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("#Produto " + i);
			System.out.println("Comum, Importado ou Usado?(c/i/u) ");

			char produto = tcStr.next().charAt(0);

			System.out.print("Nome do produto: ");
			tcStr.nextLine();
			String nome = tcStr.nextLine();
			System.out.print("Preço: ");
			double preço = tcInt.nextDouble();
			if (produto == 'c') {
				list.add(new Produtos(nome, preço));
			}
			else if (produto == 'i') {
				System.out.println("Taxa de Alfandega: ");
				double taxaAlfandega = tcInt.nextDouble();
				list.add(new ProdutosImportados(nome, preço, taxaAlfandega));
			} else {
				System.out.println("Data de Fabricação:DD/MM/AA ");
				String dataDeFabricação = tcStr.nextLine();
				list.add(new ProdutosUsados(nome, preço, dataDeFabricação));
			}
			
		}System.out.println("ETIQUETAS DE PREÇO:  ");
		for (Produtos  x : list) {
			System.out.println(x.getNome()+" "+x+" ");
		}

	}
}

