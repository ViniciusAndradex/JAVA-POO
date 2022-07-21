package list.entites;

public class WalkPay {

	private int horaMensal;

	public int getHoraMensal() {
		return horaMensal;
	}

	public void setHoraMensal(int horaMensal) {
		this.horaMensal = horaMensal;
	}
	
	public int totalPontos(int horaMensal) {
		int pontosMensal;
		
		if (horaMensal < 10) 
			pontosMensal = 2 * horaMensal;
		else if (horaMensal < 20) 
			pontosMensal = 5 * horaMensal;
		else
			pontosMensal = 10 * horaMensal;
		return pontosMensal;
	}
	
	public double faturamento() {
		return totalPontos(getHoraMensal()) * 0.05;
	}
	
	
}
