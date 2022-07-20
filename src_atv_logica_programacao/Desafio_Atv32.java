
import java.util.Scanner;

public class Desafio_Atv32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jogada =0;
		boolean teste = false;
		
		do {
			while (jogada < 1 || jogada > 5) {
				System.out.println("Tente adivinhar o número do bot [1/5]: ");
				jogada = sc.nextInt();
			}
			
			double bot = (Math.random() * 5) + 1;
				
			if ( jogada == (int) bot) { 
				System.out.println("PARABENS VOCE ACERTOU");
				teste = true;
			}
			else
				System.out.println("VOCE ERRO O BOT JOGOU " + (int) bot);
			
			jogada = 0;
			
		} while (teste == false);
		
		
		
		sc.close();
	}

}
