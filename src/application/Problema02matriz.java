package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoMatriz;

public class Problema02matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade = sc.nextInt();
		ProdutoMatriz[] vect = new ProdutoMatriz[quantidade];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double valor = sc.nextDouble();
			vect[i] = new ProdutoMatriz(nome, valor);
		}
		
		double soma = 0;
		
		for(int i = 0; i < vect.length; i++) {
			soma = soma + vect[i].getValor();
		}

		double media = soma/vect.length;
		
		System.out.printf("A média é igual a: %.2f\n", media);
		
		sc.close();
	}

}
