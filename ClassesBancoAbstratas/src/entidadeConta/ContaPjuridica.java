package entidadeConta;

public class ContaPjuridica extends ContaPf {
	// HERANÇA: Criei uma classe ContaCnpj e ela vai herdar todos os metodos e
	// atributos da classe Conta;

	private double limiteDeCredito; // depois de herdar de conta eu colocarei os atributos e metodos que estao a
									// mais

	public ContaPjuridica(int numero, String titular, double depositoInicial, double limiteDeCredito) {
		super(numero, titular, depositoInicial);// criei um construtor e trouxe todos os atributos da superclasse Conta;
		// Acrescentei o construtor do atributo limiteDeCredito;
		this.limiteDeCredito = limiteDeCredito;
	}

	public double getLimiteDeCredito() { // Get e Set no atributo limiteDeCredito , pois os outros já foram herdados da
											// superclasse Conta;
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
// agora vamos criar o metodo credito() . os outros metodos já foram herdados da superclasse Conta;

	public void credito(double valor) {
		if (limiteDeCredito >= valor) {
			saldo += valor - 10; // tenho que mudar o modificador de acesso na superclasse Conta de private para
			// protected(protected pode ser usado em subclasses de mesmos pacotes ou
			// diferentes pacotes.

		}
	}

	@Override
	public void saqueConta(double valor) {// Criei um metodo existente da SUPERCLASSE e vou fazer uma sobreposição para
											// alem do metodo ja epecificado, descontarei outra taxa de 2 reais;
		super.saqueConta(valor);// chamei o metodo sa superclasse atraves do SUPER;
		this.saldo -= 2;
	}

	@Override
	public String toString() {
		return "ContaPjuridica [limiteDeCredito:" + limiteDeCredito + ", saldo:" + saldo + "]";
	}
}
