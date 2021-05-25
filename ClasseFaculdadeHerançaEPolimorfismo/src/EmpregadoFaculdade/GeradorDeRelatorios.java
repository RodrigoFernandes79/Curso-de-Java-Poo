package EmpregadoFaculdade;

public class GeradorDeRelatorios {
	// vamos Criar um metodo para calcular o total de gastos com funcionarios da
	// faculdade(inclusive professores)
	
	// Atributos:
	private int somarGastosfuncionario= 0;

	// agora iremos criar um metodo para somar todos os gastos com funcionrios da faculdade:
	public void adicionaGastos(Funcionario funcionario) {
		somarGastosfuncionario += funcionario.getGastos();
	}
	public double getTotalGastos() {
	return somarGastosfuncionario;
}
}