import java.util.Locale;
import java.util.Scanner;

public class EstruturasCondicioanais_Exe5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtd;
		Double tot_pagar;
		
		System.out.printf("1 cachorro quente R$4.00%n2 x-salada R$4.50%n3 x-bacon R$5.00%n");
		System.out.printf("4 torrada simples R$2.00%n5 refrigerante R$1.50%n");
		cod = sc.nextInt();
		System.out.print("Quantidade: ");
		qtd = sc.nextInt();
		
		if (cod == 1 ) {
			tot_pagar = 4.00 * qtd;
		}
		else if(cod == 2) {
			tot_pagar = 4.50 * qtd;
		}
		else if (cod == 3) {
			tot_pagar = 5.00 * qtd;
		}
		else if (cod == 4) {
			tot_pagar = 2.00 * qtd;
		}
		else if (cod == 5) {
			tot_pagar = 1.50 * qtd;
		}
		else {
			tot_pagar = null;
		}
			
		System.out.printf("TOTAL: R$%.2f%n", tot_pagar);
		
		
		sc.close();
		
	}

}
