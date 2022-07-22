package list.application;

import java.util.Scanner;

import list.entites.LojaDeCarros;

public class Atv35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LojaDeCarros user = new LojaDeCarros();
		
		
		do {
			
			System.out.println("-- MENU --");
			System.out.println("[1] Carro de Luxo");
			System.out.println("[2] Carro popular");
			System.out.println("[0] Sair");
			user.setTipoCarro(sc.nextInt());
			
			if (user.getTipoCarro() == 1) {
				System.out.printf("VALOR DO CARRO: R$%.2f%n", user.valorCarro(user.getTipoCarro()));
				System.out.print("KM PERCORRIDOS: ");
				user.setKmPercorrido(sc.nextDouble());
				System.out.print("DIAS ALUGADOS: ");
				user.setDiasAluguel(sc.nextInt());
				System.out.printf("VALOR FINAL: R$%.2f%n", user.valorFinal(user.getKmPercorrido(), user.getDiasAluguel()));
			}
			else if (user.getTipoCarro() == 2) {
				System.out.printf("VALOR DO CARRO: R$%.2f%n", user.valorCarro(user.getTipoCarro()));
				System.out.print("KM PERCORRIDOS: ");
				user.setKmPercorrido(sc.nextDouble());
				System.out.print("DIAS ALUGADOS: ");
				user.setDiasAluguel(sc.nextInt());
				System.out.printf("VALOR FINAL: R$%.2f%n", user.valorFinal(user.getKmPercorrido(), user.getDiasAluguel()));
			}
			
			System.out.println();
			
		} while (user.getTipoCarro() != 0);
			
		
		
		
		
		
		sc.close();
		
	}

}
