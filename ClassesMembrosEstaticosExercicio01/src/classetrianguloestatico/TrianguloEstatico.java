package classetrianguloestatico;

public class TrianguloEstatico {
	
	public static double area(double a, double b, double c ) {
		double p=(a+b+c)/2; 
		double resultado= Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return resultado;
	}

}
