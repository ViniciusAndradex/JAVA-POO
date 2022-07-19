package list.entites;

public class Triangle {
	private double a, b, c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean triangulo() {
		boolean teste;
		
		if (a < b + c && b < c + a && c < a + b) {
			teste = true;
		}
		else 
			teste = false;
		
		return teste;
	}
	
	private String resposta() {
		String resp;
		if (triangulo() == true)
			resp = "E possivel formar um triangulo!";
		else
			resp = "Nao e possivel formar um triangulo";
		return resp;
	}
	
	public String toString() {
		return resposta();
	}
	
}
