package entidadeConta;

public class ContaPoupanša extends ContaPf {
	private double taxaJuros;
	// UPCASTING E DONWCASTING:

	public ContaPoupanša(int numero, String titular, double depositoInicial, double taxaJuros) {
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
								// naSUBclasse ContaPoupanša e alterei o metodo para nao descontar a taxa de 5
								// reais mantendo a mesma assinatura , mudando apenas o escopo do metodo;
		
	}

	@Override
	public String toString() {
		return "ContaPoupanša [taxaJuros:" + taxaJuros + ", saldo:" + saldo + "]";
	}

}
