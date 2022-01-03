package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n) ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valorInicial = sc.nextDouble();
			conta = new Conta(numConta, nome, valorInicial);
		}else {
			conta = new Conta(numConta, nome);
		}

		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.depositarValor(deposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.sacarValor(saque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		sc.close();
	}

}
