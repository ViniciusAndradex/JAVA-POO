package list.application;

import java.util.Scanner;

import list.entites.Triangle;

public class Desafio_Atv30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a, b, c;

		System.out.print("A: ");
		a = sc.nextDouble();
		System.out.print("B: ");
		b = sc.nextDouble();
		System.out.print("C: ");
		c = sc.nextDouble();

		Triangle tri = new Triangle(a, b, c);
		
		System.out.println(isTiangle(tri) + tri.tipoTriangulo());
		
		sc.close();
	
	}
	
	public static String isTiangle(Triangle a) {
		String resp;
		if (a.triangulo() == true)
			resp = "| E possivel formar um triangulo | ";
		else
			resp = "| Nao e possivel formar um triangulo | ";
		return resp;
	}

}
