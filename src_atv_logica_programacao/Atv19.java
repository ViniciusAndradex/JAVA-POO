import java.util.Scanner;

public class Atv19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double n1, n2, media;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("N1: ");
		n1 = sc.nextDouble();
		System.out.print("N2: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2) / 2.0;
		
		System.out.println("NOME: " + nome);
		
		if (media >= 7.0) {
			System.out.println("MEDIA: " + media);
			System.out.println("STATUS: APROVADO");
		}
		else {
			System.out.println("MEDIA: " + media);
			System.out.println("STATUS: REPROVADO");
		}
			
		sc.close();
		
	}

}
