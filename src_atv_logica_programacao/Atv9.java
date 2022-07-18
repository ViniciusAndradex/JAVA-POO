import java.util.Locale;
import java.util.Scanner;

public class Atv9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cart;
		
		System.out.print("Possui quantos dinheiros: R$");
		cart = sc.nextDouble();
		
		System.out.printf("Você pode comprar R$%.2f doláres.", cart / 5.42);
		
		sc.close();
		
	}

}
