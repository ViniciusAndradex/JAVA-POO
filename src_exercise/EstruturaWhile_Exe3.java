import java.util.Scanner;

public class EstruturaWhile_Exe3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int caso = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		while (caso != 4) {
			System.out.printf("1.Alcool%n2.Gasolina%n3.Diesel%n4.Fim%n");
			caso = sc.nextInt();
			if (caso == 1)
				alcool += 1;
			else if (caso == 2)
				gasolina += 1;
			else if(caso == 3)
				diesel += 1;
			System.out.println();
		}
		
		System.out.printf("MUITO OBRIGRADO%nAlcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
		
		sc.close();
		
	}

}
