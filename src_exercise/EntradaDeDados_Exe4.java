import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados_Exe4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, numHour;
		double valHour;
		
		System.out.print("Numero: ");
		number = sc.nextInt();
		System.out.print("Numero de horas trabalhadas: ");
		numHour = sc.nextInt();
		System.out.print("Valor por hora: U$");
		valHour = sc.nextDouble();
		
		System.out.println("NUMBER = "+ number);
		System.out.printf("SALARY = U$%.2f%n", numHour * valHour);
		
		sc.close();
		
	}

}
