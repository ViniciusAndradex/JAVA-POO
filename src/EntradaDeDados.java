import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: "+ x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: "+ y);

		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: "+ z);

		char p;
		p = sc.next().charAt(0);
		System.out.println("Você digitou: "+ p);
		
		sc.close();
		
	}

}
