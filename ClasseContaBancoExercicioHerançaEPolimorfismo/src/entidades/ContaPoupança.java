package entidades;

public class ContaPoupan�a extends Conta{
	
	

	public ContaPoupan�a(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
		// TODO Auto-generated constructor stub
	}
	public ContaPoupan�a(String titular, int numero, double saldo, String tipo ) {
		super(titular, numero, saldo, tipo);
	}	
	@Override
	public String getTipo() {
		return super.tipo = "ContaPoupan�a";
		}
	}


