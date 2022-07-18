import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Digite um valor: ");
		a = sc.nextInt();
		System.out.print("Digite outro valor: ");
		b = sc.nextInt();
		
		System.out.printf("A soma entre %d e %d é igual a %d%n", a, b, a+b);
		
		sc.close();
		
	}

}
