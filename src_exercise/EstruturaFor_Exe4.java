import java.util.Scanner;

public class EstruturaFor_Exe4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("Divisao Impossivel");
			}
			else {
				System.out.println("Divisao de " + a + " por " + b + " = " + ((double) a / b) );
			}
			
		}
		
		sc.close();
		
	}

}
