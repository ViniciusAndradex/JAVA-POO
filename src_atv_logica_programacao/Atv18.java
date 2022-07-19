import java.util.Locale;
import java.util.Scanner;

public class Atv18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int anoNascimento, idade;
		
		System.out.print("Ano de nascimento: ");
		anoNascimento = sc.nextInt();
		idade = 2022 - anoNascimento;
		
		System.out.println("Voce tem " + idade + " anos.");
		
		if (idade >= 16) 
			System.out.println("STATUS: APTO A VOTAR");
		else
			System.out.println("STATUS: INAPTO A VOTAR");
			
		sc.close();
		
	}

}
