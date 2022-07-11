import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados_Exe1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		System.out.print("Digite um número: ");
		b = sc.nextInt();
		
		System.out.println("SOMA = " + (a + b));
		
		sc.close();
		
	}

}
