package entidades;

public class ContaEspecial extends Conta {
	public double limite;

	public ContaEspecial() {
		
	}

	public ContaEspecial(String nomeCliente, int numeroConta, double saldo, double limite) {
		super(nomeCliente, numeroConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public void sacar(double valor) {
		if (valor> limite) {
			System.out.println("Não foi possível realizar o saque... limite indisponível");
		}else {
			super.sacar(valor);
		}
		
	}

	@Override
	public String toString() {
		return "ContaEspecial: Limite de saque: R$ " + limite + 
				", Nome do Titular: " + nomeCliente + 
				", Numero da Conta:"+ numeroConta + 
				", saldo: " + saldo;
	}

	
	}
	
	


