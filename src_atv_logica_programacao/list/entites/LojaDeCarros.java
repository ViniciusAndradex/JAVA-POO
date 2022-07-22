package list.entites;

public class LojaDeCarros {

	private int tipoCarro, diasAluguel;
	private double kmPercorrido;
	
	public int getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(int tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public int getDiasAluguel() {
		return diasAluguel;
	}

	public void setDiasAluguel(int diasAluguel) {
		this.diasAluguel = diasAluguel;
	}

	public double getKmPercorrido() {
		return kmPercorrido;
	}

	public void setKmPercorrido(double kmPercorrido) {
		this.kmPercorrido = kmPercorrido;
	}

	public double valorCarro(int tipoCarro) {
		
		return (tipoCarro == 1) ? 150.0 : 90.0;
		
	}
	
	public double valorFinal(double kmPercorrido, int diasAluguel) {
		double result = 1;
		
		if (valorCarro(getTipoCarro()) == 90.0) {
			result = (valorCarro(getTipoCarro()) * diasAluguel);
			if (kmPercorrido <= 100) 
				result += kmPercorrido * 0.20;
			else
				result += kmPercorrido * 0.10;
		}
		else {
			result = (valorCarro(getTipoCarro()) * diasAluguel);
			if (kmPercorrido <= 200) 
				result += kmPercorrido * 0.30;
			else
				result += kmPercorrido * 0.25;
		}
		return result;
	}
	
	
	
	
	
	
	
	
}
