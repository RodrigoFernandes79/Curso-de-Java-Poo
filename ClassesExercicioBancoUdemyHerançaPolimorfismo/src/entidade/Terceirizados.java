package entidade;

public class Terceirizados extends Funcionarios {
	// criando atributo da despesa do funcionario:
	private double despesaAdicional;
	// Criando um construtor com base na SUPERclasse Funcionarios:

	public Terceirizados(String nome, int horasTrabalhadas, double valorPorHora, double despesaAdicional) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	// Criar Getter and Setters.
	public double getDespesaAdicional() {
		return despesaAdicional;
	}
	@Override
	public double pagamentoFuncionario() {
		return super.pagamentoFuncionario()+despesaAdicional*1.1;
		
	}
	
}
