package MaisExercicios;

public class TesteCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;  // declaração normal de uma variável do tipo int
		double y = x; //valor de x convertido para double, casting implícito
		long z = 10L; //por padrão o 10 é um int, depois convertido para long
		
		float w = 10.0F; //por padrão 10.0 é um double, depois convertido para float
		int r = (int)14.5; //casting explícito, converte double para int truncando
		                   //o valor decimal
		byte b = 127; // o tipo byte só vai até 127, mais do que isso não aceita
		
		System.out.println(x + ", " + y + ", " + z + ", " + w + ", " + r + ", " + b);
	}

}
