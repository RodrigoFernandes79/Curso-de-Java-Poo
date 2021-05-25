package entidades;

public class ProdutosImportados extends Produtos {
	public double taxaAlfandega;

	// Criando construtores:
	public ProdutosImportados(String nome, double preço, double taxaAlfandega) {
		super(nome, preço);
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
	public String preçoEtiqueta() {
		return "R$ " + this.taxaAlfandega;
	}

	public double preçoTotal() {
		return super.getPreço() + this.taxaAlfandega;
	}

	@Override
	public String toString() {

		return "R$ "+ preçoTotal() + "(Taxa de Alfandega: " + getTaxaAlfandega() + ")";

	}

}
