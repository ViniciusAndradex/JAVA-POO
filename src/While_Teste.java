import java.util.Scanner;

public class While_Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), sum = 0;
		
		while (x != 0) {
			sum += x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma = " + sum);
		sc.close();
		
	}

}
