import java.util.Locale;
import java.util.Scanner;

public class Atv5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n, n1; 
		
		System.out.print("Nota 1: ");
		n = sc.nextDouble();
		System.out.print("Nota 2: ");
		n1 = sc.nextDouble();
		
		System.out.println("A média entre " + n + " e " + n1 + " é igual a " + (n + n1) / 2.0);
		
		sc.close();
		
	}

}
