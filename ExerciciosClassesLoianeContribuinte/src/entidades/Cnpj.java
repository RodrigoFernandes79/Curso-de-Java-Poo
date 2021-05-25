package entidades;

public class Cnpj extends Contribuinte{
	
	
	

	public Cnpj() {
		
	}

	public Cnpj(String nome, double rendaBruta) {
		super(nome, rendaBruta);
		
	}

	@Override
	public double calculoImposto() {
		return super.rendaBruta*0.1;
	}
	
	

}
