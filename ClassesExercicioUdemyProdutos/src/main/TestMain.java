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
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio).
		 * Ao final, mostrar a etiqueta de pre�o de cada produto na mesma ordem em que
		 * foram digitados. Todo produto possui nome e pre�o. Produtos importados
		 * possuem uma taxa de alf�ndega, e produtos usados possuem data de fabrica��o.
		 * Estes dados espec�ficos devem ser acrescentados na etiqueta de pre�o conforme
		 * exemplo (pr�xima p�gina). Para produtos importados, a taxa e alf�ndega deve
		 * ser acrescentada ao pre�o final do produto. Favor implementar o programa
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
			System.out.print("Pre�o: ");
			double pre�o = tcInt.nextDouble();
			if (produto == 'c') {
				list.add(new Produtos(nome, pre�o));
			}
			else if (produto == 'i') {
				System.out.println("Taxa de Alfandega: ");
				double taxaAlfandega = tcInt.nextDouble();
				list.add(new ProdutosImportados(nome, pre�o, taxaAlfandega));
			} else {
				System.out.println("Data de Fabrica��o:DD/MM/AA ");
				String dataDeFabrica��o = tcStr.nextLine();
				list.add(new ProdutosUsados(nome, pre�o, dataDeFabrica��o));
			}
			
		}System.out.println("ETIQUETAS DE PRE�O:  ");
		for (Produtos  x : list) {
			System.out.println(x.getNome()+" "+x+" ");
		}

	}
}

