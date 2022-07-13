import java.util.Scanner;

public class EstruturasCondicioanais_Exe1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um numero: ");
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
			
		sc.close();
		
	}

}
