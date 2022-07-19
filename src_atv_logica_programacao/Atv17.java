import java.util.Locale;
import java.util.Scanner;

public class Atv17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double velocidade;
		final double veloMax = 80.0;

		System.out.print("Qual a velocidade do carro: ");
		velocidade = sc.nextDouble();
		
		if (velocidade > veloMax) {
			double multa = (velocidade - veloMax) * 5.0;
			System.out.printf("Voce foi multado: R$%.2f", multa);
		}
		else
			System.out.println("Sem infraçoes!");
		
		sc.close();
		
	}

}
