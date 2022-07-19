import java.util.Scanner;

public class Atv21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano = sc.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0) 
			System.out.println(ano + " E BISSEXTO");
		else
			System.out.println(ano + " NAO BISSEXTO");
		
		sc.close();
		
	}

}
