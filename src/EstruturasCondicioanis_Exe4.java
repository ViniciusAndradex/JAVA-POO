import java.util.Scanner;

public class EstruturasCondicioanis_Exe4 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int inicial, h_final, hora;
		
		System.out.print("Hora Inicial: ");
		inicial = sc.nextInt();
		System.out.print("Hora Final: ");
		h_final = sc.nextInt();
		
		if (inicial < h_final) {
			hora = h_final - inicial;
		}
		else {
			hora = 24 - inicial + h_final;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", hora);
		
		sc.close();
		
	}

}
