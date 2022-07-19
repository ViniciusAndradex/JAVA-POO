import java.util.Locale;
import java.util.Scanner;

public class Atv12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco;
		
		System.out.print("Valor do produtor: R$");
		preco = sc.nextDouble();
		
		System.out.println("Valor do produto com 5% de desconto R$" + (preco - (preco * 5 /100)));
		
		sc.close();
		
	}

}
