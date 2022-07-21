import java.util.Scanner;

public class Atv33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorCasa, salario, prestacao;
		int anosFinanciamento;
		
		System.out.print("Valor da casa: R$");
		valorCasa = sc.nextDouble();
		System.out.print("Salario: R$");
		salario = sc.nextDouble();
		System.out.print("Quantidade de anos: ");
		anosFinanciamento = sc.nextInt();
		
		prestacao = valorCasa / (anosFinanciamento * 12);
		
		if (salario * 30 /100 >= prestacao) {
			System.out.printf("Aprovado, valor mensal R$%.2f%n", prestacao);
		}
		else
			System.out.printf("Negado, valor mensal R$%.2f e o valor excede 30%% do salario.", prestacao);
		
		sc.close();
		
	}

}
