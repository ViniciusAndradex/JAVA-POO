import java.util.Scanner;

public class EntradaDeDados_Exe3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, dif;
		
		System.out.print("Digite A: ");
		a = sc.nextInt();
		System.out.print("Digite B: ");
		b = sc.nextInt();
		System.out.print("Digite C: ");
		c = sc.nextInt();
		System.out.print("Digite D: ");
		d = sc.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.println("Diferença = " + dif);
		
		sc.close();
		
	}

}
