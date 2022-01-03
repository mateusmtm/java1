package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Classes02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.print("Nome: ");
		empregado.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		empregado.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + empregado);
		System.out.println();
		
		System.out.print("Qual é a porcentagem de aumento do salário? ");
		double perc = sc.nextDouble();
		empregado.aumentoSalario(perc);
		System.out.println();
		System.out.println("Updated data: " + empregado);
		
		
		
		sc.close();
	}

}
