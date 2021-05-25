package entidadeConta;

public class TotalizadorSaldo {
	
	// Como eu nao posso mais instanciar a conta pf , eu vou criar uma classe para totalizar o saldo das
	// contas pj e poupança
	
	private double saldoTotal = 0;
	
	// vou criar um metodo para somar cada objeto de contas diferentes:
	
	public void TotalConta(ContaPf conta) {
		this.saldoTotal+= conta.getSaldo();
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
	public void  setSaldoTotal(ContaPf conta) {
		conta.depositarConta(10);// deposito dez reais em cada conta que eu instanciar la no principal
	}
}	
