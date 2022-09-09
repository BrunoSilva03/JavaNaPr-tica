package MaisExercicios;

public class Lampada {
	private boolean ligada;
	
	 public void SetDesligar(boolean lig) {
		this.ligada = lig;
		
	}
	
	 public void SetLigar(boolean deslig) {
		this.ligada = deslig;
		
	}
	
	 public boolean GetImprimir() {
		return this.ligada;
	}

}
