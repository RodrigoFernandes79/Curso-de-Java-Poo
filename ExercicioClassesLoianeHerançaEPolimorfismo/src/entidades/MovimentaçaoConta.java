package entidades;

public class MovimentaçaoConta {
	private double somaConta=0;
	
	
	public double TotalConta(Conta conta) {
		return somaConta += conta.getSaldo();
		
	}


	public double getSomaConta() {
		return somaConta;
	}


	

}
