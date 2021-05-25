package principal;

import java.util.Scanner;

import entidade.Carro;
import entidade.Motor;

public class Principal {

	public static void main(String[] args) {
		Scanner tc =new Scanner(System.in);
		Carro meuCarro =new Carro();
		
		
		//Coletando dados dos atributos do meuCarro:
		meuCarro.modelo="Honda Civic";
		meuCarro.cor="Prata";
		meuCarro.velocidadeAtual=0;
		meuCarro.velocidadeMaxima=200;
		meuCarro.motor.potencia=150;
		meuCarro.motor.tipo="Turbo";
		System.out.println(meuCarro.dadosDoCarro());
		//Ligar o carro(método):
		meuCarro.ligaOCarro();
		//Acelerar o Carro(metodo):
		System.out.println("Qual a sua aceleração?");
		double velocidade=tc.nextDouble();
		meuCarro.acelerar(velocidade);
		System.out.println("Acelerei "+velocidade+ ", minha velocidade atual é: Km/h "+meuCarro.velocidadeAtual);
		System.out.println();
		System.out.println("Qual marcha atual do carro?");
		meuCarro.engataMarcha();
		System.out.println(meuCarro.engataMarcha());
		
		
		
		
		tc.close();

	}

}
