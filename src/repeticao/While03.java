package repeticao;
import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int combustivel, alcool = 0, gasolina = 0, diesel = 0;
		
		combustivel = sc.nextInt();
		
		while (combustivel !=4) {
			if (combustivel == 1) {
				alcool = alcool + 1;
			}else if(combustivel == 2) {
				gasolina = gasolina + 1;
			}else if (combustivel == 3) {
				diesel = diesel + 1;
			}	
			
			combustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n", alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);

		sc.close();
	}

}
