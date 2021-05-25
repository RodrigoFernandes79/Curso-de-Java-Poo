package entidades;

public class Cpf extends Contribuinte {

	public Cpf() {

	}

	public Cpf(String nome, double rendaBruta) {
		super(nome, rendaBruta);

	}

	@Override
	public double calculoImposto() {
		if (super.rendaBruta >= 0 && super.rendaBruta <= 1400) {
			return 0;
		} else if (super.rendaBruta > 1400 && super.rendaBruta <= 2100) {
			return  super.rendaBruta *0.1 - 100;

		} else if (super.rendaBruta > 2100 && super.rendaBruta <= 2800) {
			return  super.rendaBruta * 0.15 - 270;
		} else if (super.rendaBruta > 2800 && super.rendaBruta <= 3600) {
			return  super.rendaBruta * 0.25 - 500;
		} else {
			return  super.rendaBruta * 0.30 - 700;
		}

	}

}
