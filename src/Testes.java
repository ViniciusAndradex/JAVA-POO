import java.util.Locale;

public class Testes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int x = 12;
		double y = 12.9997;
		System.out.println(x);
		System.out.printf("%.4f%n", y);
	}

}
