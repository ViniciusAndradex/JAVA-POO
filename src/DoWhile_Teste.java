import java.util.Locale;
import java.util.Scanner;

public class DoWhile_Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c;
		char teste = ' ';
		boolean isTrue = false;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", 9.0 * c / 5.0 + 32.0);
			
			while (teste != 's' && teste != 'n') {
				System.out.print("Deeja repetir (s/n): ");
				teste = sc.next().charAt(0);
			}
			
			if (teste == 's')
				teste = ' ';
			else 
				isTrue = true;
			
			System.out.println();
			
		} while(isTrue == false);
		
		System.out.println("Obrigado por usar nosso app.");
		
	}

}
