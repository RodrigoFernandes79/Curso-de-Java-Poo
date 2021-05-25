package entidades;

public class ManipuladorDeConta {
			
	




	public void criaConta(Conta conta) {
		System.out.println("Numero Da Conta: " +conta.getNumero());
		System.out.println("Nome do Titular: " +conta.getTitular());
		System.out.println("Saldo da Conta: "+conta.getSaldo());
		if (conta.getTipo().equals("ContaCorrente")) {
			System.out.println("Voc� criou umaConta Corrente");
			conta.sacar(2000);
			System.out.println("Seu novo saldo � de: R$ "+conta.getSaldo());
			
		}else if (conta.getTipo().equals("ContaPoupan�a")) {
			System.out.println(" Voce criou uma Conta Poupan�a");
		}
		
	}
}
