package list.utilities;

public class IMC {
	
	private double altura, peso;
	
	public IMC(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public double faixaValor() {
		return peso / (Math.pow(altura, 2));
	}
	
	public String indice() {
		String result;
		
		if (faixaValor() < 18.5)
			result = "ABAIXO DO PESO";
		else if (faixaValor() < 25)
			result = "PESO IDEAL";
		else if (faixaValor() < 30) 
			result = "SOBREPESO";
		else if (faixaValor() < 40)
			result = "OBESIDADE";
		else
			result = "OBESIDADE MORBIDA";
		
		return result;
		
	}
	
	
}
