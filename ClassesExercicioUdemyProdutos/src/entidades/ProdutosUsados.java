package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos {
	public static final SimpleDateFormat fdd = new SimpleDateFormat("dd/mm/aaaa");
	private String dataDeFabrica��o;
	// Criando construtores:

	public ProdutosUsados(String nome, double pre�o, String dataDeFabrica��o) {
		super(nome, pre�o);
		this.dataDeFabrica��o = dataDeFabrica��o;
	}
	// Getters and setters:

	public String getDataDeFabrica��o() {
		return dataDeFabrica��o;
	}

	public void setDataDeFabrica��o(String dataDeFabrica��o) {
		this.dataDeFabrica��o = dataDeFabrica��o;
	}

	// m�todos:

	@Override
	public String pre�oEtiqueta() {
		return super.pre�oEtiqueta();
	}

	@Override
	public String toString() {
		return "(usada) " + pre�oEtiqueta() + ",  (Data de Fabrica��o: " + getDataDeFabrica��o() + ")";

	}

}
