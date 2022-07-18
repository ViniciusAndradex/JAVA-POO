import java.util.Scanner;

public class Atv6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		
		System.out.println("O antecessor de " + a + " é " + (a - 1));
		System.out.println("O sucessor de " + a + " é " + (a + 1));
		
		sc.close();
		
	}

}
