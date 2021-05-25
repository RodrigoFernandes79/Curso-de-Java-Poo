package classeproduto;

public class Produto {
// CRIANDO ATRIBUTOS:
	public String nome;
	public double preço;
	public int quantidade;

	//CRIANDO METODOS:
	public double valorTotalNoEstoque(){
	double total = preço*quantidade;
	return total;
	}
	
	public  void addProdutoNoEstoque(int quantidade) {//por logica, ja temos um atributo quantidade e 
		this.quantidade = this.quantidade + quantidade;   // se eu quiser adicionar mais ou diminuir preciso 
	 // o this. especifica que a quantidade a ser recebida o novo objeto é o ATRIBUTO
		//e não o PARAMETRO. o tipo vazio "void" é usado quando queremos apenas atribuir ou diminuir.
	}
	public void RetiraProdutoNoEstoque(int quantidade) { //Fazemos a mesma coisa com esse metodo
		this.quantidade = this.quantidade - quantidade;// so que ao inves de atribuir , iremos diminuir
// pode ser feito da outra maneira "this.quantidade -=quantidade".
	}
	//Convertendo objetos para String:
	public String toString() {
		return nome
				+ " R$ "+String.format("%.2f", preço)+
				", " 
				+quantidade +
				" unidades, Total: R$ "+
				String.format("%.2f", valorTotalNoEstoque());
		
		
	}

}
