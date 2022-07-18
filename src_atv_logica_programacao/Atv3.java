import java.util.Locale;
import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario;
		
		System.out.print("Nome do Funcionário: ");
		nome = sc.nextLine();
		System.out.print("Salário: R$");
		salario = sc.nextDouble();
		
		System.out.println("O funcionário " + nome + " tem um salário de R$" + salario + " em Junho.");
		
		sc.close();
		
	}

}
