import java.util.Scanner;

public class BitWiseExemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 89, n2 = 60;
		int mask = 32, n = sc.nextInt();
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		if ((n & mask) != 0) 
			System.out.println("6° bit is true!");
		else
			System.out.println("6° bit is false!");
		
		sc.close();
		
	}

}
