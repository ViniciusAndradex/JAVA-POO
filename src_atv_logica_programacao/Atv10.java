import java.util.Locale;
import java.util.Scanner;

public class Atv10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double larg, alt;
		
		System.out.println("Altura: ");
		alt = sc.nextDouble();
		System.out.println("Largura: ");
		larg = sc.nextDouble();
		
		double area = alt * larg;
		
		System.out.printf("Serão utilizados %.2fL de tinta.", area /2.0);
		
		sc.close();
		
	}

}
