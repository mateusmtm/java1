package condicional;
import java.util.Scanner;

public class Condicional03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao multiplos");
		}else {
			System.out.println("Nao sao multiplos");
		}
		
		
		
		
		
		sc.close();
	}

}