package entidade;

public class ClassePessoa {
	/*Crie uma pessoa, coloque seu nome e idade iniciais, fa�a alguns anivers�rios (aumentando a idade)
	e imprima seu nome e sua idade.
	*/
	
	//Criando atributos:
	public String nome;
	public int idade;
	
	//M�todo Aniversario:
	public void aniversario() {
		for(int i=this.idade+1;i<this.idade+5;i++) {
			System.out.println("Feliz Anivers�rio, "+nome+"! Voc� Fez "+i+" anos.");
		}
	}
	
}

