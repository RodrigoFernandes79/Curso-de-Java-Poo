package entidade;

public class Funcionario {
//Como toda empresa, nosso Banco possui funcionários. Vamos modelar a classe Funcionario :
	// ATRIBUTOS:
	private String nome;
	private String cpf;
	protected double salario;// mudar pra protected para a SUBclasse Gerente poder modificar diretamente o atributo;

	// Construtores:
	public Funcionario() {

	}

	// sobrecarga
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	// Getters and Setters:

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//Funcionario recebe 10% de bonificação em cima do salario:
	public double bonificaçao() {
		return this.salario*0.1;
	}
}
