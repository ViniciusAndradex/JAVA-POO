import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicioanis_Exe8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double imposto = 0, renda, inter;
		
		System.out.print("Renda: R$");
		renda = sc.nextDouble();
		
		if (renda >= 0.0 && renda <= 2000.00) {
			System.out.println("Isento");
		}
		else if (renda <= 3000.00) {
			imposto = ((renda - 2000) * 8 / 100);
		}
		else if (renda <= 4500.00) {
			inter = renda - 2000;
			imposto = ((inter - 1000) * 18 / 100) + (1000 * 8 / 100);
		}
		else {
			inter = renda - 2000;
			imposto = ((inter - 2500) * 28 /100) + (1000 * 8 / 100) + (1500 * 18 /100);
		}
		
		if (imposto == 0 )	{
			System.out.println();
		}
		else {
			System.out.printf("R$%.2f%n", imposto);
		}
		
		sc.close();
		
	}

}
