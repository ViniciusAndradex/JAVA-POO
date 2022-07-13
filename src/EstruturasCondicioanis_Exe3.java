import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EstruturasCondicioanis_Exe3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, mult;
		
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		
		if (b > a) {
			mult = b / a;
			if (mult % a == 0) {
				System.out.println("SAO MULTIPLO");
			}
			else {
				System.out.println("NAO SAO MULTIPLO");
			}
		}
		else {
			mult = a / b;
			if (mult % a == 0) {
				System.out.println("SAO MULTIPLO");
			}
			else {
				System.out.println("NAO SAO MULTIPLO");
			}
		}
		
		
		sc.close();
		
	}

}
