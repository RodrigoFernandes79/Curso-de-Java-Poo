package entidade;

public class ClassePessoa {
	/*Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade)
	e imprima seu nome e sua idade.
	*/
	
	//Criando atributos:
	public String nome;
	public int idade;
	
	//Método Aniversario:
	public void aniversario() {
		for(int i=this.idade+1;i<this.idade+5;i++) {
			System.out.println("Feliz Aniversário, "+nome+"! Você Fez "+i+" anos.");
		}
	}
	
}

