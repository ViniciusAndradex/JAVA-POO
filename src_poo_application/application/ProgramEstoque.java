package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class ProgramEstoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		prod.setName(sc.next());
		System.out.print("Price: ");
		prod.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");
		prod.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Product data: " + prod);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		prod.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + prod);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		prod.removeProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updated data: " + prod);
		
		sc.close();
		
	}

}
