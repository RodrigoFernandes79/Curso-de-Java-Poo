package entidade;

import java.util.Scanner;

public class Porta {
	public int aberta;
	public String cor;
	public Dimensao tamanho = new Dimensao();
	
	//metodos:
	public void abre() {
		System.out.println("Você abriu a porta");
		
	}
	public void fecha() {
		System.out.println("Você fechou a porta");


}	public void pinta(String cor) {
		this.cor=cor;
		System.out.println("Você pintou a porta de: "+cor);
} 	
public boolean estaAberta() {
	if(this.aberta==1) {
		System.out.println("A porta está aberta");
		return true;
		
	} else{
		System.out.println("A porta está fechada");
		return false;
	}
}
	public String alteraDimensao() {
		String dados="\nAltura da Porta: "+this.tamanho.dimensaox+" cm";
		dados+="\nLargura da Porta: "+this.tamanho.dimensaoy+ " cm";
		dados+="\nEspessura da Porta: "+this.tamanho.dimensaoz+" cm";
		return dados;
		
		
	}
	
	
}
