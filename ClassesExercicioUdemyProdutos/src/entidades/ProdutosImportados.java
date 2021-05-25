package entidades;

public class ProdutosImportados extends Produtos {
	public double taxaAlfandega;

	// Criando construtores:
	public ProdutosImportados(String nome, double pre�o, double taxaAlfandega) {
		super(nome, pre�o);
		this.taxaAlfandega = taxaAlfandega;
	}

	// Getters and Setters:
	public double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	@Override
	public String pre�oEtiqueta() {
		return "R$ " + this.taxaAlfandega;
	}

	public double pre�oTotal() {
		return super.getPre�o() + this.taxaAlfandega;
	}

	@Override
	public String toString() {

		return "R$ "+ pre�oTotal() + "(Taxa de Alfandega: " + getTaxaAlfandega() + ")";

	}

}
