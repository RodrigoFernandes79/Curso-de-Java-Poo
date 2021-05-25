package principalt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cnpj;
import entidades.Contribuinte;
import entidades.Cpf;

public class PrincipalT {



	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		
		List <Contribuinte> list = new  ArrayList<>();

		for (int i = 1; i <= 6; i++) {
			System.out.println("#Contribuinte " + i);
			System.out.println("Pessoa Física ou Pessoa Jurídica? [f/j]? ");
			char opçao = tc.next().charAt(0);
			
			System.out.println("Nome: ");
			tc.nextLine();
			String nome = tc.nextLine();
			
			System.out.println("Renda Bruta: R$");
			double rendaBruta = tc.nextDouble();
			if (opçao == 'f') {
			
				list.add(new Cpf(nome, rendaBruta));
			}else {
				
				list.add(new Cnpj(nome, rendaBruta));
			}
		} double soma = 0;
		for(Contribuinte x :list) {
			System.out.println("Nome: "+x.getNome()+" Renda Bruta: R$ "+x.getRendaBruta()+
					" Imposto a pagar: R$ "+x.calculoImposto());
			soma+= x.calculoImposto();
		}// Somar todos os impostos:
			System.out.println("A Soma dos Valores de todos os impostos é de R$: "+soma);

	}

}
