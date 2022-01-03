package repeticao;
import java.util.Locale;
import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double x, y;
		
		for(int i = 0; i < n; i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			if(y == 0) {
				System.out.println("divisão impossivel");
			}else {
				double divisao = x/y;
				System.out.printf("%.1f\n", divisao);
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
