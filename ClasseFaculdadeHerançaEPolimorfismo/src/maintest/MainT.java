package maintest;

import EmpregadoFaculdade.Funcionario;
import EmpregadoFaculdade.GeradorDeRelatorios;
import EmpregadoFaculdade.Professor;

public class MainT {

	public static void main(String[] args) {
		//vou na classe principal usar o POLIMORFISMO para mostrar o resultado da soma dos gastos:
		//Vou instanciar a classe gerador de relatorios:
		
		GeradorDeRelatorios relatorio = new GeradorDeRelatorios();
		Funcionario f1 = new Funcionario("Robertson", 1500);
		relatorio.adicionaGastos(f1);
		Funcionario f2 = new Professor("Bill", 2500,5);
		relatorio.adicionaGastos(f2);
		
		System.out.println(f1);
		System.out.println(f2);
		
		System.out.println(relatorio.getTotalGastos());
		
		

	}

}
