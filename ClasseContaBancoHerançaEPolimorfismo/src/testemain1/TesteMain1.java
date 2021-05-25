package testemain1;

import entidade.ControledeBonifica��es;
import entidade.Funcionario;
import entidade.Gerente;

public class TesteMain1 {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		// podemos chamar o atributo nome que esta na classe funcionario:
		gerente.setNome("Rodrigo");
		// E o metodo que esta na SUBclasse gerente:
		gerente.autenticaSenha(1354);
		// vamos testar o metodo sobreposto bonifica�ao alterado para gerentes
		gerente.setSalario(5000);// vamos inserir o o salario do gerent
		System.out.println(gerente.bonifica�ao());// o valor da bonifica��o do gerente:

		// Agora vamos testar o metodo da superclasse com a bonifica�ao dada para os
		// funcionarios:
		funcionario.setSalario(1500);// vamos inserir o salario do funcionario
		System.out.println(funcionario.bonifica�ao());// resultados diferentes de acordo com os calculos do mesmo metodo

		// VAmos aos exemplos de POLIMORFISMO. onde os objetos de uma classe onde �
		// intanciado e recebe atributos de uma outra classe, recebera metodos da classe
		// a que foi atribuida;

		ControledeBonifica��es controle = new ControledeBonifica��es(); // instanciei i ojeto da classe controle de
																		// bonifica�oes

		// agora vou querer saber quanto � o valor total de bonifica��es de funcionarios
		// , inclusive gerentes:

		Funcionario f1 = new Funcionario();// instanciei o objeto do tipo funcionario e ele recebera os atributos da
											// mesma classe;
		// Agora usarei o metodo que registra o valor total de bonifica�oes:
		f1.setSalario(1000);// vou adicionar o salario do funcionario
		controle.registra(f1);// ele vai implantar o metodo de funcionario para calculo de bonifica�ao;

		// Agora vou registrar o total de bonifica�ao do gerente:
		Funcionario f2 = new Gerente(); // o Objeto da classe funcionario vai receber os argumentos da Classe gerente
		f2.setSalario(5000);// vou adicionar o salario do gerente
		controle.registra(f2); // vai implantar os argumentos da classe Gerente no objeto do tipo Fuincionario
								// e registrar o metodo que soma as bonificacoes
		System.out.println(controle.getTotalDeBonifica��es()); // irei imprimir o total

	}

}
