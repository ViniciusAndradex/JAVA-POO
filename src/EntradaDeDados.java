import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: "+ x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: "+ y);

		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou: "+ z);

		char p;
		p = sc.next().charAt(0);
		System.out.println("Você digitou: "+ p);
		
		//Este nextLine() está aqui para consumir o buffer de leitura do dado anterior ou seja o enter que você dá.
		sc.nextLine();
		
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
		
	}

}
