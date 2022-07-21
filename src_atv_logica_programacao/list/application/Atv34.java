package list.application;

import java.util.Scanner;

import list.utilities.IMC;

public class Atv34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peso, altura;
		
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		
		IMC teste = new IMC(altura, peso);
		
		System.out.printf("AVALIACAO: %.2f%nSTATUS: %s", teste.faixaValor(), teste.indice());
		
		sc.close();
	
	}

}
