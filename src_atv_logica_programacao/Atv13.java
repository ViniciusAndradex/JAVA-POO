import java.util.Locale;
import java.util.Scanner;

public class Atv13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		System.out.print("Salario: R$");
		salario = sc.nextDouble();
		
		System.out.printf("Novo salario com 15%% de aumento %.2f%n", ((salario * 15 /100) + salario));
		
		sc.close();
		
	}

}
