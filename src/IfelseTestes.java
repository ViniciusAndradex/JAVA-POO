
public class IfelseTestes {

	public static void main(String[] args) {
		
		int x = 5;
		
		if (x < 5 || x >=5) {
			System.out.println("Olá");
		}
		
		if (x < 5) {
			System.out.println("Olá");
		}
		else {
			System.out.println("Deu Ruim");
		}
		
		if (x < 5) {
			System.out.println("A");
		}
		else {
			if (x < 4) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
		}
	}

}
