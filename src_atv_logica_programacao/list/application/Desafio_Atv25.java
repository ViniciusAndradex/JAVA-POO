package list.application;

import java.util.Scanner;

import list.entites.Triangle;

public class Desafio_Atv25 {

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
		
		tri.triangulo();
		System.out.println(tri);
		
		sc.close();
		
	}

}
