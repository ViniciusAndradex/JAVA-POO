import java.util.Scanner;

public class For_Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), sum = 0;
		
		for (int i = 0 ; i < n ; i++) {
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println(sum);
		
		sc.close();
		
		
	}

}
