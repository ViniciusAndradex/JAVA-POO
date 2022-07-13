import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados_Exe5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, nump1, cod2, nump2;
		double valUni1, valUni2, valor;
		
		cod1 = sc.nextInt(); nump1 = sc.nextInt(); valUni1 = sc.nextDouble();
		cod2 = sc.nextInt(); nump2 = sc.nextInt(); valUni2 = sc.nextDouble();
		
		valor = (nump1 * valUni1) + (nump2 * valUni2);
		
		System.out.printf("%s VALOR R$%.2f%n", cod1, nump1 * valUni1);
		System.out.printf("%s VALOR R$%.2f%n", cod2, nump2 * valUni2);
		System.out.printf("VALOR A PAGAR: R$%.2f%n", valor);
		
		sc.close();
	}

}
