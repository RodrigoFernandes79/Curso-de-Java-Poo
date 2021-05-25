package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutosUsados extends Produtos {
	public static final SimpleDateFormat fdd = new SimpleDateFormat("dd/mm/aaaa");
	private String dataDeFabricação;
	// Criando construtores:

	public ProdutosUsados(String nome, double preço, String dataDeFabricação) {
		super(nome, preço);
		this.dataDeFabricação = dataDeFabricação;
	}
	// Getters and setters:

	public String getDataDeFabricação() {
		return dataDeFabricação;
	}

	public void setDataDeFabricação(String dataDeFabricação) {
		this.dataDeFabricação = dataDeFabricação;
	}

	// métodos:

	@Override
	public String preçoEtiqueta() {
		return super.preçoEtiqueta();
	}

	@Override
	public String toString() {
		return "(usada) " + preçoEtiqueta() + ",  (Data de Fabricação: " + getDataDeFabricação() + ")";

	}

}
