package principalTeste;

import java.util.Scanner;

import entidadeConta.ContaPf;
import entidadeConta.ContaPjuridica;
import entidadeConta.ContaPoupan�a;

public class PrincipalTeste01 {

	public static void main(String[] args) {
		/*
		 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o
		 * n�mero da conta, o nome do titular da conta, e o valor de dep�sito inicial
		 * que o titular depositou ao abrir a conta. Este valor de dep�sito inicial,
		 * entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar
		 * no momento de abrir sua conta, o dep�sito inicial n�o ser� feito e o saldo
		 * inicial da conta ser�, naturalmente, zero. Importante: uma vez que uma conta
		 * banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� o nome
		 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o
		 * de casamento, por exemplo). Por fim, o saldo da conta n�o pode ser alterado
		 * livremente. � preciso haver um mecanismo para proteger isso. O saldo s�
		 * aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada
		 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
		 * com saldo negativo se o saldo n�o for suficiente para realizar o saque e/ou
		 * pagar a taxa. Voc� deve fazer um programa que realize o cadastro de uma
		 * conta, dando op��o para que seja ou n�o informado o valor de dep�sito
		 * inicial. Em seguida, realizar um dep�sito e depois um saque, sempre mostrando
		 * os dados da conta ap�s cada opera��o.
		 * 
		 */
		ContaPf conta;
		Scanner tcInt = new Scanner(System.in);
		Scanner tcStr = new Scanner(System.in);
		System.out.print("N�mero da conta:");
		int numero = tcInt.nextInt();

		System.out.print("Nome do titular:");
		String titular = tcStr.nextLine();
//
//		System.out.print("Deseja fazer um deposito inicial?[s/n]  ");
//		char resposta = tcStr.next().charAt(0);
//		if (resposta == 's') {
//			System.out.print("Digite um valor para deposito: ");
//			double depositoInicial = tcInt.nextDouble();
//
//			conta = new ContaPf(numero, titular, depositoInicial);
//			System.out.println(conta);
//		} else {
//			conta = new ContaPf(numero, titular);
//			System.out.println(conta);
//
//		}
//
//		System.out.print("Deseja depositar qual valor? R$ ");
//		double valor = tcInt.nextDouble();
//
//		conta.depositarConta(valor);
//		System.out.println(conta);
//
//		System.out.print("qual o valor do saque: R$ ");
//		valor = tcInt.nextDouble();
//		conta.saqueConta(valor);
//		System.out.println(conta);
//		
		// UPCASTING E DOWNCASTING:
		conta = new ContaPf(numero, titular, 0.0);
		System.out.println(conta);

		ContaPjuridica cnpj = new ContaPjuridica(numero, titular, 0.0, 500);
		System.out.println(cnpj);

		ContaPoupan�a poupan�a = new ContaPoupan�a(numero, titular, 0.0, 0.025);
		System.out.println(poupan�a);
		// Upcasting => recebendo dados de uma SUBclasse para um ou mais OBJETOS de uma
		// SUPERclasse;
		ContaPf conta1 = new ContaPjuridica(1003, "Carlos", 0.0, 200);// conta1 Objeto da SUPERclasse recebe dados da
																		// SUBclasse ContaPjuridica;
		System.out.println(conta1);

		ContaPf conta2 = new ContaPoupan�a(1004, "Nelio", 0.0, 0.025);// conta2 OBJETO da SUPERclasse recebe dados da

		ContaPf conta3 = cnpj; // OBJETO da SUPERclasse tamb�m recebe dados do OBJETO da SUBclasse;
		// SUBclasse ContaPoupan�a;
		System.out.println(conta2);

		// Downcasting => Recebendo dados de um OBJETO de uma SUPERclasse para um ou
		// mais OBJETOS de uma SUBclasse;
		ContaPjuridica conta4 = (ContaPjuridica) conta1; // OBJETO da SUBclasse conta2 recebe objeto da SUPERclasse
															// conta1;
		System.out.println(conta4);

		// ContaPoupan�a conta3 = (ContaPoupan�a) conta2; // note que ao fazer um
		// downcasting � preciso colocar entre
		// parenteses a Subclasse a ser instanciada;
		// System.out.println(conta3);
		// Pra saber qual a instancia atual do objeto da Superclasse usa se o
		// instanceof:
		if (conta2 instanceof ContaPjuridica) {
			((ContaPjuridica) conta2).credito(100);
			System.out.println("Credito Aprovado!");
		}
		if (conta2 instanceof ContaPoupan�a) {
			((ContaPoupan�a) conta2).atualizacaoSaldoJuros();
			System.out.println("Saldo Atualizado!");
			// nesse caso ele imprimira na tela o Saldo Atualizado! pois a insntancia atual
			// de conta2 � ContaPoupan�a;

			// SOBREPOSI��O:implementa um m�todo de uma Superclasse em uma SUBclasse e
			// altera o escopo, mantendo a assinatura do metodo;

			ContaPf conta5 = new ContaPf(105, "Alex", 1000);// criei uma conta pessoa fisica(objeto SUPERclasse)
			conta5.saqueConta(200);// Determinei o valor do saque e:
			System.out.println(conta5.getSaldo());// Como o saque na SUPERclasse desconta uma taxa de 5 reais, o saldo
			// da conta5 � o saldo menos 5;

			ContaPf conta6 = new ContaPoupan�a(106, "Maria", 1000, 0.25);// Instanciei um OBJETO de uma SUPERclasse e
																			// atribui os dados da SUBclasse
																			// ContaPoupan�a(UPCASTING);
			conta6.saqueConta(200);// O metodo saqueConta est� SOBREPOSTO com o escopo alterado para nao descontar
									// a taxa de 5 reais;
			System.out.println(conta6.getSaldo());// valor do saldo NAO vai ser descontado a taxa.

			ContaPf conta7 = new ContaPjuridica(107, "Pedro", 1000, 500);// Instanciei um OBJETO de uma SUPERclasse e
																			// Atribui os dados da SUBclasse
																			// ContaPjuridica(UPCASTING):
			conta7.saqueConta(200); // O metodo saque conta na SUBclasse ContaPjuridica est� SOBREPOSTO atrav�s do
									// SUPEr. que traz o metodo original da SUPERclasse e apos isso desconta mais
									// dois reais;
			System.out.println(conta7.getSaldo());

			// POLIMORFISMO: quando diferentes objetos de uma mesma classe apontam para
			// diferentes classes e como consequencia disso o resultado de cada objeto vai
			// proporcionar valores diferentes conforme cada tipo especifico herdado;

			ContaPf y = new ContaPjuridica(1003, "Tiago", 1000, 500);
			ContaPf x = new ContaPf(1150, "Maria", 1000);

			y.saqueConta(50); // observe que sao mesmos valores , porem com objetos diferentes da mesma classe
								// apontando pra classes diferentes , que irao entregar diferentes resultados
			x.saqueConta(50);
			 System.out.println(y.getSaldo());
			 System.out.println(x.getSaldo());
		}
	}
}
