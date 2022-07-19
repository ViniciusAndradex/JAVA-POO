package list.utilities;

public class Area {

	private double largura, comprimento;
	
	//Area Retangulo.
	public Area(double largura, double comprimento) {
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	public double areaRetangulo() {
		return largura * comprimento;
	}
	
}
