package entidades;

public class ContaCorrente extends Conta{
	
	

	public ContaCorrente(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
		
	}
	public ContaCorrente(String titular, int numero, double saldo, String tipo) {
		super(titular, numero, saldo, tipo);
		
	}

	@Override
	public String getTipo() {
		return super.tipo = "ContaCorrente";
	
	}
	@Override
	public void sacar(double valor) {
	if(super.saldo<valor) {
		System.out.println("Não foi possivel realizar a transação... tente novamente:");
	
	}else {
	super.saldo -= valor+0.1;
}
	
}
}

