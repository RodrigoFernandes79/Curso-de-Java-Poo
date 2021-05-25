package entidades;

public class Produtos {
	private String nome;
	private double preço;
	// Criando construtores:

	public Produtos(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;

	}
	// Getters and Setters:

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	// Criando métodos:
	public String preçoEtiqueta() {
		return "R$ " + this.preço;
	}

	@Override
	public String toString() {
		return  preçoEtiqueta();
	}

}
