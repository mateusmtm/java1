package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conversor;

public class Static01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual é o preço do dólar? ");
		double valorDolar = sc.nextDouble();
		
		System.out.printf("Quantos dólares serão comprados? ");
		double dolarComprado = sc.nextDouble();
	
		System.out.printf("Valor a ser pago em reais = %.2f", Conversor.valorEmReais(valorDolar, dolarComprado));
		
		
		
		
		sc.close();
	}

}
