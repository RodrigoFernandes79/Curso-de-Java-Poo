package entidades;

public class ContaPoupança extends Conta {
	private double taxaRendimento;
	
	public ContaPoupança(){
		
	}

	public ContaPoupança(String nomeCliente, int numeroConta, double saldo, double taxaRendimento) {
		super(nomeCliente, numeroConta, saldo);
		this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	@Override
	public void depositar(double valor) {
		valor +=valor *taxaRendimento;
		super.saldo += valor;
		
	}
		
	
		
		
	

	@Override
	public String toString() {
		return "ContaPoupança: Taxa de Rendimento: % " + taxaRendimento +
				", Nome do Titular: " + nomeCliente
				+ ", Número da conta:" + numeroConta + ", saldo: R$ " + saldo;
	}


	}


	
	

