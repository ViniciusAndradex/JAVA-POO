import java.util.Scanner;

public class Atv27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double n1, n2, media;

		System.out.print("N1: ");
		n1 = sc.nextDouble();
		System.out.print("N2: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2) / 2.0;

		if (media >= 7.0)
			System.out.printf("Media: %.2f%nSTATUS: APROVADO",media);
		else if (media <= 4.9)
			System.out.printf("Media: %.2f%nSTATUS: REPROVADO",media);
		else
			System.out.printf("Media: %.2f%nSTATUS: RECUPERAÇAO",media);

		sc.close();
		
		
		
		
		
	}

}
