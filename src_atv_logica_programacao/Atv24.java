import java.util.Scanner;

public class Atv24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double kmPercorrido, preco;
		
		System.out.print("Quanto deseja percorrer: ");
		kmPercorrido = sc.nextDouble();
		
		if (kmPercorrido <= 200) {
			preco = kmPercorrido * 0.50;
			System.out.printf("Valor Total: R$%.2f%n", preco);
		}
		else {
			preco = kmPercorrido * 0.45;
			System.out.printf("Valor Total: R$%.2f%n", preco);
		}
		
		sc.close();
		
	}

}
