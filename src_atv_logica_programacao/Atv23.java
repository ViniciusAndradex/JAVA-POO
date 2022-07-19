import java.util.Scanner;

public class Atv23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double preco;
		char sexo;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Sexo [f/m]: ");
		sexo = sc.next().charAt(0);
		System.out.print("Preco: R$");
		preco = sc.nextDouble();
		
		if (sexo == 'f') 
			System.out.printf("Valor total: R$%.2f%n", (preco * 13 / 100) + preco);
		else 
			System.out.printf("Valor total: R$%.2f%n", (preco * 5 / 100) + preco);
		
		sc.close();
		
	}
	
}
