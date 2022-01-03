package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Classes03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f\n", aluno.media());
		
		if (aluno.media() < 60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f points\n", 60 - aluno.media());
		}else {
			System.out.println("Pass");
		}
		
		sc.close();
	}

}
