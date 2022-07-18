import java.util.Locale;
import java.util.Scanner;

public class Atv7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		System.out.print("Digite um número: ");
		a = sc.nextDouble();
		
		System.out.printf("O dobro de %.1f é %.1f%n", a, a * 2);
		System.out.printf("A terça parte de %.1f é %.1f", a, a / 3);
		
		sc.close();
		
	}

}
