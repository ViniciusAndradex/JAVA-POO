import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EstruturasCondicioanis_Exe3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b;
		boolean multiplo = false;
		
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		
		if (b > a) {
			if (b % a == 0) {
				multiplo = true;
			}
			
		}
		else {
			if (a % b == 0) {
				multiplo = true;
			}
		}
		
		if (multiplo == true) {
			System.out.println("SAO MULTIPLOS");
		}
		else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();
		
	}

}
