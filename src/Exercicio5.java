import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int codigo1 = sc.nextInt();
		int numero1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int codigo2 = sc.nextInt();
		int numero2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorPagar = (numero1*valor1) + (valor2 * numero2);
		
		System.out.printf("VALOR A PAGAR: %.2f", valorPagar);
		
		sc.close();
	}

}
