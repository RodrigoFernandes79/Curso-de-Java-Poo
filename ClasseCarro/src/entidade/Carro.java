package entidade;

public class Carro {
	public String cor;
	public String modelo;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	public Motor motor =new Motor();
	
	
	//liga o carro
	public void ligaOCarro() {
		System.out.println("O carro está ligado!");
	}
	//acelera uma certa quantidade
	public void acelerar(double velocidade) {
		velocidadeAtual+=velocidade;
	}
		
	public int engataMarcha() {
		if (velocidadeAtual<0) {
			return 1;
		} if(velocidadeAtual>20&&velocidadeAtual<40){
			return 2;
		} if (velocidadeAtual>=40&&velocidadeAtual<60) {
			return 3;
		}if (velocidadeAtual>=60&&velocidadeAtual<80) {
			return 4;
		}else {
			return 5;
		}
	}
	public String dadosDoCarro() {
		String dados=" Modelo: "+this.modelo;
		dados+="\nCor: "+this.cor;
		dados+="\nVelocidadeMáxima: Km/h"+this.velocidadeMaxima;
		dados+="\nPotência do motor: "+this.motor.potencia+" Cc.";
		dados+="\nTipo do motor: "+this.motor.tipo;
		return dados;
	}
	


	}
	


