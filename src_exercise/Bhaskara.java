import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int a, b, c;
		double delta, x1, x2;
		
		System.out.print("Valor de A: ");
		a = sc.nextInt();
		System.out.print("Valor de B: ");
		b = sc.nextInt();
		System.out.print("Valor de C: ");
		c = sc.nextInt();
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("Delta: " + delta);
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		sc.close();
		
	}

}
