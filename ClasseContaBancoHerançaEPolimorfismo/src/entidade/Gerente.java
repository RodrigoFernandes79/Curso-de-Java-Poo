package entidade;

public class Gerente extends Funcionario {
	// A classe gerente vai herdar da SUPERCLASSE funcionario os atributos contidos
	// nela e acrescentar mais atributos e metodos:

	private int senha;
	private int numeroDeFuncionariosGerenciados; // Alem dos atributos herdados pela SUPERCLASSE, terei os atributos
													// especificos da classe gerente;
	// Criarei construtor com atributos herdados da SUPERCLASSE funcionarios:

	public Gerente() {
		super();
	}

	// Sobrecarga:
	public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		super(nome, cpf, salario);// herda da superclasse
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;

	}

	// Getters and Setters:
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	// Criaremos metodo para o gerente verificar senha de acesso para sistema
	// interno do banco e ele pode gerenciar outros funcionarios;
	public boolean autenticaSenha(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		} // Em todo momento que criarmos um objeto do tipo Gerente , este objeto possuirá
			// também os
			// atributos definidos na classe Funcionario , pois um Gerente é um Funcionario
			// :
	}

	// O gerente recebe 15 por cento de bonificação , 5 por cento a mais que o
	// Funcionario:Criaremos uma sobreposiçao do metodo bonificaçao
	@Override
	public double bonificaçao() {
		return this.salario * 0.15;
	}
}
