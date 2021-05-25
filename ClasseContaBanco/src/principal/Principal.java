package principal;

import java.util.Scanner;

import entidade.Cliente;
import entidade.Conta;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanString = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		
		Conta itau=new Conta();
		Conta caixa=new Conta();
		Cliente cliente =new Cliente();
		
		System.out.println("Digite o nome do titular da conta:");
		String nome =scanString.nextLine();
		System.out.println("Nome do cliente: "+cliente.getNome());
		
		System.out.println("Digite o sobrenome do titular da conta: ");
		String sobren=scanString.nextLine();
		cliente.setSobrenome(sobren);
		System.out.println("Sobrenome do cliente: " +cliente.getSobrenome());
		
		System.out.println("Digite seu cpf:");
		String cpf = scanString.nextLine();
		cliente.setCpf(cpf);
		System.out.println("N�mero do cpf: "+cliente.getCpf());
		
		System.out.println("Digite sua idade:");
		int idade=scanInt.nextInt();
		cliente.setIdade(idade);
		System.out.println("Idade: "+cliente.getIdade());
		
		
		System.out.println("digite o numero da sua conta:");
		int numero=scanInt.nextInt();
		itau.setNumero(numero);
		System.out.println("Numero da sua conta:"+itau.getNumero());
		
		
		
		System.out.println("Qual o seu saldo atual");
		double saldo=scanInt.nextDouble();
		itau.setSaldo(saldo);
		System.out.println("O seu saldo atual � de: "+itau.getSaldo());
		
		
		System.out.print("Quanto voc� quer sacar:?");
		double saque =scanInt.nextDouble();
		itau.saca(saque);
		System.out.print("O Seu saldo atual � de: R$ " +itau.getSaldo());
		
		System.out.print("Quanto voc� que depositar?");
		double deposito=scanInt.nextDouble();
		itau.deposita(deposito);
		
		System.out.print("Saldo Atual:"+itau.getSaldo());
		System.out.println(cliente);
		System.out.println(itau);
		
		//itau=caixa;//igualando objetos
		
		//if(itau==caixa) {
			//System.out.println("Contas iguais");
			
		//}
		
		System.out.print("Digite o valor da transferencia:" );
		double valor =scanInt.nextDouble();
		System.out.print("O Valor a ser realizado a transferencia � de: "+valor);
		itau.transfere(caixa, valor);
		System.out.print("O novo saldo do itau � de: "+itau.getSaldo());
		System.out.print("O novo saldo da caixa � de: "+caixa.getSaldo());
	}

}
