import java.util.Locale;
import java.util.Scanner;

public class Atv8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distance;
		
		System.out.print("Digite uma distância em metros: ");
		distance = sc.nextDouble();
		
		System.out.println("A distância de " + distance + " corresponde a:");
		
		System.out.printf("%fKm    %fdm%n", distance / 1000, distance * 10);
		System.out.printf("%fHm    %fcm%n", distance / 100, distance * 100);
		System.out.printf("%fDam    %fmm%n", distance / 10, distance * 1000);
		
		sc.close();
		
	}

}
