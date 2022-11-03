package Ud21.Calculadora;

public class Operaciones {
	
	public Operaciones() { 
		
	}
	
	public double suma(String a, String b) {
		double resultado = Double.parseDouble(a)+Double.parseDouble(b);
		return resultado;
	}
	
	public double resta(String a, String b) {
		double resultado = Double.parseDouble(a)-Double.parseDouble(b);
		return resultado;
	}
	
	public double multiplicacion(String a, String b) {
		double resultado = Double.parseDouble(a)*Double.parseDouble(b);
		return resultado;
	}
	
	public double division(String a, String b) {
		double resultado = Double.parseDouble(a)/Double.parseDouble(b);
		return resultado;
	}
	
}
