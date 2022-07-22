package list.entites;

public class Bank {
	
	private double casa, salario;
	private int anosFinanciados;
	
	public double getCasa() {
		return casa;
	}

	public double getSalario() {
		return salario;
	}

	public int getAnosFinanciados() {
		return anosFinanciados;
	}
	
	public Bank(double casa, double salario, int anosFinanciados) {
		this.casa = casa;
		this.salario = salario;
		this.anosFinanciados = anosFinanciados;
	}
	
	public double prestacaoMensal(double casa, int anosFinancioados) {
		return casa / (anosFinanciados * 12);
	}
	
	
	
}
