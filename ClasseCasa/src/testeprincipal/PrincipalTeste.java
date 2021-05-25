package testeprincipal;

import java.util.Scanner;

import entidade.Casa;


public class PrincipalTeste {

	public static void main(String[] args) {
		/*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como
desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas
abertas.
		 */
		Scanner tc = new Scanner(System.in);
		Casa c =new Casa();
		
		System.out.println("Qual cor você quer pintar sua casa?");
		String cor=tc.nextLine();
		c.pintaACasa(cor);
		System.out.println("A sua casa foi pintada de: "+c.cor);
		System.out.println("A porta 01 está aberta?digite  true ou false");
		c.porta.porta1=tc.nextBoolean();
		c.abreOuFechaPortas();
		System.out.println("A porta 02 está aberta?digite true ou false");
		c.porta.porta2=tc.nextBoolean();
		c.abreOuFechaPortas();
		System.out.println("A porta 03 está aberta?digite true ou false");
		c.porta.porta3=tc.nextBoolean();
		c.abreOuFechaPortas();
		System.out.println(" Quantidade de portas abertas:"+c.abreOuFechaPortas());
		
		
		
		
		
		tc.close();
		

	}

}
