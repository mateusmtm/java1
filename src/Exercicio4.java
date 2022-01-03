import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		int numero = sc.nextInt();
		double horasTrab = sc.nextDouble();
		double valorHora = sc.nextDouble();
		
		salario = horasTrab * valorHora;
		
		System.out.println("O número do funcionário é: " + numero);
		System.out.printf("O seu salário foi de: %.2f", salario);
		
		
		sc.close();
	}

}
