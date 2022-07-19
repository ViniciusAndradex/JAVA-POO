import java.util.Scanner;

public class Atv22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int anoNascimento, idade;

		System.out.print("Ano de nascimento: ");
		anoNascimento = sc.nextInt();
		idade = 2022 - anoNascimento;
		
		System.out.println("ALISTAMENTO");
		System.out.println("Voce tem " + idade + " anos.");

		if (idade == 18)
			System.out.println("STATUS: MOMENTO CORRETO");
		else if (idade > 18) {
			int dif = idade - 18;
			System.out.println("STATUS: PASSOU DO PRAZO POR " + dif + " ANOS.");
		}
		else {
			int dif = 18 - idade;
			System.out.println("STATUS: FALTAM " + dif + " ANOS.");
		}
			
		
		
		
		
		sc.close();
		
	}

}
