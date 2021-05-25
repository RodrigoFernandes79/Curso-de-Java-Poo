package principaltest;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupan�a;
import entidades.ManipuladorDeConta;

public class PrincipalTest {

	public static void main(String[] args) {
		ManipuladorDeConta manipula = new ManipuladorDeConta();
		
		Conta c1 = new ContaCorrente("Rodrigo", 5555,1500);
		manipula.criaConta(c1);
		System.out.println();
		System.out.println("@#@#@#@#@#@#@#@#@#@#");
		Conta c2 = new ContaPoupan�a("Marcelo", 5420, 3000);
		manipula.criaConta(c2);
		
		
		

	}

}
