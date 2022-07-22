package list.application;

import java.util.Scanner;

import list.entites.WalkPay;

public class Atv36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		WalkPay user = new WalkPay();
		
		System.out.print("HORAS DE ATIVIDADE FISICA PRATICADA POR MES: ");
		user.setHoraMensal(sc.nextInt());
		
		System.out.println("PONTOS COLETADOS: " + user.totalPontos(user.getHoraMensal()));
		System.out.printf("VALOR COLETADO: R$%.2f%n", user.faturamento());
		
		sc.close();
		
	}

}
