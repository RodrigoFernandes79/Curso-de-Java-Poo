package entidade;

public class Casa {
	/*Crie uma casa e pinte-a. Crie tr�s portas e coloque-as na casa; abra e feche as mesmas como
desejar. Utilize o m�todo quantasPortasEstaoAbertas para imprimir o n�mero de portas
abertas.
	 */
	public String cor;
	public Porta  porta=new Porta();
	
	//Vamos aos m�todos:
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


