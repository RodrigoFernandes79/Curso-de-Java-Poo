package MainTeste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidadecontribuinte.Contribuinte;

import entidadecontribuinte.Pf;
import entidadecontribuinte.Pj;

public class MainTeste {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo
		 * usu�rio), os quais podem ser pessoa f�sica ou pessoa jur�dica, e depois
		 * mostrar o valor do imposto pago por cada um, bem como o total de imposto
		 * arrecadado. Os dados de pessoa f�sica s�o: nome, renda anual e gastos com
		 * sa�de. Os dados de pessoa jur�dica s�o nome, renda anual e n�mero de
		 * funcion�rios. As regras para c�lculo de imposto s�o as seguintes: Pessoa
		 * f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto.
		 * Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa
		 * teve gastos com sa�de, 50% destes gastos s�o abatidos no imposto. Exemplo:
		 * uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o
		 * imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00 Pessoa jur�dica:
		 * pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de
		 * 10 funcion�rios, ela paga 14% de imposto. Exemplo: uma empresa cuja renda foi
		 * 400000.00 e possui 25 funcion�rios, o imposto fica: 400000 * 14% = 56000.00
		 * 
		 */
		Scanner tc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Digite a quantidade de contribuintes:");
		int quantidade = tc.nextInt();
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("# Dados do Contribuinte " + i);

			System.out.println("Pessoa F�sica ou Pessoa Juridica?[f/j]");
			tc.nextLine();
			char tipo = tc.next().charAt(0);
			tc.nextLine();
			System.out.print("Nome: ");
			String nome = tc.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = tc.nextDouble();

			if (tipo == 'f') {
				System.out.print("Despesas com sa�de: ");
				double gastosComSaude = tc.nextDouble();
				list.add(new Pf(nome, rendaAnual, gastosComSaude));
			} else if (tipo == 'j') {
				System.out.println("N�mero de f�ncionarios: ");
				int funcionarios = tc.nextInt();
				list.add(new Pj(nome, rendaAnual, funcionarios));
			}

		}
		double valor = 0;
		for (Contribuinte x : list) {
			valor += x.calcImpostoTotal();
			System.out.println("O Contribuinte " + x.getNome() + " pagar� R$ " + String.format("%.2f", x.calcImpostoTotal()));
			
			System.out.println("O Valor Total arrecadado foi de R$ " + valor);
			
		}

	}

}
