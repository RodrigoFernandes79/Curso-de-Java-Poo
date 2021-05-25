package entidade;

import java.util.Scanner;

public class Cliente {

	private String nome;
	private String sobrenome;
	private String cpf;
	
	// modo privado para omitir o cpf , somente acessando o metodo mudaCpf()
	private int idade;
	
	Scanner tc = new Scanner(System.in);

	
	

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void mudaCpf(String cpf) {// metodo mudaCpf publico para que o usuario possa digitar o cpf
		System.out.println("digite sua idade: ");
		idade = tc.nextInt();
		if (idade < 60) {
			validaCpf(cpf);
		} else {
			this.cpf = cpf;
		}
	}

	private void validaCpf(String cpf) {// nao é necessario tornar publico , pois o metodo esta centralizado
		// dentro do metodo privado mudaCpf();

		if (this.cpf == cpf) {
			System.out.println("CPF inválido!");
		} else {
			System.out.println("CPF cadastrado com sucesso!");
		}

	}

	
	public String toString() {
		return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", idade="
				+ idade + "]";
	}

}
