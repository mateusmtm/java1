package condicional;
import java.util.Scanner;

public class Condicional01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("NAO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();
	}

}
