package entidadecontribuinte;

public class Pj extends Contribuinte {

	private int funcionarios;

	public Pj(String nome, double rendaAnual, int funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double calcImpostoTotal() {
		if (this.funcionarios<=10) {
			return  super.rendaAnual*0.16;
		}else {
		  return  super.rendaAnual*0.14 ;
	}

}
}
