package MaisExercicios;

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampada lamp = new Lampada();
		
		lamp.SetDesligar(false);
		System.out.println(lamp.GetImprimir());
		lamp.SetLigar(true);
		System.out.println(lamp.GetImprimir());
		
		

	}

}
