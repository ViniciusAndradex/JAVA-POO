import java.util.Scanner;

public class EstruturaFor_Exe5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), fact = 1;
		
		for (int i = n; i > 0 ; i--) {
			if (n == 0)
				fact = 1;
			else
				fact *= i;
		}
		
		System.out.println(fact + " ");
		
		sc.close();
		
	}

}
