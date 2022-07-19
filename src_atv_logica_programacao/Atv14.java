import java.util.Locale;
import java.util.Scanner;

public class Atv14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double kmPercorrido, valorTotal;
		int qtdDia;
		
		System.out.print("Dias Alugados: ");
		qtdDia = sc.nextInt();
		System.out.print("Km Percorridos: ");
		kmPercorrido = sc.nextDouble();
		
		System.out.printf("Valor por dias alugados: R$%.2f%n", qtdDia * 90.0);
		System.out.printf("Valor por Km percorridos: R$%.2f%n", kmPercorrido * 0.20);
		valorTotal = qtdDia * 90.0 + kmPercorrido * 0.20;
		System.out.printf("Valor Total: %.2f%n", valorTotal);
		
		sc.close();
		
	}

}
