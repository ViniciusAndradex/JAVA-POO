package list.application;

import java.util.Scanner;

import list.utilities.Area;

public class Atv28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double larg = sc.nextDouble(), comp = sc.nextDouble();
		
		Area retangulo = new Area(larg, comp);
		
		if (retangulo.areaRetangulo() > 500.0)
			System.out.println("TERRENO VIP | " + retangulo.areaRetangulo() + " m2");
		else if (retangulo.areaRetangulo() < 100)
			System.out.println("TERRENO POPULAR | " + retangulo.areaRetangulo() + " m2");
		else
			System.out.println("TERRENO MASTER | " + retangulo.areaRetangulo() + " m2");
		
		sc.close();
		
	}

}
