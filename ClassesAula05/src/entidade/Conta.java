package entidade;

public class Conta {
	public int numero;
	public String dono;
	public double saldo;
	public double limite;
	
	
	public String toString() {
		return "O n�mero �" +numero +", "+
				"O Nome �: " +dono+
				" O seu saldo � " +saldo+
				"O seu limite �: "+limite;
		
	}

}
