package list.entites;

public class JoKenPo {

	private int j1, j2;
	private String nome1, nome2;
	
	public JoKenPo(int j1, int j2, String nome1, String nome2) {
		this.j1 = j1;
		this.j2 = j2;
		this.nome1 = nome1;
		this.nome2 = nome2;
	}
	
	public int jogadas() {
		int result = 0;
		
		if (j1 == 1) {
			if (j2 == 1)
				result = 0;
			else if (j2 == 2)
				result = j2;
			else
				result = j2;
		}
		else if (j1 == 2) {
			if (j2 == 1)
				result = j2;
			else if (j2 == 2)
				result = 0;
			else
				result = j1;
		}
		else if (j1 == 3){
			if (j2 == 1)
				result = j2;
			else if (j2 == 2)
				result = j1;
			else
				result = 0;
		}
		return result;
	}
	
	public String player() {
		String nome;
		
		if (jogadas() == 0) 
			nome = "DRAW";
		else if (jogadas() == 1)
			nome = nome1 + " WIN";
		else
			nome = nome2 + " WIN";
		return nome;
	}
	
	public String toString() {
		return player();
	}
	
}
