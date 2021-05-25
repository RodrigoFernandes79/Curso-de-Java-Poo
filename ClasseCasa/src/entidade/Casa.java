package entidade;

public class Casa {
	/*Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche as mesmas como
desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas
abertas.
	 */
	public String cor;
	public Porta  porta=new Porta();
	
	//Vamos aos métodos:
	public void pintaACasa(String cor) {
		this.cor=cor;
	}
	
	
	public int abreOuFechaPortas() {
		int portasAbertas=0;
		 if(this.porta.porta1==true) {
			  portasAbertas=+1;
		 }if (this.porta.porta2==true) {
			  portasAbertas+=1;
			 
		 }if(this.porta.porta3==true) {
			 portasAbertas+=1;
		 }return portasAbertas;
		
		
			
		}
	}


