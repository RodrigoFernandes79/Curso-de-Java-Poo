package entidades;

public class ContaPoupanša extends Conta{
	
	

	public ContaPoupanša(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
		// TODO Auto-generated constructor stub
	}
	public ContaPoupanša(String titular, int numero, double saldo, String tipo ) {
		super(titular, numero, saldo, tipo);
	}	
	@Override
	public String getTipo() {
		return super.tipo = "ContaPoupanša";
		}
	}


