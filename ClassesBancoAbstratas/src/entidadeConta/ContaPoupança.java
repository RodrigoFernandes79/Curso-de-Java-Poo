package entidadeConta;

public class ContaPoupança extends ContaPf {
	private double taxaJuros;
	// UPCASTING E DONWCASTING:

	public ContaPoupança(int numero, String titular, double depositoInicial, double taxaJuros) {
		super(numero, titular, depositoInicial);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double atualizacaoSaldoJuros() {
		return saldo -= saldo * taxaJuros;
	}

	@Override
	public void saqueConta(double valor) {
		this.saldo -= valor; // SOBRESCRITA: Implementei o metodo saqueConta() da SUPERclasse ContaPf aqui
								// naSUBclasse ContaPoupança e alterei o metodo para nao descontar a taxa de 5
								// reais mantendo a mesma assinatura , mudando apenas o escopo do metodo;
		
	}
	@Override
	public String toString() {
		return "ContaPoupança [taxaJuros:" + taxaJuros + ", saldo:" + saldo + "]";
	}

}
