package entidade;

public class Conta {
	public String agencia;
	public int numero;
	public String titular;
	public  double saldo;
	public Data dataAbertura = new Data();
		
	
	//metodos:
	
	public void sacar(double dinheiro) {
		this.saldo-=dinheiro;
		System.out.println("Saque de "+dinheiro+" efetuado com sucesso!");
		System.out.println("O Seu saldo atual é de: R$ "+this.saldo);
	}
	public void depositar(double dinheiro) {
		saldo+=dinheiro;
		System.out.println("Depósito de "+dinheiro+" efetuado com sucesso!");
		System.out.println("O seu saldo atual é de: R$ "+this.saldo);
	}
	public double calculaRendimento() {
		double rendimento = saldo*0.1;
		System.out.println("Seu rendimento foi de: R$ "+rendimento);
		return saldo=rendimento+saldo;
	}
	public String recuperaDadosParaImpressao() {
			 String dados="Agencia: "+this.agencia;
			 dados+="\nNumero da conta: "+this.numero;
			 dados+= "\nTitular: "+this.titular;
			   dados+="\nSaldo: R$ "+this.saldo;
			   
			   dados+="\nData De Abertura: \nDia: "+this.dataAbertura.dia;
			   dados+="\nMês: "+this.dataAbertura.mes;
			   dados+="\nAno: "+this.dataAbertura.ano;
			  return dados;
			  
			    
	 }
	
		
		 }
		
		
		
		
	


