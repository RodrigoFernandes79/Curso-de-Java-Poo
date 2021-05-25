package entidade;

public class ControledeBonificações {
// Vamos agora entender um pouco sobre POLIMORFISMO:
	// criamos essa classe pra saber qual o valor total de bonificações pagos a
	// todos os funcionarios(gerente também é funcionario);
	private double totalDeBonificações = 0; // criei um atributo que vai somar o valor total de bonificaçoes;

	// Agora iremos criar uma classe para registrar esse total de bonificaçoes:
	public void registra(Funcionario funcionario) {
		this.totalDeBonificações += funcionario.bonificaçao(); // vai somando as variaveis do objetos cujo metodo
																// bonificaçao sera atribuido a depender da classe de
																// referencia
	}
		
	// por fim criarei o metodo get para mostrar o total de bonificacoes:
		
	public double getTotalDeBonificações() {
		return totalDeBonificações;
	}

	
}
