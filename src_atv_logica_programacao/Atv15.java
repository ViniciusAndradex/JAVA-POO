import java.util.Scanner;

public class Atv15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int diasTrabalhados;
		double salario;
		final double metrica = 8 * 25;
		
		System.out.print("Dias Trabalhados: ");
		diasTrabalhados = sc.nextInt();
		salario = metrica * diasTrabalhados;
		
		System.out.printf("Seu salario foi de R$%.2f", salario);
		
		sc.close();
		
	}

}
