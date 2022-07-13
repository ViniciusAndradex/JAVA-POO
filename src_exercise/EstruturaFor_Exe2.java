import java.util.Scanner;

public class EstruturaFor_Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), in = 0, out = 0;
		
		for (int i = 0; i < n ; i++) {
			int c = sc.nextInt();
			if (c >= 10 && c <=20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " IN");
		System.out.println(out + " OUT");
		
		sc.close();
		
	}

}
