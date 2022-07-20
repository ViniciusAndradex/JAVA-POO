package list.application;

import java.util.Scanner;

import list.entites.JoKenPo;

public class Desafio_Atv31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int j1 = 0, j2 = 0;
		boolean isTrue= false;
		char valid = ' ';
		String nomeJ1 = " ", nomeJ2  = " ";
		
		do {
			System.out.print("NICKNAME JOGADOR1: ");
			nomeJ1 = sc.nextLine();
			System.out.print("NICKNAME JOGADOR2: ");
			nomeJ2 = sc.nextLine();
			System.out.println();
			
			while (j1 > 3 || j1 < 1) {
				System.out.printf("[1] PEDRA | [2] PAPEL | [3] TESOURA {%s}: ", nomeJ1);
				j1 = sc.nextInt();
			}
			while (j2 > 3 || j2 < 1) {
				System.out.printf("[1] PEDRA | [2] PAPEL | [3] TESOURA {%s}: ", nomeJ2);
				j2 = sc.nextInt();
			}
			
			JoKenPo partida = new JoKenPo(j1, j2, nomeJ1, nomeJ2);
			
			System.out.println();
			System.out.println("RESULTADO: " + partida);
			System.out.println();
			
			while (valid != 'S' && valid != 'N' ) {
				System.out.println("Deseja jogar novamente [S][N]?");
				valid = sc.next().charAt(0);
				System.out.println();
			}
			
			if (valid == 'N')
				isTrue = true;
			else
				valid = ' ';
			 	j1 = j2 = 0;
			
		} while(isTrue == false);
		
		sc.close();
		
	}

}
