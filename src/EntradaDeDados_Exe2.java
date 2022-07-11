import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados_Exe2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;

		System.out.print("Digite o Raio: ");
		raio = sc.nextDouble();
		
		System.out.printf("A = %.4f", Math.PI * Math.pow(raio, 2.0));
		
		sc.close();
		
	}

}
