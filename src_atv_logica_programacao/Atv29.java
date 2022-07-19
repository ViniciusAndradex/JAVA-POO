import java.util.Scanner;

public class Atv29 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario;
		int anosTrabalhados;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Salario: R$");
		salario = sc.nextDouble();
		System.out.print("Anos de trabalaho: ");
		anosTrabalhados = sc.nextInt();
		
		System.out.println("Nome: " + nome);
		if (anosTrabalhados < 3) 
			System.out.printf("REAJUSTE 3%% NOVO SALARIO R$%.2f", (salario * 3 / 100) + salario);
		else if (anosTrabalhados >= 10) 
			System.out.printf("REAJUSTE 20%% NOVO SALARIO R$%.2f", (salario * 20 / 100) + salario);
		else
			System.out.printf("REAJUSTE 12.5%% NOVO SALARIO R$%.2f", (salario * 12.5 / 100) + salario);
		
		sc.close();
		
	}

}
