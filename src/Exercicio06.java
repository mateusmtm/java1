import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		triangulo = (A*C)/2;
		circulo = 3.14159 * (C*C);
		trapezio = ((A+B) * C )/ 2;
		quadrado = B*B;
		retangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f", retangulo);

		
		
		
		
		
		sc.close();
	}

}
