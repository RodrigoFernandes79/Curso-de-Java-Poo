package EmpregadoFaculdade;

public class Funcionario {
//Imagine que vamos modelar um sistema para a faculdade que controle as despesas com funcionários
	// e professores. Nosso funcionário fica assim:

	protected String nome;
	protected double salario;

	// Connstrutores:
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	// Getters And Setters:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getGastos() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario nome: " + nome + ", salario: " + salario;
	}

}
