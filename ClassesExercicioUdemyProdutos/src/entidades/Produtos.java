package entidades;

public class Produtos {
	private String nome;
	private double pre?o;
	// Criando construtores:

	public Produtos(String nome, double pre?o) {
		this.nome = nome;
		this.pre?o = pre?o;

	}
	// Getters and Setters:

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPre?o() {
		return pre?o;
	}

	public void setPre?o(double pre?o) {
		this.pre?o = pre?o;
	}

	// Criando m?todos:
	public String pre?oEtiqueta() {
		return "R$ " + this.pre?o;
	}

	@Override
	public String toString() {
		return  pre?oEtiqueta();
	}

}
