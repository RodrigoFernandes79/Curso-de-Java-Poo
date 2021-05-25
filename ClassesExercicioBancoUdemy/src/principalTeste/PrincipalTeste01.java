package principalTeste;

import java.util.Scanner;

import entidadeConta.ContaPf;
import entidadeConta.ContaPjuridica;
import entidadeConta.ContaPoupança;

public class PrincipalTeste01 {

	public static void main(String[] args) {
		/*
		 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o
		 * número da conta, o nome do titular da conta, e o valor de depósito inicial
		 * que o titular depositou ao abrir a conta. Este valor de depósito inicial,
		 * entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar
		 * no momento de abrir sua conta, o depósito inicial não será feito e o saldo
		 * inicial da conta será, naturalmente, zero. Importante: uma vez que uma conta
		 * bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome
		 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião
		 * de casamento, por exemplo). Por fim, o saldo da conta não pode ser alterado
		 * livremente. É preciso haver um mecanismo para proteger isso. O saldo só
		 * aumenta por meio de depósitos, e só diminui por meio de saques. Para cada
		 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
		 * com saldo negativo se o saldo não for suficiente para realizar o saque e/ou
		 * pagar a taxa. Você deve fazer um programa que realize o cadastro de uma
		 * conta, dando opção para que seja ou não informado o valor de depósito
		 * inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando
		 * os dados da conta após cada operação.
		 * 
		 */
		ContaPf conta;
		Scanner tcInt = new Scanner(System.in);
		Scanner tcStr = new Scanner(System.in);
		System.out.print("Número da conta:");
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

		ContaPoupança poupança = new ContaPoupança(numero, titular, 0.0, 0.025);
		System.out.println(poupança);
		// Upcasting => recebendo dados de uma SUBclasse para um ou mais OBJETOS de uma
		// SUPERclasse;
		ContaPf conta1 = new ContaPjuridica(1003, "Carlos", 0.0, 200);// conta1 Objeto da SUPERclasse recebe dados da
																		// SUBclasse ContaPjuridica;
		System.out.println(conta1);

		ContaPf conta2 = new ContaPoupança(1004, "Nelio", 0.0, 0.025);// conta2 OBJETO da SUPERclasse recebe dados da

		ContaPf conta3 = cnpj; // OBJETO da SUPERclasse também recebe dados do OBJETO da SUBclasse;
		// SUBclasse ContaPoupança;
		System.out.println(conta2);

		// Downcasting => Recebendo dados de um OBJETO de uma SUPERclasse para um ou
		// mais OBJETOS de uma SUBclasse;
		ContaPjuridica conta4 = (ContaPjuridica) conta1; // OBJETO da SUBclasse conta2 recebe objeto da SUPERclasse
															// conta1;
		System.out.println(conta4);

		// ContaPoupança conta3 = (ContaPoupança) conta2; // note que ao fazer um
		// downcasting é preciso colocar entre
		// parenteses a Subclasse a ser instanciada;
		// System.out.println(conta3);
		// Pra saber qual a instancia atual do objeto da Superclasse usa se o
		// instanceof:
		if (conta2 instanceof ContaPjuridica) {
			((ContaPjuridica) conta2).credito(100);
			System.out.println("Credito Aprovado!");
		}
		if (conta2 instanceof ContaPoupança) {
			((ContaPoupança) conta2).atualizacaoSaldoJuros();
			System.out.println("Saldo Atualizado!");
			// nesse caso ele imprimira na tela o Saldo Atualizado! pois a insntancia atual
			// de conta2 é ContaPoupança;

			// SOBREPOSIÇÃO:implementa um método de uma Superclasse em uma SUBclasse e
			// altera o escopo, mantendo a assinatura do metodo;

			ContaPf conta5 = new ContaPf(105, "Alex", 1000);// criei uma conta pessoa fisica(objeto SUPERclasse)
			conta5.saqueConta(200);// Determinei o valor do saque e:
			System.out.println(conta5.getSaldo());// Como o saque na SUPERclasse desconta uma taxa de 5 reais, o saldo
			// da conta5 é o saldo menos 5;

			ContaPf conta6 = new ContaPoupança(106, "Maria", 1000, 0.25);// Instanciei um OBJETO de uma SUPERclasse e
																			// atribui os dados da SUBclasse
																			// ContaPoupança(UPCASTING);
			conta6.saqueConta(200);// O metodo saqueConta está SOBREPOSTO com o escopo alterado para nao descontar
									// a taxa de 5 reais;
			System.out.println(conta6.getSaldo());// valor do saldo NAO vai ser descontado a taxa.

			ContaPf conta7 = new ContaPjuridica(107, "Pedro", 1000, 500);// Instanciei um OBJETO de uma SUPERclasse e
																			// Atribui os dados da SUBclasse
																			// ContaPjuridica(UPCASTING):
			conta7.saqueConta(200); // O metodo saque conta na SUBclasse ContaPjuridica está SOBREPOSTO através do
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
