package classeestudante;

public class Estudante {
	//Criando Atributos:
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	// Criando metodos:
	public double notaFinal() {
		return nota1+nota2+nota3;
	}
	public double faltaPontos() {
	return 60- notaFinal() ;
	
	}
	}



