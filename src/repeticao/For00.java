package repeticao;
import java.util.Scanner;

public class For00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int i, soma = 0;

		for (i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);

		sc.close();
	}

}
