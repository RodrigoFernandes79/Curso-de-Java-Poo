package entidade;

public class ControledeBonifica��es {
// Vamos agora entender um pouco sobre POLIMORFISMO:
	// criamos essa classe pra saber qual o valor total de bonifica��es pagos a
	// todos os funcionarios(gerente tamb�m � funcionario);
	private double totalDeBonifica��es = 0; // criei um atributo que vai somar o valor total de bonifica�oes;

	// Agora iremos criar uma classe para registrar esse total de bonifica�oes:
	public void registra(Funcionario funcionario) {
		this.totalDeBonifica��es += funcionario.bonifica�ao(); // vai somando as variaveis do objetos cujo metodo
																// bonifica�ao sera atribuido a depender da classe de
																// referencia
	}
		
	// por fim criarei o metodo get para mostrar o total de bonificacoes:
		
	public double getTotalDeBonifica��es() {
		return totalDeBonifica��es;
	}

	
}
