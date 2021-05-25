package entidade;

public class Conta {
	private int numero;
	private double saldo;// nao quero que o usuario tenha acesso ao saldo, assim ele so acessara se		
	// solicitado
	private double salario;
	 
		
	
		

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public double getSaldo() { // get sempre que for acessar atributos(get=>return)
		return this.saldo;// como tornei o atributo saldo privado, criei um metodo para acessa- lo quando
							// invocado
	}

	public int getNumero() {// get sempre e usado para mostrar atributos atraves de um metodo
		return this.numero;
	}

	public void setNumero(int numero) {// set sempre é usado para criar parametros e inseri los nos
										// atributos(set=>void)
		this.numero = numero;
	}

	public boolean saca(double saque) {
		if (saque > this.saldo) {
			System.out.println("O Valor do saque é maior do que o saldo...operação inválida!");
			return false;
		} else {
			this.saldo = this.saldo - saque;
			System.out.println("Seu saque foi de R$ " + saque);
			return true;
		}

	}

	public void deposita(double deposito) {
		this.saldo = this.saldo + deposito;

	}

	public boolean transfere(Conta destino, double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente para realizar transferencia");
			return false;
		} else {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("transferencia realizada com sucesso!");
		}
		return true;
	}


	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo+ " ]";
	}


	


	

	
	}

