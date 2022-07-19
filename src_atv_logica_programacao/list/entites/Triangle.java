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
	
	public String tipoTriangulo() {
		String tipo;
		if (a == b && b == c) 
			tipo = "EQUILATERO";
		else if (a == b && b != c)
			tipo = "ISOSCELES";
		else 
			tipo = "ESCALENO";
		return tipo;
	}

}
