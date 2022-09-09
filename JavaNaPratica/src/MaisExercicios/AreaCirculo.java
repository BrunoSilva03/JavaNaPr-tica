package MaisExercicios;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int raio = 8;
		double area;
		double pi = Math.PI;
		double potencia = Math.pow(raio, pi);
		
		area = pi * potencia;
		System.out.println("Area do círculo = " + (float)area);
		
	}

}
