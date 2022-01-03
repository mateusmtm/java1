package entities;

public class Conversor {
	
	public static double valorEmReais(double valorDolar, double dolarComprado) {
		return (valorDolar * dolarComprado) + ((valorDolar * dolarComprado)/100) * 6;
	}
	
}
