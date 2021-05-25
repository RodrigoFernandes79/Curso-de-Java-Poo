package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionarios;
import entidade.Terceirizados;

public class ClasseMain {

	public static void main(String[] args) {
		/*
		 * Uma empresa possui funcionários próprios e terceirizados. Para cada
		 * funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora.
		 * Funcionários terceirizado possuem ainda uma despesa adicional. O pagamento
		 * dos funcionários corresponde ao valor da hora multiplicado pelas horas
		 * trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus
		 * correspondente a 110% de sua despesa adicional. Fazer um programa para ler os
		 * dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma
		 * lista. Depois de ler todos os dados, mostrar nome e pagamento de cada
		 * funcionário na mesma ordem em que foram digitados. Construa o programa
		 * conforme projeto ao lado. Veja exemplo na próxima página.
		 */
		Scanner tcInt = new Scanner(System.in);
		Scanner tcStr = new Scanner(System.in);

		List<Funcionarios> list = new ArrayList<>();

		System.out.print("Digite a quantidade de funcionarios: ");
		int quantidade = tcInt.nextInt();
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("#Funcionário " + i);
			System.out.print("É Terceirizado?[s/n] ");

			char resposta = tcStr.next().charAt(0);
			System.out.print("Nome:");
			tcStr.nextLine();
			String nome = tcStr.nextLine();
			System.out.print("Horas Trabalhadas:");
			int horasTrabalhadas = tcInt.nextInt();
			System.out.print("Valor Por Hora:");
			double valorPorHora = tcInt.nextDouble();

			if (resposta == 's') {
				System.out.print("Despesa adicional: ");
				double despesaAdicional = tcInt.nextDouble();

				list.add(new Terceirizados(nome, horasTrabalhadas, valorPorHora, despesaAdicional));

			} else {

				list.add(new Funcionarios(nome, horasTrabalhadas, valorPorHora));
			}

		}
		System.out.println("PAGAMENTOS:");
		for (Funcionarios x : list) {
			System.out.println(x.getNome() + "- R$ " + x.pagamentoFuncionario());

		}
	}

}