package repeticao;
import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i;
		
		
		for(i = 1; i <= N; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
		
		sc.close();
	}

}
