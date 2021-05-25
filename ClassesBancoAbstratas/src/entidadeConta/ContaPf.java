package entidadeConta;
//SUPERCLASSE
public   abstract class  ContaPf {
	private int numero;
	private String titular;
	protected double saldo;// Mudei pra protected pois precisaria mexer no saldo diretamente na classe
							// ContaPjuridica;

	public ContaPf(int numero, String titular) {
		System.out.println("Dados cadastrados com sucesso...");
		this.numero = numero;
		this.titular = titular;
	}

	public ContaPf(int numero, String titular, double depositoInicial) {// Construtor:

		this.numero = numero;
		this.titular = titular;
		depositarConta(depositoInicial);

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {

		this.titular = titular;
	}

	public void depositarConta(double valor) {
		this.saldo += valor;
	}

	public void saqueConta(double valor) {
		int taxa = 5;
		this.saldo -= valor + taxa;//Cobramos uma taxa de 5 reais para cada saque efentuado.
	}

	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	
	
}
