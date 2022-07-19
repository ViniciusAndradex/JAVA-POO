import java.util.Scanner;

public class Atv11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		System.out.print("C: ");
		c = sc.nextInt();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		System.out.println("DELTA: " + delta);
		
		sc.close();
		
	}

}
