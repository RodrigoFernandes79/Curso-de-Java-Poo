package entidades;

public class ContaPoupan�a extends Conta {
	private double taxaRendimento;
	
	public ContaPoupan�a(){
		
	}

	public ContaPoupan�a(String nomeCliente, int numeroConta, double saldo, double taxaRendimento) {
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
		return "ContaPoupan�a: Taxa de Rendimento: % " + taxaRendimento +
				", Nome do Titular: " + nomeCliente
				+ ", N�mero da conta:" + numeroConta + ", saldo: R$ " + saldo;
	}


	}


	
	

