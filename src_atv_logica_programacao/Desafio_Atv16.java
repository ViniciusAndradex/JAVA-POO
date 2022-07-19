import java.util.Scanner;

public class Desafio_Atv16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qtdCigarroDia, qtdCigarroAnos;
		double diasPerdidos;
		
		System.out.print("Quantidade de Cigarros por dia: ");
		qtdCigarroDia = sc.nextInt();
		System.out.print("Quantidade de anos como fumante: ");
		qtdCigarroAnos = sc.nextInt();
		
		diasPerdidos = (double) ((qtdCigarroDia * 10) * (qtdCigarroAnos * 365) / 60)/24 ;
		
		System.out.printf("Quantidade de dias perdidos %.1f", diasPerdidos);
		
		sc.close();
		
	}

}
