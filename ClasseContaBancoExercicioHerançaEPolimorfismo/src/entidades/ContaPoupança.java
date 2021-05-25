package entidades;

public class ContaPoupança extends Conta{
	
	

	public ContaPoupança(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
		// TODO Auto-generated constructor stub
	}
	public ContaPoupança(String titular, int numero, double saldo, String tipo ) {
		super(titular, numero, saldo, tipo);
	}	
	@Override
	public String getTipo() {
		return super.tipo = "ContaPoupança";
		}
	}


