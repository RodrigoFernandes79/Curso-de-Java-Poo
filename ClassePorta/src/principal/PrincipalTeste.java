package principal;

import java.util.Scanner;

import entidade.Porta;

public class PrincipalTeste {

	public static void main(String[] args) {
		/*Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimens�es e use o
m�todo estaAberta para verificar se ela est� aberta
		 */
		
		Scanner tc = new Scanner(System.in);
		Porta porta=new Porta();
		porta.abre();
		porta.fecha();
		System.out.println("qual a cor atual da porta?");
		porta.cor=tc.nextLine();
		System.out.println("Qual cor voc� quer pintar?");
		String novacor=tc.nextLine();
		porta.pinta(novacor);
		System.out.println("De que cor ficou a porta?");
		System.out.println(porta.cor);
		System.out.println("Favor, verificar se a porta est� aberta: digite 1 se ela estiver aberta ");
		porta.aberta=tc.nextInt();
		porta.estaAberta();
		System.out.println("Altura da Porta:");
		porta.tamanho.dimensaox=tc.nextDouble();
		System.out.println("Largura da Porta: ");
		porta.tamanho.dimensaoy=tc.nextDouble();
		System.out.println("Espessura da Porta: ");
		porta.tamanho.dimensaoz=tc.nextDouble();
		System.out.println(porta.alteraDimensao());
	

}
}