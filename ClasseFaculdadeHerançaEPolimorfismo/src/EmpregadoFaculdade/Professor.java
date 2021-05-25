package EmpregadoFaculdade;

public class Professor extends Funcionario {
	//O gasto que temos com o professor n�o � apenas seu sal�rio. Temos de somar um b�nus de 10 reais
	//por hora/aula. O que fazemos ent�o?
	private int horasPorAula;
	
	// Primeiro vamos criar construtores:
	public Professor(String nome, double salario, int horasPorAula) {
		super(nome, salario);
		this.horasPorAula = horasPorAula;
	}
	// Getters and setters:
	public int getHorasPorAula() {
		return horasPorAula;
	}

	public void setHorasPorAula(int horasPorAula) {
		this.horasPorAula = horasPorAula;
	}
	@Override
	public double getGastos() {
		return super.getGastos()+this.horasPorAula*10;
	}
	@Override
	public String toString() {
		return "Professor: "+ super.nome+
				" , Horas por aula: " + horasPorAula + 
				" , Salario Professor: "+ super.salario+
				" , Gastos Totais: "+ getGastos();
	}
	
	
	
	
	
	
}
