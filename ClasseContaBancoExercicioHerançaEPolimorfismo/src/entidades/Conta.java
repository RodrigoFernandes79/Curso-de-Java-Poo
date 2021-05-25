package entidades;

public class Conta {
	private String titular;
	private int numero;
	protected double saldo;
	protected String tipo;

	
	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}



	public Conta(String titular, int numero, double saldo,String tipo) {
		
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	

	public String getTipo() {
		return this.tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(this.saldo<valor) {
			System.out.println("Não foi possivel realizar a transação");
			
		}else {
		this.saldo -= valor;
	}

	
	}
}
	
	

