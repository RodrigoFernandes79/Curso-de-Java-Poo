package classefuncionario;

public class Funcionario {
//Vamos inserir os Atributos:
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	// Vamos inserir os M�todos:
	
	public double salarioLiquido() {
		return salarioBruto-imposto;
		
	}
	public void aumentoSalario(double porcentagem) {
		 salarioBruto += salarioBruto*(porcentagem/100);// OBS: metodos void  nao digita return
		
		
	}
	public String toString(){
	return nome + 
			" Sal�rio L�quido: R$ "
			+salarioLiquido();
	}
	
}


