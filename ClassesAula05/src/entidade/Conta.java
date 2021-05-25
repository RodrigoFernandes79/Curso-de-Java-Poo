package entidade;

public class Conta {
	public int numero;
	public String dono;
	public double saldo;
	public double limite;
	
	
	public String toString() {
		return "O número é" +numero +", "+
				"O Nome é: " +dono+
				" O seu saldo é " +saldo+
				"O seu limite é: "+limite;
		
	}

}
