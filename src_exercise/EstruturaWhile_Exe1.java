import java.util.Scanner;

public class EstruturaWhile_Exe1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("SENHA INVALIDA");
			senha = sc.nextInt();
		}
		
		System.out.println("ACESSO PERMITIDO");
		
		sc.close();
		
	}

}
