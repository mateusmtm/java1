package repeticao;
import java.util.Locale;
import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
		
		double nota1, nota2, nota3, media;
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;
		
		System.out.printf("A nota foi igual a %.1f\n", media);
		
		}
		
		sc.close();
	}

}
