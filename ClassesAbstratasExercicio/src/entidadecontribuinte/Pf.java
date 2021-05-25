package entidadecontribuinte;

public class Pf extends Contribuinte {

	private double gastosComSaude;

	public Pf() {

	}

	public Pf(String nome, double rendaAnual) {
		super(nome, rendaAnual);
	}

	public Pf(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	
	private double calcImposto() {
		if (this.rendaAnual < 20000) {
			return super.rendaAnual * 0.15;
		} else {
			return super.rendaAnual * 0.25;
		}

	}
	@Override
	public double calcImpostoTotal() {
		return calcImposto() - (getGastosComSaude() / 2);
	}

}
