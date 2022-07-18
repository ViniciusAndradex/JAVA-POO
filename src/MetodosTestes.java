import java.util.Scanner;

public class MetodosTestes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		showResult(max(a, b, c));
		
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int high;
		
		if (x > y && x > z) 
			high = x;
		else if (y > x && y > z) 
			high = y;
		else 
			high = z;
		
		return high;
	}

	public static void showResult(int h) {
		System.out.println("Higher = " + h);
	}
	
}
